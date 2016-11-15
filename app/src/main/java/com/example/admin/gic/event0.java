package com.example.admin.gic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class event0 extends AppCompatActivity {

    ImageView event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event0);

        event = (ImageView)findViewById(R.id.event0);

        event.setImageResource(R.drawable.android);
    }
}
