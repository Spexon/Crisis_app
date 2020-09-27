package com.example.crisis_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabItem;

public class MainWindow extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);
        TabItem tipsTab = findViewById(R.id.tab_tips);
        TabItem alertTab = findViewById(R.id.tab_alert);
        TabItem quizTab = findViewById(R.id.tab_quiz);
        TabItem profileTab = findViewById(R.id.tab_profile);

    }

    public void onClick(View v) {
        Intent myIntent = new Intent(v.getContext(), Signup.class);
        startActivityForResult(myIntent, 0);
    }

}
