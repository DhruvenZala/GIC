package com.example.admin.gic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class associate0 extends AppCompatActivity {

    ImageView associate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_associate0);

        associate = (ImageView)findViewById(R.id.associate0);

        associate.setImageResource(R.drawable.associate0);

    }
}
