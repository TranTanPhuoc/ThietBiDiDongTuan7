package com.example.tiki_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.tiki_app.model.Giay;

public class MainActivityscb extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityscb);
        Intent intent = getIntent();
        Giay giay = (Giay) intent.getSerializableExtra("giay");
        img = findViewById(R.id.imgItem);
        img.setImageResource(giay.getImg());
    }
}