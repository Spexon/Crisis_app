package com.example.crisis_app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

       /* alertTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // load First Fragment
                //loadFragment(new FirstFragment());
                Intent myIntent = new Intent(v.getContext(), MainWindowAlert.class);
                startActivityForResult(myIntent, 0);
            }
        });*/

    }

  /*  public void onClick(View v) {
        Intent myIntent = new Intent(v.getContext(), Signup.class);
        startActivityForResult(myIntent, 0);
    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }*/
}
