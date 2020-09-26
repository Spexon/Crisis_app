package com.example.crisis_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewScreen extends AppCompatActivity {

     Button Button ;
     EditText Email ;
     EditText Password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button = (Button)findViewById(R.id.button3) ;
        //Added Functionality to Forgot User & Pass.
        TextView ForgotPassword = (TextView)findViewById(R.id.text2) ;
        TextView ForgotUsername = (TextView)findViewById(R.id.text) ;
        Email = (EditText)findViewById(R.id.editTextTextEmailAddress) ;
        Password = (EditText)findViewById(R.id.editTextTextPassword) ;

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("EditText", Email.getText().toString()) ;
                Log.d("EditText", Password.getText().toString()) ;
            }
        });

        //Activity for Forgot Username.
        ForgotUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TextView", "Username Forgotten!") ;
            }
        });

        //Activity for Forgot Password.
        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TextView", "Password Forgotten!") ;
            }
        });

    }
}