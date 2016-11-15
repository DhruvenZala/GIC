package com.example.admin.gic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {



    private String[] playerName;
    private String[] playerDetail;
    private int[] imageId;
    Context context;

    public CustomAdapter(Context context, String[] playerName, String[] playerDetail, int[] imageId) {
        super(context, R.layout.layout_listview, playerDetail);
        this.context = context;
        this.playerDetail=playerDetail;
        this.playerName=playerName;
        this.imageId=imageId;
    }


    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listView = inflater.inflate(R.layout.layout_listview,null,true);

        TextView txtPlayerName = (TextView) listView.findViewById(R.id.txtPlayerName);
        TextView txtPlayerDetail = (TextView) listView.findViewById(R.id.txtPlayerDetail);
        ImageView imgPlayer = (ImageView) listView.findViewById(R.id.imgplayer);

        txtPlayerDetail.setText(playerDetail[position]);
        txtPlayerName.setText(playerName[position]);
        imgPlayer.setImageResource(imageId[position]);

        // Toast.makeText(getContext(),"Value: "+txtPlayerName.getText(),Toast.LENGTH_SHORT).show();
        // Log.d("Value","Data");
        return listView;
    }
}