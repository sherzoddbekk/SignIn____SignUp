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

public class SignIn extends AppCompatActivity {

    EditText email, password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initView();
    }
    void  initView(){
        email = findViewById(R.id.email_signin);
        password = findViewById(R.id.password_signin);
        TextView tx_signUp = findViewById(R.id.signUp_pass);


        Button button = findViewById(R.id.button_signin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    openHomeActivity();
            }
        });
        tx_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpActivity();
            }
        });
    }
    void openHomeActivity(){
        Intent intent = new Intent(this,OpenActivity.class);
        startActivity(intent);
        finish();
    }
    void openSignUpActivity(){
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);

    }

}
