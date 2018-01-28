package com.kuwait.myapplication;

import android.content.Intent;
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
    public void onClick(View view) {
        //Toast.makeText(this, "47RONIN", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
