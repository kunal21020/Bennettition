package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    ImageButton like;
    ImageButton dislike;
    ImageButton refresh;
    ImageButton profile;
    ImageButton chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        like = findViewById(R.id.like);
        dislike = findViewById(R.id.dislike);
        refresh = findViewById(R.id.refresh);
        profile = findViewById(R.id.profile);
        chat = findViewById(R.id.chat);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profile.this, "no previous profile", Toast.LENGTH_SHORT).show();
                return;

            }
        });
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), no_profile_show.class);
                startActivity(intent);
                finish();

            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), chat.class);
                startActivity(intent);
                finish();

            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profile.this, "you found a match", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), no_profile_show.class);
                startActivity(intent);
                finish();

            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}