package com.example.tiki_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tiki_app.adapter.GiayAdapter;
import com.example.tiki_app.model.Giay;

import java.util.ArrayList;
import java.util.List;

public class MainActivitysca extends AppCompatActivity {
    private ListView listView;
    private List<Giay> list ;
    private GiayAdapter giayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysca);
        listView = findViewById(R.id.listView);
        list = new ArrayList<>();
        list.add(new Giay("Nike shoes-discount 50%",R.drawable.shoes_rm_preview_b));
        list.add(new Giay("Adidas shoes-discount 80%",R.drawable.shoes_rm_preview_a));
        list.add(new Giay("Nike Bicycle-discount 30%",R.drawable.shoes_rm_purple));
        list.add(new Giay("Yonex shoes-discount 50%",R.drawable.shoes_rm_preview));
        list.add(new Giay("Victor shoes-discount 50%",R.drawable.shoes_rm_yellow));
        list.add(new Giay("Lining shoes-discount 50%",R.drawable.shoes_white_removebg_preview));
        giayAdapter = new GiayAdapter(this,R.layout.item,list);
        listView.setAdapter(giayAdapter);
    }
}