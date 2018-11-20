package com.electrodiligent.rewardiligent;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextMessage;
    public FrameLayout frameLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle("Home");
                    loadFragment(new HomeFragment());
                    return true;

                case R.id.navigation_planner:
                    setTitle("Planner");
                    loadFragment(new PlannerFragment());
                    return true;

                case R.id.navigation_todo:
                    setTitle("Todo");
                    loadFragment(new TodoFragment());
                    return true;

                case R.id.navigation_rewards:
                    setTitle("Rewards");
                    loadFragment(new RewardsFragment());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.generic_add).setOnClickListener(this);
        frameLayout = (FrameLayout) findViewById(R.id.navigation_frame_layout);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new HomeFragment());
    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.navigation_frame_layout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.generic_add:
                Toast.makeText(this, "Generic add button clicked", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(MainActivity.this, GenericAddActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
                break;
            default:
                return;
        }
    }
}
