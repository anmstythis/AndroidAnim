package com.example.bird_anim;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
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

public class MainActivity extends AppCompatActivity {
    private ImageView animationIV;
    private Button startBtn, pauseBtn, moveBtn;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);

        frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        startBtn.setOnClickListener(v -> {
            if (!frameAnimation.isRunning())
            {
                frameAnimation.start();
            }
        });

        pauseBtn.setOnClickListener(v -> {
            if (frameAnimation.isRunning())
            {
                frameAnimation.stop();
            }
        });


    }
    public void StartNewActivity(View v)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}