package id.go.bpkp.mystrats.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.go.bpkp.mystrats.R;
import id.go.bpkp.mystrats.controller.MAPUtils;

public class MAPMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapmenu);

        findViewById(R.id.logout_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keluar();
            }
        });
    }

    /** Menuju ke MainActivity dan Set User dan Status sedang login, di Preferences */
    private void keluar(){
        MAPUtils.clearLoggedInUser(this);
        startActivity(new Intent(getBaseContext(),MAPLoginActivity.class));finish();
    }
}
