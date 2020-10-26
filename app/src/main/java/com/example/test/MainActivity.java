package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.HttpURLConnection;
import java.net.URL;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edMail;
    private EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edMail = findViewById(R.id.ed_email);
        edPassword = findViewById(R.id.ed_password);
        Button button = findViewById(R.id.login);

    }

    @Override
    public void onClick(View v) {
        //Thread thread = new Thread(mutiThread);
        //thread.start();
    }

}