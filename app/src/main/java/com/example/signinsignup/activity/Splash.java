package com.example.signinsignup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.signinsignup.R;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }
    void initView(){

        countDownTimer();
    }
    void countDownTimer(){
        new CountDownTimer(2000,1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

                callSignInActivity();
            }
        }.start();


    }
    void callSignInActivity(){
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
        finish();
    }
}
