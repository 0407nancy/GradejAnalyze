package com.example.gradeanalyze;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Advice extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advice);
        TextView nm1 = findViewById(R.id.name1);
        TextView nm2 = findViewById(R.id.name2);
        TextView nm3 = findViewById(R.id.name3);
        TextView nm4 = findViewById(R.id.name4);
        TextView ad1 = findViewById(R.id.advice1);
        TextView ad2 = findViewById(R.id.advice2);
        TextView ad3 = findViewById(R.id.advice3);
        TextView ad4 = findViewById(R.id.advice4);
        Button back2 = findViewById(R.id.enterBack2);

        Intent intent3 = getIntent();
        String name1 = intent3.getStringExtra("sub1");
        String name2 = intent3.getStringExtra("sub2");
        String name3 = intent3.getStringExtra("sub3");
        String name4 = intent3.getStringExtra("sub4");
        String firstScore = intent3.getStringExtra("scr1");
        String secondScore = intent3.getStringExtra("scr2");
        String thirdScore = intent3.getStringExtra("scr3");
        String fourthScore = intent3.getStringExtra("scr4");
        nm1.setText(name1);
        nm2.setText(name2);
        nm3.setText(name3);
        nm4.setText(name4);
        float firstScr =Float.parseFloat(firstScore);
        float secondScr =Float.parseFloat(secondScore);
        float thirdScr =Float.parseFloat(thirdScore);
        float fourthScr =Float.parseFloat(fourthScore);
        if(firstScr>=90)
        {
            ad1.setText("优秀!你真的超级无敌棒！保持下去呦！");
        }
        else if(firstScr>=85)
        {
            ad1.setText("良好！不错哦！");
        }
        else if(firstScr>=75){
            ad1.setText("一般。注意查缺补漏，针对练习！");
        }
        else if(firstScr>=60){
            ad1.setText("较差。不要气馁，一切皆有可能！");
        }
        else{
            ad1.setText("不合格！天赋不够，努力来凑，希望一直都在！");
        }


        if(secondScr>=90)
        {
            ad2.setText("优秀!你真的超级无敌棒！保持下去呦！");
        }
        else if(secondScr>=85){
            ad2.setText("良好！不错哦！");
        }
        else if(secondScr>=75){
            ad2.setText("一般。注意查缺补漏，针对练习！");
        }
        else if(secondScr>=60){
            ad2.setText("较差。不要气馁，一切皆有可能！");
        }
        else{
            ad2.setText("不合格！天赋不够，努力来凑，希望一直都在！");
        }


        if(thirdScr>=90)
        {
            ad3.setText("优秀!你真的超级无敌棒！保持下去呦！");
        }
        else if(thirdScr>=85)
        {
            ad3.setText("良好！不错哦！");
        }
        else if(thirdScr>=75)
        {
            ad3.setText("一般。注意查缺补漏，针对练习！");
        }
        else if(thirdScr>=60)
        {
            ad3.setText("较差。不要气馁，一切皆有可能！");
        }
        else
            {
            ad3.setText("不合格！天赋不够，努力来凑，希望一直都在！");
        }


        if(fourthScr>=90)
        {
            ad4.setText("优秀!你真的超级无敌棒！保持下去呦！");
        }
        else if(fourthScr>=85)
        {
            ad4.setText("良好！不错哦！");
        }
        else if(fourthScr>=75)
        {
            ad4.setText("一般。注意查缺补漏，针对练习！");
        }
        else if(fourthScr>=60)
        {
            ad4.setText("较差。不要气馁，一切皆有可能！");
        }
        else
            {
            ad4.setText("不合格！天赋不够，努力来凑，希望一直都在！");
        }
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
