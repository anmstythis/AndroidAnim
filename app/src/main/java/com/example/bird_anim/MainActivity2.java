package com.example.bird_anim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img;
    private Button startBtn;
    private Button pauseBtn, moveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.img_blink);
        startBtn = findViewById(R.id.start_tween);
        pauseBtn = findViewById(R.id.pause_tween);
        moveBtn = findViewById(R.id.moveButton);

        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
        Animation scaleButton = AnimationUtils.loadAnimation(this, R.anim.button_animation);

        img.startAnimation(scaleButton);
        startBtn.startAnimation(scaleButton);
        pauseBtn.startAnimation(scaleButton);
        moveBtn.startAnimation(scaleButton);

        startBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                img.startAnimation(blinkAnimation);
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                img.clearAnimation();
            }
        });
    }
    public void StartNewActivity2(View v)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}



