package com.example.myapplication7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout)findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }
    //옵션 메뉴를 등록 하는 메소드 onCreateOptionMenu()메소드를
    //부모클래스인 Activity클래스로부터 오버라이딩 하자.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //상위 클래스의 생성자를 실행한다.
        super.onCreateOptionsMenu(menu);
        //메뉴 인플레이터객체를 생성하고
        MenuInflater mInflater = getMenuInflater();
        //작성한 menu1.xml = R.menu.menu1을 등록한다
        mInflater.inflate(R.menu.menu1, menu);
       return true;
    }

    //메뉴를 클릭했을때 동작할 메소드  onOptionItemSelected()오버라이딩
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //item.getItemId()메소드로 어떤 항목을 선택했는지 구한후
        //swith ~ case문으로 각 항목마다 실행할 내용을 코딩!
        switch (item.getItemId()){
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return  true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return  true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return  true;
            case R.id.subRotate:
                 //버튼을 45도 회전
                 button1.setRotation(45);
                 return  true;
            case R.id.subSize:
                 //버튼의 X축을 2배 확대
                 button1.setScaleX(2);
                 return  true;
        }
        return false;
    }
}





