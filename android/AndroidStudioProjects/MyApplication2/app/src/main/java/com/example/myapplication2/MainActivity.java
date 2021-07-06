package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    //activity_main.xml에서 id속성값을 부여한 12개의 위젯을 저장할 12개 변수 선언
    //타이머로 사용할 크로노미터를 저장할 변수
    Chronometer chrono;
    //<예약시작>,<예약완료>버튼을 저장할 변수
    Button btnStart, btnEnd;
    RadioButton rdoCal, rdoTime;
    TimePicker tPicker;
    CalendarView calView;
    //맨아래에 출력될 연, 월, 일, 시, 분 의 숫자에 해당 하는 텍스트 뷰 변수 5개
    TextView tvYear, tvMonth, tvDay, tvHour, tvMinute;
    //캘랜더 뷰에서 선택할 연, 월, 일에 해당하되는 값을 저장할 변수
    int selectYear, selectMonth, selectDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약");
        //버튼
        btnStart  =  (Button) findViewById(R.id.btnStart);
        btnEnd  =   (Button) findViewById(R.id.btnEnd);
        //크로노미터
        chrono = (Chronometer) findViewById(R.id.chronometer1);
        //라디오 버튼 2개
        rdoCal  = (RadioButton) findViewById(R.id.rdoCal);
        rdoTime = (RadioButton) findViewById(R.id.rdoTime);
        //텍스트뷰 중에서 연, 월, 일, 시 , 분 숫자
        tvYear =  (TextView) findViewById(R.id.tvYear);
        tvMonth = (TextView) findViewById(R.id.tvMonth);
        tvDay = (TextView) findViewById(R.id.tvDay);
        tvHour = (TextView) findViewById(R.id.tvHour);
        tvMinute =  (TextView) findViewById(R.id.tvMinute);
        //FrameLayout내부에 있는 2개의 위젯
        tPicker = (TimePicker) findViewById(R.id.timePicker1);
        calView = (CalendarView) findViewById(R.id.calendarView1);
        //처음에 앱을 실행 했을때  달력, 시계 안보이게 설정
        tPicker.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        //<날짜설정>라디오 버튼을 클릭하면  캘린터 뷰만 보이도록 설정(이벤트 처리)
        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tPicker.setVisibility(View.INVISIBLE); //디지털 시계 안보이게
                calView.setVisibility(View.VISIBLE); //달력 보이게
            }
        });
        //<시간설정>라디오 버튼을 클릭 하면  타임피커만 보이도록 설정(이벤트 처리)
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tPicker.setVisibility(View.VISIBLE); //디지털 시계 보이게
                calView.setVisibility(View.INVISIBLE); //달력 안보이게
            }
        });

        //타이머 설정
        //<예약시작> 버튼을 클릭할때마다 이벤트 처리
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //크로노미터를 0으로 초기화한다.<예약시작>버튼을 누를때 마다 초기화되게 한다.
                chrono.setBase(SystemClock.elapsedRealtime());
                //크로노미터를 시작 시킨다.
                chrono.start();   //stop() <--정지
                //타이머가 시작되면 글자가 빨간색으로, 정지되면 파린색으로 보이도록 설정
                chrono.setTextColor(Color.RED);
            }
        });
        //<예약완료>버튼을 누를때마다 이벤트 처리
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //크로노미터 위젯 중지 시키기
                chrono.stop();
                //중지 되면 글자를 파란색으로 설정
                chrono.setTextColor(Color.BLUE);
                //<예약완료>버튼을 클릭하면 캘린더뷰에서 설정한 연,월, 일과
                //타임피커에서 설정한 시, 분이  맨아래의 텍스트뷰에 채워지게 설정
                tvYear.setText( Integer.toString(selectYear) );  //연
                tvMonth.setText( Integer.toString(selectMonth) );// 월
                tvDay.setText( Integer.toString(selectDay) ); //일
                tvHour.setText( Integer.toString(tPicker.getCurrentHour())); //시
                tvMinute.setText( Integer.toString(tPicker.getCurrentMinute()));//분
            }
        });
        //캘린더뷰 위젯(달력)의 날짜를 선택(클릭)하면  클릭한  연,월,일을 전역변수에 저장
        //월은 0부터 시작해서 1을 더해 줌
        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view,
                                            int year, int month, int dayOfMonth) {

                selectYear = year;
                selectMonth = month + 1;
                selectDay = dayOfMonth;

            }
        });



    }
}