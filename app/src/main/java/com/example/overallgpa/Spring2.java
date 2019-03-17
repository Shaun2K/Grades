package com.example.overallgpa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Spring2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring2);
        Button Grades = (Button)findViewById(R.id.Grades);
        Grades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Collegeboard = "https://pages.collegeboard.org/how-to-convert-gpa-4.0-scale";
                Uri webadress = Uri.parse(Collegeboard);

                Intent gotoCollegeboard = new Intent(Intent.ACTION_VIEW,webadress);
                if(gotoCollegeboard.resolveActivity(getPackageManager())!=null);
                startActivity(gotoCollegeboard);
            }
        });
        Button Overall = (Button)findViewById(R.id.Overall);
        Overall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Blackboard = "https://help.blackboard.com/Learn/Instructor/Grade/Customize_Grading_Interface/Grading_Schemas";
                Uri webaddress = Uri.parse(Blackboard);

                Intent gotoBlackboard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoBlackboard.resolveActivity(getPackageManager())!=null);
                startActivity(gotoBlackboard);
            }
        });
        Button btnAverage = (Button)findViewById(R.id.Overall);
        Overall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstGrade = (EditText)findViewById(R.id.FirstGrade);
                EditText SecondGrade = (EditText)findViewById(R.id.SecondGrade);
                EditText ThirdGrade = (EditText)findViewById(R.id.ThirdGrade);
                EditText FourthGrade = (EditText)findViewById(R.id.FourthGrade);
                EditText FifthGrade = (EditText)findViewById(R.id.FifthGrade);
                EditText Credits = (EditText)findViewById(R.id.Credits);

                TextView Position = (TextView)findViewById(R.id.Position);
                int alg1= Integer.parseInt(FirstGrade.getText().toString());
                int alg2= Integer.parseInt(SecondGrade.getText().toString());
                int alg3= Integer.parseInt(ThirdGrade.getText().toString());
                int alg4= Integer.parseInt(FourthGrade.getText().toString());
                int alg5= Integer.parseInt(FifthGrade.getText().toString());

                int ted= Integer.parseInt(Credits.getText().toString());

                int comm =(alg1 + alg2 + alg3 + alg4 + alg5)/ted;

                Position.setText(comm+"");
            }
        });
    }
}
