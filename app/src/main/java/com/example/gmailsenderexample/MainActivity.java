package com.example.gmailsenderexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gmailsender.GmailSender;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GmailSender.sendEmail("homeeats.ris.2020@gmail.com", "HomeEats123", "ramyeg26@gmail.com", "Test", "Test email.");
    }
}
