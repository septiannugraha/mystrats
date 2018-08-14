package id.go.bpkp.mystrats.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.go.bpkp.mystrats.R;

public class MAPSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // langsung pindah ke MainActivity atau activity lain begitu memasuki
        // splash screen ini
        Intent intent = new Intent(this, MAPLoginActivity.class);
        startActivity(intent);
        finish();
    }
}
