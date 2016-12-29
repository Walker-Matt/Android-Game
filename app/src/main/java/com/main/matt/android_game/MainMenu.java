package com.main.matt.android_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    //Menu options
    private Button play_button;
    private Button settings_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //get buttons from layout
        play_button = (Button) findViewById(R.id.play_button);
        settings_button = (Button) findViewById(R.id.settings_button);
        settings_button.setEnabled(false);
        setListeners();
    }

    private void setListeners() {
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Play.class);
                startActivity(intent);
            }
        });
        settings_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Settings.class);
                startActivity(intent);
            }
        });
    }
}
