package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

/*
     라디오 버튼 위젯
     -> 체크박스와 비슷하지만 하나의 그룹안에서는 하나의 버튼만 선택할수 있다는 점이 다르다
     -> 만약 하나의 라디오 버튼을 클릭하면 다른 버튼은 자동으로 해제 된다
     -> 라디오 버튼 위젯을 만들기 위해서는 두개의 클래스를 이용 한다.
        하나) RadioButton클래스  : 라디오 버튼 위젯을 생성 하는데 사용
        둘) RadioGroup클래스 : 라디오 버튼들을 그룹화 시키는데 사용
     -> 하나의 RadioGroup 에는 여러개의 RadioButton이 들어갈수 있고,
        이주에서 하나의 RadioButton위젯 만 선택할 수 있다.

    실습내용 : Rad와 Blue버튼중에서 하나만 선택할수 있는 라디오 버튼을 작성하고 테스트 하자.
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //레이팅바 별 가져오기
        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        //사용자가 새로운 점수(별점수)를 주었을때 토스트 메세지 출력
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            //사용자가 개로운 별점수를 입력했을 경우 호출되는 콜백 메소드
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                 Toast.makeText(
                         getApplicationContext(),
                         "New Rating:" + rating,
                         Toast.LENGTH_SHORT
                 ).show();
            }
        });


    }

    public void onToggleClicked(View view){//클릭당한 토글버튼 위젯이 매개변수로 전달 됨

        //매개변수로 전달 받는 토글 버튼위젯에 클릭했는지 미클릭 했는지 검사
        //클릭(true) , false
        boolean on  = ((ToggleButton)view).isChecked();

        if(on){
            Toast.makeText(getApplicationContext(),
                           "Checked",
                           Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),
                    "Not Checked",
                    Toast.LENGTH_SHORT).show();
        }
    }



    public void onRadioButtonClicked(View view){
        //버튼의 체크 여부 저장
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){

            case R.id.radio_red:
                if(checked){
                    //리니어 레이아웃의 배경색을 빨강색으로 바꾸기
                    LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
                    layout.setBackgroundColor(Color.RED);
                    //선택한 라디오 버튼의 텍스트를 얻어 토스트메세지로 출력
                    Toast.makeText(
                                    view.getContext(),
                                    ((RadioButton)view).getText(),
                                    Toast.LENGTH_SHORT
                                  ).show();
                }
                break;
            case R.id.radio_blue:
                if(checked){
                    //리니어 레이아웃의 배경색 파란색으로 변경
                    LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
                    layout.setBackgroundColor(Color.BLUE);
                    //선택한 라디오버튼의 텍스트를 얻어 토스트메세지로 출력
                    Toast.makeText(
                                    view.getContext(),
                            ((RadioButton)view).getText(),
                            Toast.LENGTH_SHORT
                    ).show();
                }
            break;
        }//switch
    }//메소드
}//클래스






