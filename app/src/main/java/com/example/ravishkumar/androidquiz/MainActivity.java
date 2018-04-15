package com.example.ravishkumar.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText userName , email;
    RadioButton basic_,intermediate,advanced;
    String message = "Welcome ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        userName = (EditText)findViewById(R.id.username);
        email = (EditText)findViewById(R.id.email);
        basic_= (RadioButton) findViewById(R.id.basic_level);
        intermediate = (RadioButton) findViewById(R.id.intermediate_level);
        advanced = (RadioButton) findViewById(R.id.advanced_level);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = userName.getText().toString();
                final String mailId = email.getText().toString();
                Toast.makeText(MainActivity.this,"welcome "+name,Toast.LENGTH_SHORT).show();

                if(basic_.isChecked()){
                    Intent basicIntent = new Intent(MainActivity.this, basic_level.class);
                    startActivity(basicIntent);

                }
                else if(intermediate.isChecked()){
                    Intent intermediateIntent = new Intent(MainActivity.this, intermediate_level.class);
                    startActivity(intermediateIntent);

                }
                else {
                    Intent advancedIntent = new Intent(MainActivity.this, advanced_level.class);
                    startActivity(advancedIntent);
                }


            }
        });



    }
}
