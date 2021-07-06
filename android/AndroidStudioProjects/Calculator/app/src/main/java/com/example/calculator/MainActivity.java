package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    //activity_main.xml의 EditText태그들(클래스)에 대한 객체를 생성해서 저장할 변수들 선언
   private EditText edit1, edit2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //안드로이드 앱의 메인화면(MainActivity.java)의 화면을
        //R클래스의 layout내부클래스 안에 있는  activity_main상수값을 이용하여 설정 할수 있다.
        setContentView(R.layout.activity_main);
        //R클래스 내부에 id내부클래스 내부에 editText1상수값을
        //findViewById()메소드 호출시 매개변수로 전달 하면
        //activity_main.xml파일의 <EditText>태그(클래스)에 대한 객체를 생성하여 반환 받을 수있다.
        edit1 = (EditText) findViewById(R.id.editText1); //숫자1을 입력 할수 있는 EditText객체를 반환 받는다.
        edit2 = (EditText) findViewById(R.id.editText2); //숫자2를 입력 할수 있는 EditText객체를 반환 받는다.
        result = (EditText) findViewById(R.id.editText3);//계산된 결과를 보여주는 EditText객체를 반환 받는다.
    }//onCreate메소드 끝

    //+버튼을 클릭했을때 호출되는 메소드
    public void add(View target){
        //숫자1을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n1 = edit1.getText().toString();
        //숫자2을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n2 = edit2.getText().toString();
        //입력한 숫자1 과 숫자2의 값을 +연산 한 정수값 얻기
        int r = Integer.parseInt(n1) + Integer.parseInt(n2);
        //세번쨰 EditText위젯에  계산된 결과값 문자열로 설정
        result.setText("  " + r);
    }
    //-버튼을 클릭했을때 호출되는 메소드
    public void sub(View target){
        //숫자1을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n1 = edit1.getText().toString();
        //숫자2을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n2 = edit2.getText().toString();
        int r = Integer.parseInt(n1) - Integer.parseInt(n2);
        //세번쨰 EditText위젯에  계산된 결과값 문자열로 설정
        result.setText("  " + r);
    }
    // * 버튼을 클릭했을때 호출되는 메소드
    public void mul(View target){
        //숫자1을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n1 = edit1.getText().toString();
        //숫자2을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n2 = edit2.getText().toString();
        int r = Integer.parseInt(n1) * Integer.parseInt(n2);
        //세번쨰 EditText위젯에  계산된 결과값 문자열로 설정
        result.setText("  " + r);
    }

    // /버튼을 클릭했을때 호출되는 메소드
    public void div(View target){
        //숫자1을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n1 = edit1.getText().toString();
        //숫자2을 입력 할수 있는 EditText위젯에 입력받은 숫자를 문자열로 변환해서 얻기
        String n2 = edit2.getText().toString();
        int r = Integer.parseInt(n1) / Integer.parseInt(n2);
        //세번쨰 EditText위젯에  계산된 결과값 문자열로 설정
        result.setText("  " + r);
    }

}