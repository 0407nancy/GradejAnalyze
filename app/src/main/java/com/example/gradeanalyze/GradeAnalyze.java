package com.example.gradeanalyze;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class GradeAnalyze extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gradeanalyze);
        Button btn2 = findViewById(R.id.getAdvice);
        Button back1 = findViewById(R.id.enterBack1);
        TextView sub1 = findViewById(R.id.Subject1);
        TextView sub2 = findViewById(R.id.Subject2);
        TextView sub3 = findViewById(R.id.Subject3);
        TextView sub4 = findViewById(R.id.Subject4);
        TextView sc1 = findViewById(R.id.score1);
        TextView sc2 = findViewById(R.id.score2);
        TextView sc3 = findViewById(R.id.score3);
        TextView sc4 = findViewById(R.id.score4);
        TextView gp1 = findViewById(R.id.gpa1);
        TextView gp2 = findViewById(R.id.gpa2);
        TextView gp3 = findViewById(R.id.gpa3);
        TextView gp4 = findViewById(R.id.gpa4);
        TextView rt1 = findViewById(R.id.rate1);
        TextView rt2 = findViewById(R.id.rate2);
        TextView rt3 = findViewById(R.id.rate3);
        TextView rt4 = findViewById(R.id.rate4);
        TextView tsc = findViewById(R.id.totalScore);
        TextView tgp = findViewById(R.id.totalGpa);
        TextView wsc = findViewById(R.id.weightScore);
        //略stability overallRank绑定控件
        TextView staRs = findViewById(R.id.stabilityResult);
        TextView orkRs = findViewById(R.id.overallRankResult);

        Intent intent2 = getIntent();
        String sub1str = intent2.getStringExtra("edit_sub1");
        String sub2str = intent2.getStringExtra("edit_sub2");
        String sub3str = intent2.getStringExtra("edit_sub3");
        String sub4str = intent2.getStringExtra("edit_sub4");
        String scr1str = intent2.getStringExtra("edit_enter1");
        String scr2str = intent2.getStringExtra("edit_enter2");
        String scr3str = intent2.getStringExtra("edit_enter3");
        String scr4str = intent2.getStringExtra("edit_enter4");
        String gp1str = intent2.getStringExtra("edit_grade1");
        String gp2str = intent2.getStringExtra("edit_grade2");
        String gp3str = intent2.getStringExtra("edit_grade3");
        String gp4str = intent2.getStringExtra("edit_grade4");
        sub1.setText(sub1str);//text显示string变量
        sub2.setText(sub2str);
        sub3.setText(sub3str);
        sub4.setText(sub4str);
        sc1.setText(scr1str);
        sc2.setText(scr2str);
        sc3.setText(scr3str);
        sc4.setText(scr4str);
            float ee1 = Float.parseFloat(scr1str);
            float ee2 = Float.parseFloat(scr2str);
            float ee3 = Float.parseFloat(scr3str);
            float ee4 = Float.parseFloat(scr4str);
            int eg1 = Integer.parseInt(gp1str);
            int eg2 = Integer.parseInt(gp2str);
            int eg3 = Integer.parseInt(gp3str);
            int eg4 = Integer.parseInt(gp4str);

            float weight;//加权平均分—— 综合评级
            weight = (ee1 * eg1 + ee2 * eg2 + ee3 * eg3 + ee4 * eg4) / (eg1 + eg2 + eg3 + eg4);
            BigDecimal turn1 = new BigDecimal(weight);
            float weightFinal = turn1.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
            wsc.setText(""+weightFinal);//text显示四舍五入、保留两位小数的float变量值
            if (weight >= 90) {
                orkRs.setText("A");
            }
            else if (weight > 85) {
                orkRs.setText("A-");
            }
            else if (weight > 82) {
                orkRs.setText("B+");
            }
            else if (weight >= 80) {
                orkRs.setText("B");
            }
            else if (weight >= 76) {
                orkRs.setText("B-");
            }
            else if (weight >= 73) {
                orkRs.setText("C+");
            }
            else if (weight >= 70) {
                orkRs.setText("C");
            }
            else if (weight >= 66) {
                orkRs.setText("C-");
            }
            else if (weight >= 63) {
                orkRs.setText("D+");
            }
            else if (weight >= 60) {
                orkRs.setText("D");
            }
            else {
                orkRs.setText("F");
            }


            int tscr;//总学分
            tscr = eg1 + eg2 + eg3 + eg4;
            tsc.setText(""+tscr);

            float variance;//方差
            variance = (ee1 - weight) * (ee1 - weight) + (ee2 - weight) * (ee2 - weight) + (ee3 - weight) * (ee3 - weight) + (ee4 - weight) * (ee4 - weight);
            if (variance <= 0.99)
            {
                staRs.setText("优秀");
            }
            else if (variance <= 3.99)
            {
                staRs.setText("良好");
            }
            else if (variance <= 9.99)
            {
                staRs.setText("较差");
            }
            else
            {
                staRs.setText("差");
            }
            //成绩等级
            if (ee1 >= 90)
            {
                rt1.setText("A");
                gp1.setText("4.0");
            }
            else if (ee1 > 85)
            {
                rt1.setText("A-");
                gp1.setText("3.7");
            }
            else if (ee1 > 82)
            {
                rt1.setText("B+");
                gp1.setText("3.3");
            }
            else if (ee1 >= 80)
            {
                rt1.setText("B");
                gp1.setText("3.0");
            }
            else if (ee1 >= 76)
            {
                rt1.setText("B-");
                gp1.setText("2.7");
            }
            else if (ee1 >= 73)
            {
                rt1.setText("C+");
                gp1.setText("2.3");
            }
            else if (ee1 >= 70)
            {
                rt1.setText("C");
                gp1.setText("2.0");
            }
            else if (ee1 >= 66)
            {
                rt1.setText("C-");
                gp1.setText("1.7");
            }
            else if (ee1 >= 63)
            {
                rt1.setText("D+");
                gp1.setText("1.3");
            }
            else if (ee1 >= 60)
            {
                rt1.setText("D");
                gp1.setText("1.0");
            }
            else
            {
                rt1.setText("F");
                gp1.setText("0");
            }


            if (ee2 >= 90)
            {
                rt2.setText("A");
                gp2.setText("4.0");
            }
            else if (ee2 > 85)
            {
                rt2.setText("A-");
                gp2.setText("3.7");
            }
            else if (ee2 > 82)
            {
                rt2.setText("B+");
                gp2.setText("3.3");
            }
            else if (ee2 >= 80)
            {
                rt2.setText("B");
                gp2.setText("43.0");
            }
            else if (ee2 >= 76)
            {
                rt2.setText("B-");
                gp2.setText("2.7");
            }
            else if (ee2 >= 73)
            {
                rt2.setText("C+");
                gp2.setText("2.3");
            }
            else if (ee2 >= 70)
            {
                rt2.setText("C");
                gp2.setText("2.0");
            }
            else if (ee2 >= 66)
            {
                rt2.setText("C-");
                gp2.setText("1.7");
            }
            else if (ee2 >= 63)
            {
                rt2.setText("D+");
                gp2.setText("1.3");
            }
            else if (ee2 >= 60)
            {
                rt2.setText("D");
                gp2.setText("1.0");
            }
            else
            {
                rt2.setText("F");
                gp2.setText("0");
            }


            if (ee3 >= 90)
            {
                rt3.setText("A");
                gp3.setText("4.0");
            }
            else if (ee3 > 85)
            {
                rt3.setText("A-");
                gp3.setText("3.7");
            }
            else if (ee3 > 82)
            {
                rt3.setText("B+");
                gp3.setText("3.3");
            }
            else if (ee3 >= 80)
            {
                rt3.setText("B");
                gp3.setText("3.0");
            }
            else if (ee3 >= 76)
            {
                rt3.setText("B-");
                gp3.setText("2.7");
            }
            else if (ee3 >= 73)
            {
                rt3.setText("C+");
                gp3.setText("2.3");
            }
            else if (ee3 >= 70)
            {
                rt3.setText("C");
                gp3.setText("2.0");
            }
            else if (ee3 >= 66)
            {
                rt3.setText("C-");
                gp3.setText("1.7");
            }
            else if (ee3 >= 63)
            {
                rt3.setText("D+");
                gp3.setText("1.3");
            }
            else if (ee3 >= 60)
            {
                rt3.setText("D");
                gp3.setText("1.0");
            }
            else
            {
                rt3.setText("F");
                gp3.setText("0");
            }


            if (ee4 >= 90)
            {
                rt4.setText("A");
                gp4.setText("4.0");
            }
            else if (ee4 > 85)
            {
                rt4.setText("A-");
                gp4.setText("3.7");
            }
            else if (ee4 > 82)
            {
                rt4.setText("B+");
                gp4.setText("3.3");
            }
            else if (ee4 >= 80)
            {
                rt4.setText("B");
                gp4.setText("3.0");
            }
            else if (ee4 >= 76)
            {
                rt4.setText("B-");
                gp4.setText("2.7");
            }
            else if (ee4 >= 73)
            {
                rt4.setText("C+");
                gp4.setText("2.3");
            }
            else if (ee4 >= 70)
            {
                rt4.setText("C");
                gp4.setText("2.0");
            }
            else if (ee4 >= 66)
            {
                rt4.setText("C-");
                gp4.setText("1.7");
            }
            else if (ee4 >= 63)
            {
                rt4.setText("D+");
                gp4.setText("1.3");
            }
            else if (ee4 >= 60)
            {
                rt4.setText("D");
                gp4.setText("1.0");
            }
            else
            {
                rt4.setText("F");
                gp4.setText("0");
            }
//绩点
        double gpa1 =Double.parseDouble(gp1str);
        double gpa2 =Double.parseDouble(gp2str);
        double gpa3 =Double.parseDouble(gp3str);
        double gpa4 =Double.parseDouble(gp4str);
        double tgpa;//总绩点
        tgpa = (gpa1*eg1 + gpa2*eg2 + gpa3*eg3 + gpa4*eg4) / 4;
        BigDecimal turn2 = new BigDecimal(tgpa);//四舍五入、保留两位小数
        float tgpaFinal = turn2.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        tgp.setText(""+tgpaFinal);
        //返回界面
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GradeAnalyze.this, Advice.class);
                intent2.putExtra("scr1",scr1str);
                intent2.putExtra("scr2",scr2str);
                intent2.putExtra("scr3",scr3str);
                intent2.putExtra("scr4",scr4str);
                intent2.putExtra("sub1",sub1str);
                intent2.putExtra("sub2",sub2str);
                intent2.putExtra("sub3",sub3str);
                intent2.putExtra("sub4",sub4str);
startActivity(intent2);
                                    }
                                });
    }
}
