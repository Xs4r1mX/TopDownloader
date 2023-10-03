package com.s4r1m.topdownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(Splash.this,MainActivity.class);
        new Handler().postDelayed(() -> startActivity(intent),3000);




    }
}