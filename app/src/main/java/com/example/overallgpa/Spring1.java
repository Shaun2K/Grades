package com.example.overallgpa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Spring1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring1);
        Button Grades = (Button)findViewById(R.id.Grades);
        Grades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CollegeBoard = "https://pages.collegeboard.org/how-to-convert-gpa-4.0-scale";
                Uri webaddress = Uri.parse(CollegeBoard);

                Intent gotoCollegeBoard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoCollegeBoard.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoCollegeBoard);
                }
            }
        });
        Button Overall = (Button)findViewById(R.id.Overall);
        Overall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Blackboard = "https://help.blackboard.com/Learn/Instructor/Grade/Customize_Grading_Interface/Grading_Schemas";
                Uri webaddress = Uri.parse(Blackboard);

                Intent gotoBlackboard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoBlackboard.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoBlackboard);
                }
            }
        });
        Button btnAverage = (Button)findViewById(R.id.btnAverage);
        btnAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstGrade = (EditText)findViewById(R.id.FirstGrade);
                EditText SecondGrade = (EditText)findViewById(R.id.ThirdClass);
                EditText ThirdGrade = (EditText)findViewById(R.id.ThirdGrade);
                EditText FourthGrade = (EditText)findViewById(R.id.FourthGrade);
                EditText FifthGrade = (EditText)findViewById(R.id.FifthGrade);
                EditText Credits = (EditText)findViewById(R.id.Credits);

                TextView mark = (TextView)findViewById(R.id.mark);
                int act1 = Integer.parseInt(FirstGrade.getText().toString());
                int act2 = Integer.parseInt(SecondGrade.getText().toString());
                int act3 = Integer.parseInt(ThirdGrade.getText().toString());
                int act4 = Integer.parseInt(FourthGrade.getText().toString());
                int act5 = Integer.parseInt(FifthGrade.getText().toString());

                int usb = Integer.parseInt(Credits.getText().toString());

                int arith = (act1 + act2 + act3+ act4 + act5)/usb;
                mark.setText(arith+"");
                if(getIntent().hasExtra("com.example.overallgpa.SOMETHING")){

                }
                EditText FirstClass = (EditText)findViewById(R.id.FirstClass);
                EditText SecondClass =(EditText)findViewById(R.id.SecondClass);
                EditText ThirdClass = (EditText)findViewById(R.id.ThirdClass);
                EditText FourthClass = (EditText)findViewById(R.id.FourthClass);
                EditText FifthClass = (EditText)findViewById(R.id.FifthClass);
            }
        });
    }
}
