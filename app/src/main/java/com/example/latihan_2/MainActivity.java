package com.example.latihan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //  15-04-2020, 10117151, prayogamps, IF4
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Register(View view) {
        Intent intent = new Intent(MainActivity.this,Register.class);
        startActivity(intent);
    }
}
