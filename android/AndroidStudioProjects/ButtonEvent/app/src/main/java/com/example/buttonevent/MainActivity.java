package com.example.buttonevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener  {

    //버튼을 클릭하면 호출되는 콜백 메소드
    @Override
    public void onClick(View v) {
        Toast.makeText(
                getApplicationContext(),
                "버튼이 클릭되었습니다.",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id속성값이 button인 <Button>클래스에 대한 객체 얻기
        Button button = findViewById(R.id.button);
        //버튼에 이벤트를 처리할 이벤트리스너 역할을 하는 MainActivity객체(this)를 전달 하여 등록
        button.setOnClickListener(this);


        //Button객체에 클릭이벤트 등록!
 /*       button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Toast.makeText(
                                getApplicationContext(),
                                "버튼이 클릭되었습니다.",
                                Toast.LENGTH_LONG
                             ).show();

            }
        });
 */
        //내부 익명 클래스 정의 장점
        //-> 한곳에서 이벤트 처리와 관련된 모든 코드가 작성되는 장점.

    }
}






