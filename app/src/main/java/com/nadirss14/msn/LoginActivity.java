package com.nadirss14.msn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nadirss14.msn.views.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public  void goCreateAccount(View view ){
        Intent intent=new Intent(LoginActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }
}
