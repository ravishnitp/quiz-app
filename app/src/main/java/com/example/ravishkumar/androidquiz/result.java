package com.example.ravishkumar.androidquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView totalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        /**
         * get score from the activities
         */
        String resultMessage="";
        int score=0;


        Intent result =  getIntent();
         score = result.getIntExtra("score",0);
        resultMessage=""+score;


        totalScore = (TextView)findViewById(R.id.totalScore);
        totalScore.setText(resultMessage);





    }
}
