package com.example.ravishkumar.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class intermediate_level extends AppCompatActivity {
    EditText iq1,iq2,iq3,iq4,iq5,iq6,iq7,iq8,iq9,iq10;
    Button submit2;
    int correctAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_level);
        iq1=findViewById(R.id.Iq1Ans);
        iq2=findViewById(R.id.Iq2Ans);
        iq3=findViewById(R.id.Iq3Ans);
        iq4=findViewById(R.id.Iq4Ans);
        iq5=findViewById(R.id.Iq5Ans);
        iq6=findViewById(R.id.Iq6Ans);
        iq7=findViewById(R.id.Iq7Ans);
        iq8=findViewById(R.id.Iq8Ans);
        iq9=findViewById(R.id.Iq9Ans);
        iq10=findViewById(R.id.Iq10Ans);
        submit2=findViewById(R.id.submit_level2);

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iq1.getText().toString().equals("FINISH"))correctAnswer++;
                if(iq2.getText().toString().equals("KEYTOOL"))correctAnswer++;
                if(iq3.getText().toString().equals("APPLICATION PROGRAMMING INTERFACE"))correctAnswer++;
                if(iq4.getText().toString().equals("READ_CONTACTS"))correctAnswer++;
                if(iq5.getText().toString().equals("ANDROID.VIEW.VIEW"))correctAnswer++;
                if(iq6.getText().toString().equals("ANDROID DEBUG BRIDGE"))correctAnswer++;
                if(iq7.getText().toString().equals("FINISH"))correctAnswer++;
                if(iq8.getText().toString().equals("ONPAUSE"))correctAnswer++;
                if(iq9.getText().toString().equals("GOOGLE CLOUD MESSAGING"))correctAnswer++;
                if(iq10.getText().toString().equals("SOURCE DEVELOPEMENT KIT"))correctAnswer++;



                Toast.makeText(intermediate_level.this,"score "+correctAnswer,
                        Toast.LENGTH_SHORT).show();

                Intent result = new Intent(intermediate_level.this,result.class);
                result.putExtra("score",correctAnswer);
                startActivity(result);


            }
        });


    }
}
