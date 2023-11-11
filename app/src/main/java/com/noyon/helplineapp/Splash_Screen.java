package com.noyon.helplineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Screen extends AppCompatActivity {



    TextView appName,appSlogan,appVersion;
    ImageView img;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this 2 line  for hide status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        //find id's
        appName=findViewById(R.id.appName);
        appSlogan=findViewById(R.id.appSlogan);
        appVersion=findViewById(R.id.appVersion);
         img =findViewById(R.id.img);

        //set animation top to bottom anim
        Animation anim1= AnimationUtils.loadAnimation(Splash_Screen.this,R.anim.top_to_bottom);
       img.startAnimation(anim1);


       //set bottom  to top anim
        Animation anim2=AnimationUtils.loadAnimation(Splash_Screen.this,R.anim.bottom_to_top);
        appName.startAnimation(anim2);
        appSlogan.startAnimation(anim2);
        appVersion.startAnimation(anim2);


        //set an delay then go to main page
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent=new Intent(Splash_Screen.this,MainActivity.class);
                startActivity(myIntent);
                finish();

            }
        },4000);





    }
}