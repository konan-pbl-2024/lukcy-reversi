package com.example.lukcy_reversi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Button p1Button = (Button)findViewById(R.id.first);
        p1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, PlayActivity.class);
                intent.putExtra("button_pressed", true);
                startActivity(intent);
            }
        });

        Button p2Button = (Button)findViewById(R.id.second);
        p2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, PlayActivity.class);
                intent.putExtra("button_pressed", true);
                startActivity(intent);
            }
        });

        Button limit1Button = (Button)findViewById(R.id.limit1);
        limit1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, PlayActivity.class);
                intent.putExtra("button_pressed", true);
                startActivity(intent);
            }
        });

        Button limit2Button = (Button)findViewById(R.id.limit2);
        limit2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, PlayActivity.class);
                intent.putExtra("button_pressed", true);
                startActivity(intent);
            }
        });

        Button whiteButton = (Button)findViewById(R.id.siro);
        whiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, PlayActivity.class);
                intent.putExtra("button_pressed", true);
                startActivity(intent);
            }
        });

        Button blackButton = (Button)findViewById(R.id.kuro);
        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, PlayActivity.class);
                intent.putExtra("button_pressed", true);
                startActivity(intent);
            }
        });

        Button okButton = (Button)findViewById(R.id.ok);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new
                        Intent(SettingActivity.this, PlayActivity.class);
                startActivity(intent);

            }
        });
    }
}
