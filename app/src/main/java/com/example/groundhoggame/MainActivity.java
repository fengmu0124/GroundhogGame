package com.example.groundhoggame;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView groundhogImage;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groundhogImage = findViewById(R.id.groundhogImage);

        groundhogImage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // 处理触摸事件，移动土拨鼠图像
                groundhogImage.setX(event.getX() - groundhogImage.getWidth() / 2);
                groundhogImage.setY(event.getY() - groundhogImage.getHeight() / 2);
                return true;
            }
        });
    }
}
