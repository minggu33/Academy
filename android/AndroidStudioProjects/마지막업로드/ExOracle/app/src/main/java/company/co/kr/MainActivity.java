package company.co.kr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

//activity_main.xml의 레이아웃을 이용하여  id, pass 란에 입력한 데이터를?
//외부 웹서버(톰캣서버)가 실행해서 읽어 들이는  jsp페이지에 전달 시키기 위한 작업을 해보자.

public class MainActivity extends Activity {

    //전역변수
    EditText idedit, passedit, nameedit, phoneedit, emailedit;
    Button insert, allsearch;
    //호출대상(JoinMember.jsp)에 접속해야할 웹서버 주소 설정
    String uri = "http://192.168.2.200:8090/ExTest/insertMember.jsp";

    //URL 객체를 저장할 변수
    // 자바 네트워크의 URL객체를 통해 접속!!
    // -> 네트웍 주소나 리소스에 접근하기 위한 객체
    URL url;

    //해당 웹서버에 데이터를 보내기 또는 받기 위한 용도의 객체를 저장할 변수
    URLConnection urlconn;

    String paramName = "id";
    String paramValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activity_main.xml로 부터 작성한  EditText2개와 Button 얻기
        idedit = (EditText) findViewById(R.id.editid);
        passedit = (EditText) findViewById(R.id.editpass);
        nameedit = (EditText) findViewById(R.id.editname);
        phoneedit = (EditText) findViewById(R.id.editphone);
        emailedit = (EditText) findViewById(R.id.editemail);
        insert = (Button) findViewById(R.id.insert);
        allsearch = (Button) findViewById(R.id.allsearch);
    }

    //insert버튼을 눌렀을때  외부 웹서버측의 서버페이지 쪽으로 데이타 넘겨주기 위한 메소드
    public void setData(View v){
        //insert버튼을 눌렀을때....입력한 정보를  외부 jsp에 전달하기
        if(v.getId() == R.id.insert) {
            //ConnectHttp객체의 doInBackground(Void... params) 메소드를 호출 하는 구문
            new ConnectHttp().execute();
            //insert버튼 누를시.. 회원리스트를 보여주는 서브화면으로 이동 시키기
            Intent intent = new Intent().setClass(this,MemberListActivity.class);
            startActivity(intent);
        //allSearch버튼을 눌렀을때... DB에 저장된 모든 회원정보 검색
        }else if(v.getId() == R.id.allsearch){
            //allSearch버튼 누를시.. 회원리스트를 보여주는 서브화면으로 이동 시키기
            Intent intent = new Intent().setClass(this,MemberListActivity.class);
            startActivity(intent);
        }
    }
    /*
    AsyncTask클래스가 하는일?
    - 안드로이드의 작업스레드와 관련된 복잡한 부분을 처리해 주는 클래스임.
    - 작업 스레드 안에서 주어진 작업을 수행하며 결과를 UI스레드(주스레드)로 전달 한다.
    - AsyncTask클래스를 상속받아 사용하면? 개발자가 스레드를 처리하거나 핸들러를 만들 필요가 없다.
    - AsyncTask클래스의 제네릭 타입 지정하기
                        <실행시에 작업에 전달되는 값의 타입,
                          작업의 진행 정도를 나타내는 값의 타입,
                          작업의 결과값을 나타내는 값의 타입>
        제네렉 타입 지정 하지 않으려면 모두 Void로 지정 한다.
    */
//외부 웹서버에 연결해주는 소스 !
//내부클래스로 만들기   -> AsyncTask클래스<제네릭타입>으로 상속 받기
    private class ConnectHttp extends AsyncTask<Void, Void, Void> {


        /*작업스레드 에서 수행해야하는 작업 기술*/
        //위의?  setData메소드 내부의 --> new ConnectHttp().execute()메소드 호출시 실행됨
        @Override
        protected Void doInBackground(Void... params) {

            try{
                //AVD에서 입력 받은 데이터를 얻어옴
                String id = idedit.getText().toString().trim();
                String pass = passedit.getText().toString().trim();
                String name = nameedit.getText().toString().trim();
                String phone = phoneedit.getText().toString().trim();
                String email = emailedit.getText().toString().trim();



                //입력받은 데이터를 하나로 만들어서 보내기 위한 준비
                //----실제 데이터를 넘겨주는 변수
                String data = "id="+id +"&pass="+pass + "&name=" + name + "&phone="+phone + "&email=" + email;

           

                //http프로토콜(웹)을 통하여 웹서버에 접속하기
                url = new URL(uri);


                /*URLConnection 객체 가 하는일 :
                1.안드로이드 AVD에서 적은 데이터를 웹서버로 내보내기 위한 용도.
                2.해당 URL(톰켓웹서버)에서 페이지 정보를 가져오기 위한 용도.
                */

                //openConnection() 메서드는 지정된 URL(웹서버의 jsp파일)에 대한 소켓 통로를 열고
                // URLConnection 객체를 반환한다
                urlconn = url.openConnection();

                //웹서버로 데이터 출력(보내기)을 위한 출력 스트림 사용 여부 true
                urlconn.setDoOutput(true);

                //출력스트림을 통하여 데이터가 넘어감.
                OutputStream out = urlconn.getOutputStream();

                //실제 데이터를 넘기기
                out.write(data.getBytes("UTF-8"));

                //출력스트림에 데이터가 가득차지 않아도 보내기위해 비우기
                out.flush();

                //응닶을 받기위해 (데이터를 읽어오기위한 스트림통로 만들기)
                InputStream in = urlconn.getInputStream();

                //자원사용후 자원해제
                in.close();
                out.close();

            }catch (Exception e) {
                e.printStackTrace();
            }


            return null;
        }
    }




}
