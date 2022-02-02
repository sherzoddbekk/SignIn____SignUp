package com.example.signinsignup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.signinsignup.R;

public class SignUp extends AppCompatActivity {
EditText email,password,confirm,fullname;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
    }
    void  initView(){
        email = findViewById(R.id.email_signin);
        password = findViewById(R.id.password_signin);
        confirm = findViewById(R.id.confirm_signup);
        fullname = findViewById(R.id.fullname_signup);
        TextView tx_signIn = findViewById(R.id.signIn_pass);


        Button button = findViewById(R.id.button_signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });
        tx_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignInActivity();
            }
        });
    }
    void openHomeActivity(){
        Intent intent = new Intent(this,OpenActivity.class);
        startActivity(intent);
    }
    void openSignInActivity(){
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
    }
}
