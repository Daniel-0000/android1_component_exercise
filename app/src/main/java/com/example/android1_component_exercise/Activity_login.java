package com.example.android1_component_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Logout(View view) {
        Intent intent = new Intent();
        intent.setClass(Activity_login.this, MainActivity.class);
        startActivity(intent);
    }

}