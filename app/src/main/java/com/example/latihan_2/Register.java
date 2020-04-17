package com.example.latihan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends AppCompatActivity {
    //  17-04-2020, 10117151, prayogamps, IF4
    private EditText editusername1;
    private Button btnreg;
    public static final String edtusername1 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editusername1 = findViewById(R.id.username1);
        btnreg = findViewById(R.id.registerbtn);
        //set clicklisterner
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edtusername1 = editusername1.getText().toString();
                //
                if (edtusername1.isEmpty()){
                    editusername1.setError("username tidak boleh kosong");
                    return;
                }

                //panggil function login
                login(edtusername1);

            }
        });
    }
    private void login(String edtusername1){
        Intent intent = new Intent(Register.this,Verify.class);
        startActivity(intent);
    }
}