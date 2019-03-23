package com.nadirss14.msn.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


import com.nadirss14.msn.R;

import java.util.function.ToLongBiFunction;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
       showToolbar(getResources().getString(R.string.my_toolbar_title_create_account),true);

    }

    public void showToolbar(String _title,boolean _backUp){
        Toolbar tollbar=(Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(tollbar);
        getSupportActionBar().setTitle(_title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(_backUp);
    }


}
