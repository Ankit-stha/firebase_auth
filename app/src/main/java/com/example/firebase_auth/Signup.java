package com.example.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {
    EditText txt_fullname,txt_email,txt_password,txt_phone;
    Button btn_signup;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        firebaseAuth= FirebaseAuth.getInstance();

        txt_fullname=findViewById(R.id.txt_fullname);
        txt_email=findViewById(R.id.txt_email);
        txt_phone=findViewById(R.id.txt_phone);
        txt_password=findViewById(R.id.txt_password);
        btn_signup=findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = txt_fullname.getText().toString().trim();
                String email=txt_email.getText().toString().trim();
                String phonenumber=txt_phone.getText().toString().trim();
                String password=txt_password.getText().toString().trim();

                if (fullname.isEmpty()){
                    Toast.makeText(Signup.this, "Please fillup first name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (phonenumber.isEmpty()){
                    Toast.makeText(Signup.this, "Please fillup mobile number", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (email.isEmpty()){
                    Toast.makeText(Signup.this, "Please fillup email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.isEmpty()){
                    Toast.makeText(Signup.this, "Please fillup password", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(Signup.this, "signup is sucessfull", Toast.LENGTH_SHORT).show();
                                Intent intentlogin=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intentlogin);
                        }else {
                                Toast.makeText(Signup.this, "Not successfull", Toast.LENGTH_SHORT).show();
                            }
                     }
                    });
                }


        });
}

    public void sign_up(View view) {
        Intent Signupintent=new Intent(Signup.this, MainActivity.class);
        startActivity(Signupintent);
        Toast.makeText(this, "Now you can able to login", Toast.LENGTH_SHORT).show();
    }

    public void sign_in(View view) {
        Intent Signinintent=new Intent(Signup.this, MainActivity.class);
        startActivity(Signinintent);
    }

}