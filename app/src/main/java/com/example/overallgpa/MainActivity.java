package com.example.overallgpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button FirstFallbtn =(Button)findViewById(R.id.FirstFallbtn);
        FirstFallbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Fall1.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Fall 1");
                startActivity(startIntent);
            }
        });
        Button SecondFallbtn = (Button)findViewById(R.id.SecondFallbtn);
        SecondFallbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent =new Intent(getApplicationContext(),Fall2.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Fall 2");
                startActivity(startIntent);
            }
        });
        Button FirstSringbtn = (Button)findViewById(R.id.FirstSpringbtn);
        FirstSringbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Spring1.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Spring 1");
                startActivity(startIntent);
            }
        });
        Button SecondSpringbtn = (Button)findViewById(R.id.SecondSpringbtn);
        SecondSpringbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Spring2.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Spring 2");
                startActivity(startIntent);
            }
        });
        Button FirstWinterbtn = (Button)findViewById(R.id.FirstWinterBtn);
        FirstWinterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Winter1.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Winter 1");
                startActivity(startIntent);
            }
        });
        Button SecondWinterbtn = (Button)findViewById(R.id.SecondWinterbtn);
        SecondWinterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Winter2.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Winter 2");
                startActivity(startIntent);
            }
        });
        Button FirstSummerbtn = (Button)findViewById(R.id.FIrstSummerbtn);
        FirstSummerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Summer1.class);
                startIntent.putExtra("com.example.overallGPA.SOMETHING","Summer1");
                startActivity(startIntent);
            }
        });
        Button SecondSummerBtn = (Button)findViewById(R.id.SecondSummerbtn);
        SecondSummerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Summer2.class);
                startIntent.putExtra("com.example.overallGPA.SOMETHING","Summer2");
                startActivity(startIntent);
            }
        });




            }
}
