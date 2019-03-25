package com.nadirss14.msn.views;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.nadirss14.msn.R;
import com.nadirss14.msn.views.fragments.HomeFragment;
import com.nadirss14.msn.views.fragments.ProfileFragment;
import com.nadirss14.msn.views.fragments.SearchCardFragment;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        callBottomBar();
    }

    private  void callBottomBar(){
        BottomNavigationView botonBar= findViewById(R.id.bottom_navigation_view);

        botonBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem _menuItem) {

                int nameMenu=_menuItem.getItemId();

                switch(nameMenu){
                    case R.id.option_home:
                        switchFragment(new HomeFragment());
                        break;
                    case R.id.option_profile:
                        switchFragment(new ProfileFragment());
                        break;
                    case  R.id.option_search:
                        switchFragment(new SearchCardFragment());
                        break;
                }

                return true;
            }
        });

        botonBar.setSelectedItemId(R.id.option_home);
    }

    private void switchFragment(Fragment _fragment){

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.my_container,_fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();
    }
}
