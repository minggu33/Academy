package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // EditText 에 입력한 텍스트를 가져와서  토스트 화면에 출력 하자.

        final EditText et_InputMessage = (EditText) findViewById(R.id.search);
        //EditText객체에 해당하는 키보드에  버튼의 이미지를 '이동' -> 모양 버튼으로 바꾸기

/*
       중요!!!!!!!!!!!!!!!!!!!!!!!!!!

       EditText et_InputMessage변수 앞에 final이 붙는 이유?

       내부 무명클래스에서 EditText변수를 참조 하기 떄문이다.
       내부 클래스에서 접근하는 외부 지역변수는 반드시 final이어야합니다.
       아니면 그변수가 가리키는 객체가 바뀌지 않는다는 보장이 있어야 한다.
---------------------------------------------------------------------------------------
            아래의 간단 예제 소스로 설명 하겠습니다.

            public void onCreate(Bundle savedInstanceState){
               EditText editText = (EditText)findViewById(R.id.editText1);
                ......
                editText.setOnKeyListener(new OnKeyListener(){
                      public boolean onKey(...){
                         s = ediText.getText();
                      }
                });
                editText = (EditText)findViewById(R.id.editText2);

            }
(설명) 위의 editText.getText()호출시... editText는 어떤 객체를 가리키는가?
       editText1인가? 아니면 ediText2인가? 생성된 이벤트 리스너 객체는
       onCrate()메소드가 종료된 후에도 살아 있을수 있다.
       이벤트 리스너 객체 안의 이벤트 처리 메소드는 이벤트가 발생하면 호출됩니다.

       이런 혼란을 막기 위해 editText는 반드시 final로 지정하도록 되어 있다.
       만약  final로 지정하지 않으면 다음과 같은 오류 메세지가 표시됩니다.

-----------------------------------------------------------------------------------

 EditText객체에 해당하는 키보드에 버튼의 이미지 모양을 바꾸는 상수 값들

 // '이동' 버튼 설정
  et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_GO);
 // '확인' 버튼 설정
  et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_DONE);
 // '다음' 버튼 설정
  et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_NEXT);
 // '엔터' 버튼 설정
  et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_NONE);
 // '돋보기모양의 검색' 버튼 설정
  et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_SEARCH);
  // '전송' 버튼 설정
  et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_SEND);


*/
        et_InputMessage.setImeOptions(EditorInfo.IME_ACTION_GO);
        //사용자가 키보드의  "->"(이동)버튼을 누르면 화면에 토스트 메세지를 표시한다
        et_InputMessage.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            //사용자가 키보드의 "->"(이동)버튼을 누르면 호출되는 콜백 메소드
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                boolean handled = false;
                //누른 버튼(이벤트가 일어난 버튼)이   "->"(이동) 버튼과 같을때..
                if(actionId == EditorInfo.IME_ACTION_GO){

                    //editText에 입력된 글자를 가져와서 토스트메세지로 나타내기
                    Toast.makeText(
                            getApplicationContext(),
                            et_InputMessage.getText(),
                            Toast.LENGTH_SHORT
                    ).show();
                    handled = true;
                }

                return handled;
            }
        });





    }
}