package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //자동완성될 문자열을 배열에 저장
        String[] items = {"CSI-뉴욕", "CSI-라스베가스",
                          "CSI-마이애미","Friends","Fringe","Lost" };
        //자동완성될 텍스트뷰와  멀티자동완성 텍스트뷰 얻기
        AutoCompleteTextView auto =
                (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        //ArrayAdapter클래스는 뷰와 데이터를 연결해준다.
        //자동완성 텍스트뷰와 items배열을 연결하는 역할을 하여
        //자동완성 텍스트뷰에 items배열의 내용이 출력된다.
        //생성자의 두번째 파라미터는 목록이 출력될 모양을 결정하는데...
        //simple_dropdown_item_1line외에도 다양한 모양을 선택할수 있다.
        //세번째 파라미터에 배열이름을 지정하면 된다.
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                                         android.R.layout.simple_dropdown_item_1line,
                                         items);

        //자동완성텍스트뷰와 멀티자동완성텍스트뷰에 생성한 ArrayAdapter객체를 설정한다.
        auto.setAdapter(adapter);

        MultiAutoCompleteTextView multi =
                (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        //쉼표 ,로 구분 하기 위한 객체 생성
        MultiAutoCompleteTextView.CommaTokenizer token =
                                            new MultiAutoCompleteTextView.CommaTokenizer();
        multi.setTokenizer(token);//멀티자동완성텍스트뷰에 설정 한다.
        multi.setAdapter(adapter);
    }
}