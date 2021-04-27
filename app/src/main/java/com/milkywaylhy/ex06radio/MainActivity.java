package com.milkywaylhy.ex06radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    TextView tv;
RatingBar rtb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=findViewById(R.id.RG);
        tv=findViewById(R.id.Tv);
        rtb=findViewById(R.id.rtb);


        //Radio버튼의 선택이 바뀌는것을 듣는 리스너를
        //RadioGroup에 설정하기!
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb= findViewById(checkedId);
                tv.setText(rb.getText().toString());
            }
        });

    }
    public void clickBtn(View v){
        //선택된 RADioButton의 글씨를 얻어오기
        //RadioGroup에게 선택된 RadioButton의 id를 얻어올 수 있음.

        int id = rg.getCheckedRadioButtonId();
        //이 아이디를 이용하여 서택된 Radio버튼 객체를 참조한다.
        RadioButton rb= findViewById(id);
        tv.getText(rb.getText().toString());

    }
    public void Rati
}