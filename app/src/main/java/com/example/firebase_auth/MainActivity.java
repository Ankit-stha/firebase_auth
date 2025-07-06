package com.example.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
        Intent login=new Intent(MainActivity.this,Login.class);
        startActivity(login);
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
    }

    public void forget(View view) {
        Intent forget=new Intent(MainActivity.this,forgetpassword.class);
        startActivity(forget);
        Toast.makeText(this, "You were able to change password", Toast.LENGTH_SHORT).show();
    }

    public void signup1(View view) {
        Intent signup=new Intent(MainActivity.this, Signup.class);
        startActivity(signup);
        Toast.makeText(this, "Now you can able to Signin", Toast.LENGTH_SHORT).show();
    }

    public void apple1(View view) {
        Intent applee=new Intent(MainActivity.this, apple.class);
        startActivity(applee);
    }

    public void facebook(View view) {
        Intent applee=new Intent(MainActivity.this, facebook.class);
        startActivity(applee);
    }
}