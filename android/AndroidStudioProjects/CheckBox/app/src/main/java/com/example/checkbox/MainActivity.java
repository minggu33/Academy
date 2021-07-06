package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //체크박스의 상태가 변경되면 호출되는 일반 메소드
    public void onCheckboxClicked(View view){

        //체크되었는지 체크되지 않았는지 판단
        //체크된 상태이면 true
        //NO체크된 상태이면 false
       boolean checked =  ((CheckBox)view).isChecked();

       //만약 체크박스가 체크되면 선택이라는 토스트 메세지를 표시한다.
       switch (view.getId()){ //체크된 체크박스의 id를 얻어와서

           case R.id.checkbox_meat://고기 체크박스와 같고...
               if(checked)
                   Toast.makeText(getApplicationContext(),"고기선택",Toast.LENGTH_SHORT).show();
               else
                   Toast.makeText(getApplicationContext(),"고기선택 해제",Toast.LENGTH_SHORT).show();

           case R.id.checkbox_cheese://치즈 체크박스를 체크 박스와 같고..
               if(checked){ 
                   Toast.makeText(getApplicationContext(),"치즈선택",Toast.LENGTH_SHORT).show();
               }else{
                   Toast.makeText(getApplicationContext(),"치즈선택 해제",Toast.LENGTH_SHORT).show();
               }
       }//switch문 끝
    }//onCheckboxClicked메소드 끝
}//MainActivity클래스 끝