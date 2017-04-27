package com.artytect.android.artysmdapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome !");
        toolbar.setSubtitle("Folks !");

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String msg = "";
                switch (item.getItemId()) {
                    case R.id.discard:
                        msg = getString(R.string.delete);
                        break;
                    case R.id.search:
                        msg = getString(R.string.search);
                        break;
                    case R.id.edit:
                        msg = getString(R.string.edit);
                        break;
                    case R.id.settings:
                        msg = getString(R.string.settings);
                        break;
                    case R.id.Exit:
                        msg = getString(R.string.exit);
                        break;
                }

                Toast.makeText(MainActivity.this, msg + " clicked !", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

//        toolbar.setLogo(R.drawable.good_day);
//        toolbar.setNavigationIcon(R.drawable.navigation_back);

//        // Compatibility by JAVA - check if we're running on Android 5.0 or higher
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            // Call some material design APIs here
//            toolbar.setElevation(10f);
//        } else { // For Below API 21
//            // Implement this feature without material design
//        }
    }
}