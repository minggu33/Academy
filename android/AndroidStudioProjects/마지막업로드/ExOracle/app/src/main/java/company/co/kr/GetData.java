package company.co.kr;


import android.os.AsyncTask;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.net.URL;
import java.util.Vector;
import java.util.logging.XMLFormatter;

/**
 * ~~~~~스레드 일처리~~~
 * 실제 Cpu가..? 해당 웹사이트를 접속해서 xml파일을 읽어오는 일
 * xml파일의 내용은  가입된 회원 이름,전화번호 이다.
 */
public class GetData extends AsyncTask<Void,Void,Void>{

    //이름을 저장하는 객체
    Vector<String> namevec  = new Vector<String>();
    //전화번호를 저장하는 객체
    Vector<String> phonevec = new Vector<String>();


    //데이터를 쓰레드를 이용하여 가져왔다면 true 바꾸기
    //데이터를 쓰레드를 이용하여 못가져 오면 false
    boolean flag = false; //못읽어 왔다는 뜻!

    //웹 사이트에 접속하여 xml 문서를 가져올 주소를 설정
    String uri="http://192.168.2.200:8090/ExTest/SelectAllMember.jsp";

    //접속할 URL
    URL Url;
    //xml문서에서 읽어드린 데이터를 저장할 변수선언
    String tagName="", name="" , phone="";


    //웹서버에 접속후
    @Override
    protected Void doInBackground(Void... params) {
        try{
            /*xml문서를 읽고 해석할 수 있는 XmlPullParser 객체를 얻는방법 2가지*/
/*
방법1. android.util패키지의 XML클래스의 static메소드에 있는 newPullParser()메소드를 호출합니다.

방법2. og.xmlpull.v1패키지의...XmlPullParserFactory클래스의 newInstance()를 호출해...
      XmlPullParserFactory객체를 취득한 후..
      취득한 XmlPullParserFactory객체의  newPullParser()를 호출합니다.
*/



            //방법2.
            //xml문서를 읽고 해석할 수 있는  XmlPullParser객체 생성을 위한 팩토리객체 얻기
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

            //네임스페이스(도메인 별칭) 사용여부
            factory.setNamespaceAware(true);

            //취득한 XmlPullParserFactory객체의  newPullParser()를 호출 하여..
            //실제 xml문서를 이용하여 이벤트를 발생시켜주는 XmlPullParser객체얻기.
            //---------xml 파싱하기 위해서 풀 파서 쓴다.
            XmlPullParser xpp = factory.newPullParser();




            //웹사이트에 접속(우리가 만든 웹서버의 SelectAllMember.jsp)
            Url = new URL(uri);

            //웹에 접속한후 문서를 읽어서 나의 안드로이드 폰으로 가져옴
            //SelectAllMember.jsp 파일 내부의 xml형태의 데이터를...
            //네트워크를 통해서 읽어 들이기 위한 스트림 통로 객체 생성
            InputStream in = Url.openStream(); //읽어왔음!

            //SelectAllMember.jsp 파일 내부의 xml형태의 데이터를 읽어 왓으면...
            //XmlPullParser객체 에 데이터를 넘겨줌!!
            //->XmlPullParser객체 에 데이터를 넘겨 주는 이유?
            //이유 : 실제 xml문서를 이용하여 이벤트를 발생시켜주면서...
            //데이터를 읽어올수 있다.
            xpp.setInput(in, "utf-8"); //XmlPullParser객체 에 데이터를 넘겨줌!!

            //문서를 읽어 들이면서 데이터 추출 이벤트를 발생
            int event = xpp.getEventType();// 파싱할 데이터의 타입을 알려준다.


            //반복문을 이용해서 문서의 끝까지 읽어들이면서 이름과 전화번호를 추출하는 소스
            while (event != XmlPullParser.END_DOCUMENT) { //문서의 끝까지 반복하면서..
                /*

                <?xml version="1.0" encoding="UTF-8"?>

                -<member>
                        -<item>
                            <id>aaa</id>
                            <pass>bbb</pass>
                            <name>ccc</name>
                            <phone>ddd</phone>
                            <email>ddd</email>
                        </item>
                */
                //위에 주석처리한!!
                // <name> 또는 <phone> 위치에 있는 ..
                // 태그를 읽어오는 이벤트가 발생하면.
                if(event == XmlPullParser.START_TAG) {
                    //처음 태그의 이름을 읽어옴 -> <name> <phonw> 를 말함
                    tagName  = xpp.getName();

                    //<name>ccc</name> 증에서 ccc자리를 TEXT자리 라고 함!!!
                    //TEXT자리의 데이터를 읽어 오는 이벤트가 발생하면....
                }else if(event==XmlPullParser.TEXT) {
                    //위의 if문에서 읽어온 태그의 이름이 <name>과 같을때..
                    if(tagName.equals("name")) {
                        /*
                         데이터를 읽어오는 부분 <--태크안의 값을 가져온다
                         += 하는 이유는 데이터가 있는만큼 끝까지 가져오기위함임.
                         태그안의 데이터를 읽어와서 name변수에 누적
                         */
                        name += xpp.getText();
                        //태크이름이 <phone> 과 같다면...
                    }else if(tagName.equals("phone")) {
                        //<phone>태그안의 데이터를 읽어와서 phone 변수에 저장시킴
                        phone += xpp.getText();
                    }

                    //태크가 마지막 </item> 일때...
                }else if(event==XmlPullParser.END_TAG) {

                    //<item>태그이름을 읽어옴
                    tagName = xpp.getName();

                    //태그이름이 <item> 태그일때...
                    if(tagName.equals("item")) {
                        //name변수에 저장한 데이터를 다시 namevec백터에 저장
                        namevec.add(name);
                        //phone변수에 저장한 데이터를 다시 phonevec백터에 저장
                        phonevec.add(phone);

                        //그다음 레코드(하나의 item태그)의...
                        //name 또는 phone 를 저장시키기 위해..
                        //변수 초기화
                        name=""; phone="";
                    }

                }
                // 처음 바깥쪽 if(event == XmlPullParser.START_TAG)문 부터 시작해서..
                // 끝 else if(event==XmlPullParser.END_TAG) 문까지 실행하면..
                // 하나의 레코드( <item></item> ) 를 모두 가져왔으면..
                // DB로 부터 전달 받아  뿌려준 xml형태의 또다른 <item></item>내부의..?
                // 다른 레코드 값 => <name>, <phone>태그의 데이터를 읽어오는 이벤트를 발생시켜야함

                //그다음 <item></item>태그의 데이터를 읽어오는 이벤트로 진행시킴
                event = xpp.next();



            }
            //모든 데이터를 읽어 드렸다면? 플래그 값을 true 로설정하고 끝내시오
            flag = true;

        }catch (Exception e) {
            e.printStackTrace();
        }



        return null;
    }
}

//다음에 할일!!!!!!!!!!!!!
/*
MemberListActivity.java  로 가서...
getdata객체로 부터 읽어들인 namevec백터,
phonevec백터  내부의 데이터를 MemberListActivity에 나타내어야 함
*/