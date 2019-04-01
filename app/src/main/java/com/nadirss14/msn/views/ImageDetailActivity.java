package com.nadirss14.msn.views;

import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;

import com.nadirss14.msn.R;

public class ImageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);
        showToolbar("",true);
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setEnterTransition(new Fade());
        }
    }

    public void showToolbar(String _title,boolean _backUp){
        Toolbar tollbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tollbar);
        getSupportActionBar().setTitle(_title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(_backUp);

        CollapsingToolbarLayout collapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsing_tollbar);

    }

}
