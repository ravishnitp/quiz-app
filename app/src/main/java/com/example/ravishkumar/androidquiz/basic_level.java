package com.example.ravishkumar.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class basic_level extends AppCompatActivity {
    RadioButton bq1,bq2,bq3,bq4,bq5,bq6,bq7,bq8,bq9,bq10;
    Button submit;
    int correctAnswer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_level);

        /**
         * finding correct radioButtons corresponding to correct options
         */
        bq1 = findViewById(R.id.basics_Q1A);
        bq2 = findViewById(R.id.basics_Q2B);
        bq3 = findViewById(R.id.basics_Q3C);
        bq4 = findViewById(R.id.basics_Q4C);
        bq5 = findViewById(R.id.basics_Q5D);
        bq6 = findViewById(R.id.basics_Q6D);
        bq7 = findViewById(R.id.basics_Q7C);
        bq8 = findViewById(R.id.basics_Q8D);
        bq9 = findViewById(R.id.basics_Q9C);
        bq10 = findViewById(R.id.basics_Q10D);
        submit = findViewById(R.id.submit_level1);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bq1.isChecked())correctAnswer++;
                if(bq2.isChecked())correctAnswer++;
                if(bq3.isChecked())correctAnswer++;
                if(bq4.isChecked())correctAnswer++;
                if(bq5.isChecked())correctAnswer++;
                if(bq6.isChecked())correctAnswer++;
                if(bq7.isChecked())correctAnswer++;
                if(bq8.isChecked())correctAnswer++;
                if(bq9.isChecked())correctAnswer++;
                if(bq10.isChecked())correctAnswer++;

                Toast.makeText(basic_level.this,"score "+correctAnswer,
                        Toast.LENGTH_SHORT).show();

                Intent result = new Intent(basic_level.this,result.class);
                result.putExtra("score",correctAnswer);
                startActivity(result);
            }
        });


    }
}
