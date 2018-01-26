package com.kuwait.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String msg = "Android: ";
        Log.d(msg, "onCreate() event");
    }
    protected void buttonOnClick(View view) {
        Toast toast = Toast.makeText(this, "47RONIN", Toast.LENGTH_LONG);
        view = findViewById(R.id.button);
    }
}
