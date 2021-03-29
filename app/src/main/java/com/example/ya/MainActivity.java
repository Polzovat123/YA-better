package com.example.ya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Info(View v){
        Intent intent = new Intent(this, Favorites.class);
        startActivity(intent);
    }
    public void Search(View v){
        Intent intent = new Intent(this, Favorites.class);
        startActivity(intent);
    }
    public void Add(View v){
        Intent intent = new Intent(this, Favorites.class);
        startActivity(intent);
    }
}