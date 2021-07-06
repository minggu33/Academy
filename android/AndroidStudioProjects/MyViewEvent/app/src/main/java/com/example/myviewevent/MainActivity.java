package com.example.myviewevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/*
    커스텀 컴포넌트(위젯,뷰) 란?
    - 개발자가 직접  View클래스를 상속받아 만든 위젯(뷰)

    커스텀 컴포넌트를 생성하기 위한 방법
    순서1. View클래스를 상속받아서 자식클래스를 생성한다.
    순서2. 부모클래스의 메소드를 재정의 한다.
           주로 앞에 on이 붙는 메소드를 재정의 하면 된다.
           예) onDraw(), onKeyDown()과 같은 메소드를 재정의 하여서 필요한 기능을 추가함.
    순서3. 작성된 커스텀 컴포넌트(뷰,위젯)을 사용한다.

    커스텀 컴포넌트에서 이벤트 처리 방법
    -> 안드로이드에서 사용자와 상호작용하는 개체는 View클래스이다.
       View클래스는 이벤트가 발생했을 경우에 호출되는 몇개의 콜백 메소드를 가지고 있다.
       View객체에 어떤 액션이 발생하면  이들 콜백메소드는 안드로이드 프레임워크에 의하여 호출된다
       예를 들어 사용자가 키패드를 누르면  View클래스의 onKeyDown()콜백메소드가 호출된다.
    -> Button클래스를 상속해서 나만의 버튼위젯을 만들고 싶은 경우...
       이때에는 onKeyDown()메소드와 같은 이벤트 처리 메소드를 재정의 하여서 이벤트를 처리하면 좋다

    우리가 재정의 할수 있는 View클래스의 이벤트 처리 메소드 종류
    -  onKeyDown(int, KeyEvent) : 사용자가 키보드의 키를 눌렀을대 호출되는 콜백 메소드
    -  onKeyUp(int, KeyEvent) : 사용자가 키보드의 키를 누른상태에서 때었을때 호출되는 콜백 메소드
    -  onFocusChanged(boolean, int, Rect) : 뷰가 포커스를 얻거나 잃었을 경우 호출되는 콜백메소드
    -  onTrackballEvent(MotionEvent) : 사용자가 트랙볼을 움직열을때 호출되는 콜백 메소드

    주제 : 사용자가 앱 화면을 터치하면 이벤트가 발생한다.
           이 이벤트를 처리하여서 이벤트가 발생할떄마다
           "화면에 (x,y)에 터치 이벤트가 발생 하였음" 과 같은 텍스트를 표시 하여 보자.

*/
//사용자 정의 커스텀 뷰 만들기
//우선 View클래스를 상속받아서 MyView클래스를 정의 합니다.
//여기에서 두개의 메소드를 재정의 합니다.
//하나는 이벤트를 처리하기 위하여 onTouchEvent()메소드 재정의(오버라이딩)
//둘은  화면에 글자를 그리기 위하여 onDraw()메소드 재정의(오버라이딩)
class MyView extends View{
    int key;
    String str;
    int x, y;

    public MyView(Context context){
        super(context);
        setBackgroundColor(Color.YELLOW);
    }
    //터치 이벤트가 발생하면 자동으로 호출되는 View부모클래스의 콜백메소드 재정의
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //매개변수인 event를 통하여 많은 정보들이 전달된다.
        //그중에서..자신에게 필요한 것만 골라서 사용하면 된다.
        // MotionEvent event매개변수내부에는 터치가 발생한 위치정보가 포함되어 있다.
        x = (int)event.getX(0);//터치가 발생한 X좌표정보
        y = (int)event.getY(0);//터치가 발생한 y좌표정보

        //사용자 뷰 화면을 다시 그리게 하기 위해 호출하는 메소드
        invalidate();
        
        //이벤트를 처리 하였으면 true를 반환 하고 처리 하지 않았으면 false를 반환함.
        return super.onTouchEvent(event);
        //super키워드를 사용하여서 부모View클래스의 이벤트 처리 메소드도 호출해주는 것이다.
        //이렇게 하는 것이 좋은데, 그이유는 부모View클래스도 이이벤트를 받아서 처리 하여야 하기떄문
    }

    //화면에 글자를 다시 그릴 필요가 있을때 호출되는 콜백메소드 재정의
    //사용자의 스마트폰 화면 터치 정보가 바뀔때마다 호출되는 콜백메소드 재정의
    //하는일 : 터치가 발생한 위치를  텍스트로 변환하여 화면에 표시한다.
    @Override
    protected void onDraw(Canvas canvas) {
        //페인트(붓) 역할을 하는 객체 생성
        Paint paint = new Paint();
        //페인트(붓)의 굵기 사이즈 지정
        paint.setTextSize(15);
        //도화지에 페인트(붓)을 이용하여  넘겨온 x좌표와 y좌표값을 이용하여 그린다.
        canvas.drawText("(" + x + ", " + y + ")에서 터치 이벤트가 발생하였음",x,y,paint);

    }
}


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //사용자가 새로 만든 커스텀 MyView클래스에 대한 객체를 생성 하여 하나의 화면 설정
        MyView w = new MyView(this);
        //사용자 커스텀뷰 MainActivity하나의 메인화면에 보이게 설정
        this.setContentView(w);


    }
}