package com.nadirss14.msn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nadirss14.msn.views.ContainerActivity;
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

    public void login(View view){
        Intent intent= new Intent(LoginActivity.this, ContainerActivity.class);
        startActivity(intent);
    }

    public void goToHomePage(View view) {

        Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.nadirss14.com"));
        startActivity(intent);

    }
}
