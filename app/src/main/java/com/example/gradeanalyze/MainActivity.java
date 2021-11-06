package com.example.gradeanalyze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.analyze);
        EditText subject1 = findViewById(R.id.subject1);
        EditText subject2 = findViewById(R.id.subject2);
        EditText subject3 = findViewById(R.id.subject3);
        EditText subject4 = findViewById(R.id.subject4);
        EditText Enter1 = findViewById(R.id.Enter1);
        EditText Enter2 = findViewById(R.id.Enter2);
        EditText Enter3 = findViewById(R.id.Enter3);
        EditText Enter4 = findViewById(R.id.Enter4);
        EditText grade1 =  findViewById(R.id.grade1);
        EditText grade2 =  findViewById(R.id.grade2);
        EditText grade3 =  findViewById(R.id.grade3);
        EditText grade4 =  findViewById(R.id.grade4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String es1str =subject1.getText().toString();
                String es2str =subject2.getText().toString();
                String es3str =subject3.getText().toString();
                String es4str =subject4.getText().toString();
                String ee1str = Enter1.getText().toString();
                String ee2str = Enter2.getText().toString();
                String ee3str = Enter3.getText().toString();
                String ee4str = Enter4.getText().toString();
                String eg1str = grade1.getText().toString();
                String eg2str = grade2.getText().toString();
                String eg3str = grade3.getText().toString();
                String eg4str = grade4.getText().toString();
                //防输入bug
                if(TextUtils.isEmpty(ee1str)||TextUtils.isEmpty(ee2str)||TextUtils.isEmpty(ee3str)||TextUtils.isEmpty(ee4str) ||TextUtils.isEmpty(eg1str)||TextUtils.isEmpty(eg2str)||TextUtils.isEmpty(eg3str)||TextUtils.isEmpty(eg4str)||TextUtils.isEmpty(es1str)||TextUtils.isEmpty(es2str)||TextUtils.isEmpty(es3str)||TextUtils.isEmpty(es4str))
                {
                    Toast.makeText(MainActivity.this,"输入不能为空!",Toast.LENGTH_LONG).show();
                }
                else if (ee1str.length() > 4 || ee2str.length() > 4 || ee3str.length() > 4 || ee4str.length() > 4  || eg1str.length() > 3 || eg2str.length() > 3 || eg3str.length() > 3 || eg4str.length() > 3||es1str.length()>10||es2str.length()>10||es3str.length()>10||es4str.length()>10)
                {
                    Toast.makeText(MainActivity.this, "您输入的数据或字符过大!", Toast.LENGTH_LONG).show();
                }
                else
                    {
                    Toast.makeText(MainActivity.this, "跳转成功!", Toast.LENGTH_LONG).show();
                    Intent intent1 = new Intent(MainActivity.this,GradeAnalyze.class);
                    intent1.putExtra("edit_sub1",es1str);
                    intent1.putExtra("edit_sub2",es2str);
                    intent1.putExtra("edit_sub3",es3str);
                    intent1.putExtra("edit_sub4",es4str);
                    intent1.putExtra("edit_enter1",ee1str);
                    intent1.putExtra("edit_enter2",ee2str);
                    intent1.putExtra("edit_enter3",ee3str);
                    intent1.putExtra("edit_enter4",ee4str);
                    intent1.putExtra("edit_grade1",eg1str);
                    intent1.putExtra("edit_grade2",eg2str);
                    intent1.putExtra("edit_grade3",eg3str);
                    intent1.putExtra("edit_grade4",eg4str);
                    startActivity(intent1);
                    }
            }
    });

}}