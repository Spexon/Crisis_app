package com.example.crisis_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewScreen extends AppCompatActivity {

     String fakeUserEmail1 = "hackathon@yahoo.com";
     String fakeUserPassword1 = "ShellHacks2020";
     Button Button ;
     EditText Email ;
     EditText Password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button = (Button)findViewById(R.id.button3) ;
        Email = (EditText)findViewById(R.id.editTextTextEmailAddress) ;
        Password = (EditText)findViewById(R.id.editTextTextPassword) ;

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("EditText", Email.getText().toString()) ;
                Log.d("EditText", Password.getText().toString()) ;

                if ((Email.getText().toString().equalsIgnoreCase(fakeUserEmail1)) && (Password.getText().toString().equals(fakeUserPassword1))) {
                    System.out.println("Access Granted!");
                    Intent myIntent = new Intent(v.getContext(), MainWindow.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });




    }
}