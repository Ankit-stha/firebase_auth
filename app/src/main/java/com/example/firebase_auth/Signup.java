package com.example.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

    }

    public void signup(View view) {
        Intent signup=new Intent(Signup.this, MainActivity.class);
        startActivity(signup);
        Toast.makeText(this, "Now you can able to login", Toast.LENGTH_SHORT).show();
    }

    public void signin(View view) {
        Intent signin=new Intent(Signup.this, MainActivity.class);
        startActivity(signin);
    }
}