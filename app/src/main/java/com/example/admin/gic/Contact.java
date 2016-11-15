package com.example.admin.gic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Contact extends AppCompatActivity {

    ImageView contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        contact = (ImageView)findViewById(R.id.contact);

        contact.setImageResource(R.drawable.gtu);

    }
}
