package com.example.taekwondoscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public int hongScore = 0;
    public int chongScore = 0;

    Button hong, chong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        hong = findViewById(R.id.chong);
        chong = findViewById(R.id.hong);

    }


    public void incrementChong(View view) {

        chongScore++;
        chong.setText(String.valueOf(chongScore));

    }

    public void incrementHong(View view) {
        hongScore++;
        hong.setText(String.valueOf(hongScore));
    }

}