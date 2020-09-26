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

        Button next = (Button)findViewById(R.id.button) ;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), NewScreen.class) ;
                startActivityForResult(myIntent, 0) ;
            }
        });
    }

    public void launchSecondActivity(View view)
    {
        Log.d(LOG_TAG, "Button pressed!") ;

        setContentView(R.layout.signup);

    }
}