package id.go.bpkp.mystrats.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import id.go.bpkp.mystrats.R;

public class MAPMenuActivity extends AppCompatActivity {
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private HomeFragment homeFragment;
    private MessageFragment messageFragment;
    private NotificationFragment notificationFragment;
    private PersonFragment personFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapmenu);

        mMainFrame = (FrameLayout) findViewById(R.id.main_nav);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        messageFragment = new MessageFragment();
        notificationFragment = new NotificationFragment();
        personFragment = new PersonFragment();

        setFragment(homeFragment);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int i = item.getItemId();
                if (i == R.id.nav_home) {
//                    mMainNav.setItemBackgroundResource(R.color.colorGray);
                    setFragment(homeFragment);
                    return true;
                } else if (i == R.id.nav_message) {
//                    mMainNav.setItemBackgroundResource(R.color.colorGray);
                    setFragment(messageFragment);
                    return true;
                } else if (i == R.id.nav_notification) {
//                    mMainNav.setItemBackgroundResource(R.color.colorGray);
                    setFragment(notificationFragment);
                    return true;
                }else if (i == R.id.nav_person) {
//                    mMainNav.setItemBackgroundResource(R.color.colorGray);
                    setFragment(personFragment);
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }

}
