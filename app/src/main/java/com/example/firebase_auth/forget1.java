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

public class forget1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forget1);

    }
    public void forget1(View view) {
        Intent reset=new Intent(forget1.this, MainActivity.class);
        startActivity(reset);
        Toast.makeText(this, "Your password has been changed ", Toast.LENGTH_SHORT).show();
    }
}