package com.example.tiki_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tiki_app.MainActivitysca;
import com.example.tiki_app.MainActivityscb;
import com.example.tiki_app.R;
import com.example.tiki_app.model.Giay;

import java.util.List;

public class GiayAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Giay> listGiay;
    private int positionSelect = -1;

    public GiayAdapter(Context context, int idLayout, List<Giay> listGiay) {
        this.context = context;
        this.idLayout = idLayout;
        this.listGiay = listGiay;
    }

    @Override
    public int getCount() {
        return listGiay.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
    if (convertView == null){
        convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);
    }
        TextView tvName = convertView.findViewById(R.id.txtName);
        ImageView img = convertView.findViewById(R.id.img);
        final  Giay giay = listGiay.get(position);
        if(listGiay != null && !listGiay.isEmpty()){
            tvName.setText(giay.getName());
            img.setImageResource(giay.getImg());
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivityscb.class);
                intent.putExtra("giay",giay);
                context.startActivity(intent);
            }
        });
    return convertView;
    }
}
