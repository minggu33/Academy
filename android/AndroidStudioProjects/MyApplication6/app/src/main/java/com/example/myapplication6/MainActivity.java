package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPrev, btnNext;
        final ViewFlipper vFlipper;

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext =  (Button) findViewById(R.id.btnNext);
        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        //<이전화면>버튼 클릭시 이벤트 처리
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //<이전화면>버튼을 클릭했을때  뷰플리퍼의 이전화면이 나오게 설정
                vFlipper.showPrevious();
            }
        });
        //<다음화면>버튼 클릭시 이벤트처리
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //<다음화면>버튼 클릭했을때 뷰플리퍼의 다음화면이 나오게 메소드 호출
                vFlipper.showNext();
            }
        });
    }//onCreate
}//MainActivity


