package com.example.latihan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class verifycode extends AppCompatActivity {
    //  17-04-2020, 10117151, prayogamps, IF4
    private EditText editverifycode;
    private Button btnsend;
    public static final String edt_verifycode="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifycode);

        editverifycode = findViewById(R.id.verify_code);
        btnsend  = findViewById(R.id.send_code);
        //set clicklistener
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edt_verifycode = editverifycode.getText().toString();
                //
                if (edt_verifycode.isEmpty()){
                    editverifycode.setError("kode harus di isi..");
                    return;
                }
                //panggil function login
                login(edt_verifycode);
            }
        });
    }
    private void login(String edt_verifycode){
        Intent intent = new Intent (verifycode.this,userhome.class);
        startActivity(intent);
    }
}
