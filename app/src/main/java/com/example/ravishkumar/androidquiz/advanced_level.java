package com.example.ravishkumar.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class advanced_level extends AppCompatActivity {
    CheckBox aq1,aq2,aq3,aq4,aq5,aq6,aq7,aq8,aq9,aq10;
    CheckBox aq11,aq12,aq13,aq14,aq15,aq16,aq17,aq18,aq19,aq20;
    CheckBox aq21,aq22,aq23,aq24,aq25,aq26,aq27,aq28,aq29,aq30;
    CheckBox aq31,aq32,aq33,aq34,aq35,aq36,aq37,aq38,aq39,aq40;

    Button submit;
    int correctAnswer = 0;

    private void initialiseId()
    {
        aq1 = findViewById(R.id.advanced_Q1A);
        aq2 = findViewById(R.id.advanced_Q1B);
        aq3 = findViewById(R.id.advanced_Q1C);
        aq4 = findViewById(R.id.advanced_Q1D);

        aq5 = findViewById(R.id.advanced_Q2A);
        aq6 = findViewById(R.id.advanced_Q2B);
        aq7 = findViewById(R.id.advanced_Q2C);
        aq8 = findViewById(R.id.advanced_Q2D);

        aq9 = findViewById(R.id.advanced_Q3A);
        aq10 = findViewById(R.id.advanced_Q3B);
        aq11 = findViewById(R.id.advanced_Q3C);
        aq12 = findViewById(R.id.advanced_Q3D);

        aq13 = findViewById(R.id.advanced_Q4A);
        aq14 = findViewById(R.id.advanced_Q4B);
        aq15 = findViewById(R.id.advanced_Q4C);
        aq16 = findViewById(R.id.advanced_Q4D);

        aq17 = findViewById(R.id.advanced_Q5A);
        aq18= findViewById(R.id.advanced_Q5B);
        aq19= findViewById(R.id.advanced_Q5C);
        aq20= findViewById(R.id.advanced_Q5D);

        aq21 = findViewById(R.id.advanced_Q6A);
        aq22 = findViewById(R.id.advanced_Q6B);
        aq23 = findViewById(R.id.advanced_Q6C);
        aq24 = findViewById(R.id.advanced_Q6D);

        aq25 = findViewById(R.id.advanced_Q7A);
        aq26 = findViewById(R.id.advanced_Q7B);
        aq27 = findViewById(R.id.advanced_Q7C);
        aq28= findViewById(R.id.advanced_Q7D);

        aq29= findViewById(R.id.advanced_Q8A);
        aq30= findViewById(R.id.advanced_Q8B);
        aq31 = findViewById(R.id.advanced_Q8C);
        aq32 = findViewById(R.id.advanced_Q8D);

        aq33 = findViewById(R.id.advanced_Q9A);
        aq34 = findViewById(R.id.advanced_Q9B);
        aq35 = findViewById(R.id.advanced_Q9C);
        aq36 = findViewById(R.id.advanced_Q9D);

        aq37 = findViewById(R.id.advanced_Q10A);
        aq38= findViewById(R.id.advanced_Q10B);
        aq39= findViewById(R.id.advanced_Q10C);
        aq40= findViewById(R.id.advanced_Q10D);

        submit = findViewById(R.id.submit_level3);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_level);
        initialiseId();

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if(!aq1.isChecked()&&aq2.isChecked()&&aq3.isChecked()&&!aq4.isChecked())correctAnswer++;
               if(aq5.isChecked()&&!aq6.isChecked()&&!aq7.isChecked()&&!aq8.isChecked())correctAnswer++;
               if(aq9.isChecked()&&!aq10.isChecked()&&aq11.isChecked()&&!aq12.isChecked())correctAnswer++;
               if(!aq13.isChecked()&&!aq14.isChecked()&&!aq15.isChecked()&&aq16.isChecked())correctAnswer++;
               if(aq17.isChecked()&&!aq18.isChecked()&&aq19.isChecked()&&!aq20.isChecked())correctAnswer++;
               if(!aq21.isChecked()&&!aq22.isChecked()&&!aq23.isChecked()&&aq24.isChecked())correctAnswer++;
               if(aq25.isChecked()&&aq26.isChecked()&&!aq27.isChecked()&&aq28.isChecked())correctAnswer++;
               if(!aq29.isChecked()&&!aq30.isChecked()&&!aq31.isChecked()&&aq32.isChecked())correctAnswer++;
               if(!aq31.isChecked()&&!aq34.isChecked()&&!aq35.isChecked()&&aq36.isChecked())correctAnswer++;
               if(!aq35.isChecked()&&!aq38.isChecked()&&aq39.isChecked()&&!aq40.isChecked())correctAnswer++;

               Toast.makeText(advanced_level.this,"score "+correctAnswer,
                       Toast.LENGTH_SHORT).show();

               Intent result = new Intent(advanced_level.this,result.class);
               result.putExtra("score",correctAnswer);
               startActivity(result);
               correctAnswer=0;


           }
       });




    }
}
