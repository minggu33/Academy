package company.co.kr;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Vector;

/** [ 가입된 회원의 목록 을 리스트 형식으로 보여줄 화면 ]
 *
 * ListActivity클래스를 상속 받기 때문에..
 * 굳이 xml형식의 레이아웃은 만들지 않아도 된다.
 */
public class MemberListActivity extends ListActivity{
    /*
        모든 사람의 정보를 받아온다 (이름,전화번호)
        고정적인 사람들의 이름,전화번호를 받아오는것이아니라서..
        가변적으로 늘어나는 컬렉션 백터 저장소를 사용하겠다.

       */
    //이름을 저장하는 객체
    Vector<String> namevec;
    //전화번호를 저장하는 객체
    Vector<String> phonevec;

    /*
    별도의 GetData클래스를 이용하여
    이름과 전화번호를 저장해주는 객체 생성
    */
    GetData getdata = new GetData();

    /*
    GetData객체로 부터 전달받은???...
    namevec백터와 phonevec백터를???...
    하나의 문자열로 만들어서 넣을 또다른 새로운 백터객체를 만들자
    */
    Vector<String> totaldata = new Vector<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*가입된 회원의  이름, 전화번호 정보만 가져오는 부분*/

        //Getdata 클래스의 doinbackground메소드가 호출됨
        getdata.execute();

        //데이터를 가져올떄까지 무한 반복 스레드 돌린다
        while (true) {

            try {
                //스레드 1초에 한번씩 호출
                Thread.sleep(1000);

                //Cpu가..? 해당 사이트를 접속해서 xml파일(회원이름,전화번호)를 읽어온다
                //네트워크를 통해서 xml 데이터를 가져왔다면(true)...
                if (getdata.flag == true) {

                    //getdata안의 정보를 MemberListActivity클래스로 가져옴
                    namevec = getdata.namevec;
                    phonevec = getdata.phonevec;

                    //더이상 쓰레드를 돌리지 마시오.
                    break;
                }

            }catch (Exception e) {
                e.printStackTrace();
            }
        }//while------

        for(int i=0; i<namevec.size(); i++) {

            //이름과 전화번호를 순서대로 가져온후 하나의 문자열로 만듬
            String data = namevec.get(i) + " : " + phonevec.get(i);

            //만든 하나의 문자열(이름+전화번호)를 ?...
            //또다른 새로운 백터객체에 넣자
            totaldata.add(data);


        }//for~~

        //리스트에 부착할 어댑터클래스를 생성
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_expandable_list_item_1, totaldata);
        //어댑터 클래스를 붙일 리스트뷰객체 얻어오기(생성)
        ListView iv = this.getListView();

        //현재 MemberListActivity에  어댑터 지정
        this.setListAdapter(adapter);

        //화면에 레이아웃을 보여주시오
        setContentView(iv);

        //리스트뷰를 클릭하면 발생하는 이벤트
        iv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //어느 레코드 데이터를 눌렀는지에 대한 정보 저장
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //해당 리스트의 어느? index를 눌렀는지(리스트목록중 하나선택)에 대한 정보를 알아온후?...
                //그정보는? position 매개변수로 넘겨받는다!!!
                //그 index의 전화번호를 앞으로 보여질 화면으로 값을 넘겨줌
                String phone = phonevec.get(position);

                //이동할 새로운 화면을 설정
                Intent intent = new Intent().setClass(MemberListActivity.this, MemberDetailActivity.class);

                //인텐트에 phone데이터를 넘겨줌
                intent.putExtra("phone",phone);

                //회원가입한  한사람에 대한 화면 띄우기
                startActivity(intent);





            }
        });



    }//onCreate-----
}//MemberListActivity---

