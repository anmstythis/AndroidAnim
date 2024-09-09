package com.example.bird_anim;

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

public class MainActivity3 extends AppCompatActivity {
    private ImageView img;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        img = findViewById(R.id.img_tween);
        startBtn = findViewById(R.id.start_tween);
        pauseBtn = findViewById(R.id.pause_tween);

        Animation tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.common_animation);
        Animation scaleButton = AnimationUtils.loadAnimation(this, R.anim.button_animation);

        img.startAnimation(scaleButton);
        startBtn.startAnimation(scaleButton);
        pauseBtn.startAnimation(scaleButton);

        startBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                img.startAnimation(tweenAnimation);
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                img.clearAnimation();
            }
        });
    }
}