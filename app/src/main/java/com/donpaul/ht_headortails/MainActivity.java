package com.donpaul.ht_headortails;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView img_h;
    Random r;
    int coinside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        img_h = (ImageView) findViewById(R.id.img_h);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coinside = r.nextInt(2);
                if(coinside == 0) {
                    img_h.setImageResource(R.drawable.head);
                    Toast.makeText(MainActivity.this,"HEAD", Toast.LENGTH_SHORT).show();
                }
                else {
                    img_h.setImageResource(R.drawable.tail);
                    Toast.makeText(MainActivity.this,"TAIL", Toast.LENGTH_SHORT).show();
                }
                RotateAnimation rotate = new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(1000);
                img_h.startAnimation(rotate);

            }
        });
    }
}
