package com.example.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText txt_email,txt_password;
    Button btn_login;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        firebaseAuth=FirebaseAuth.getInstance();
        txt_email=findViewById(R.id.txt1);
        txt_password=findViewById(R.id.txt_password);
        btn_login=findViewById(R.id.btn1);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=txt_email.getText().toString().trim();
                String password=txt_password.getText().toString().trim();
                if (email.isEmpty()){
                    Toast.makeText(MainActivity.this, "please fillup email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.isEmpty()){
                    Toast.makeText(MainActivity.this, "please fillup password", Toast.LENGTH_SHORT).show();
                    return;
                }
                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "signin successfull", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(getApplicationContext(), Login.class);
                            startActivity(intent);
                        }else {
                            Toast.makeText(MainActivity.this, "Signin unsuccessfull", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });


    }
    public void login1(View view) {
        Intent login=new Intent(MainActivity.this,Login.class);
        startActivity(login);
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
    }

    public void forget(View view) {
        Intent forget=new Intent(MainActivity.this, Forgetpassword.class);
        startActivity(forget);
        Toast.makeText(this, "You were able to change password", Toast.LENGTH_SHORT).show();
    }

    public void signup1(View view) {
        Intent Signup=new Intent(MainActivity.this, Signup.class);
        startActivity(Signup);
        Toast.makeText(this, "Now you can able to Signin", Toast.LENGTH_SHORT).show();
    }

    public void apple1(View view) {
        Intent applee=new Intent(MainActivity.this, apple.class);
        startActivity(applee);
    }

    public void facebook(View view) {
        Intent facebook1=new Intent(MainActivity.this, facebook.class);
        startActivity(facebook1);
    }

}
