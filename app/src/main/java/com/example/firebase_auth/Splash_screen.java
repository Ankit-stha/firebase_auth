package com.example.firebase_auth;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);


    ImageView imageView =findViewById(R.id.img);
    TextView textView = findViewById(R.id.txt);

    Animation animation1= AnimationUtils.loadAnimation(this, R.anim.blink_animation);
    Animation animation2= AnimationUtils.loadAnimation(this,R.anim.animation);
    imageView.startAnimation(animation1);
    textView.startAnimation(animation2);
    Thread thread =new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                sleep(5000);
                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
        }
    }

    });
    thread.start();


    }


}