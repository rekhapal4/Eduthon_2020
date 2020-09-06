package com.example.moodify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.net.Uri;

public class HomeActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1 = (Button)findViewById(R.id.button_login);
        button2 = (Button)findViewById(R.id.button_login);
        button3 = (Button)findViewById(R.id.button_login);
        button4 = (Button)findViewById(R.id.button_login);
        button5 = (Button)findViewById(R.id.button_login);

        (findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://www.surveymonkey.com/r/CCTZWQ7";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        (findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://thenaturalside.com/7-yoga-poses-for-stress-relief-and-anxiety/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        (findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Meditation.class);
                startActivity(intent);
            }
        });

        (findViewById(R.id.button4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Diet.class);
                startActivity(intent);
            }
        });

        (findViewById(R.id.button5)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://www.free-training-tutorial.com/mindfulness.html";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}