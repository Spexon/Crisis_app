package com.example.crisis_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    String LOG_TAG = MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button createAccountBtn = (Button)findViewById(R.id.create_account_btn);
        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Signup.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next = (Button)findViewById(R.id.button) ;
        Button createAccount = (Button)findViewById(R.id.create_account_btn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), NewScreen.class) ;
                startActivityForResult(myIntent, 0) ;
                Log.d(LOG_TAG, "Button pressed!") ;
            }
        });

        //Activity for Create Account Button.
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.d(LOG_TAG, "Creating Account!") ;
                //  startActivityForResult(myIntent, 0);
            }
        });
    }

    public void launchSecondActivity(View view)
    {
        Log.d(LOG_TAG, "Button pressed!") ;
        setContentView(R.layout.signup);
    }
}