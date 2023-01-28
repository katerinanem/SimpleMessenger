package com.example.simplemessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecievedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);

        TextView messageText = findViewById(R.id.messageText);



        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        messageText.setText(message);
    }
}