package com.example.peggy.a0726;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ARButton;
    private Button BookButton;
    private Button ChatBotButton;
    private Button CupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ARButton = (Button) findViewById(R.id.ARButton);
        BookButton = (Button) findViewById(R.id.BookButton);
        ChatBotButton = (Button) findViewById(R.id.ChatBotButton);
        CupButton = (Button) findViewById(R.id.CupButton);

        ARButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ARActivity.class);
                startActivity(intent);
            }
        });
        BookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
        ChatBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChatBotActivity.class);
                startActivity(intent);
            }
        });
        CupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CupActivity.class);
                startActivity(intent);
            }
        });
    }
}
