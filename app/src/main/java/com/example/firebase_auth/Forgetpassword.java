package com.example.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Forgetpassword extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgetpassword);

    }

    public void forget2(View view) {
        Intent reset=new Intent(Forgetpassword.this, forget1.class);
        startActivity(reset);
        Toast.makeText(this, "You can change password from here!!", Toast.LENGTH_LONG).show();
    }


    public void facebook(View view) {
    }
}