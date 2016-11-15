package com.example.admin.gic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class associate extends AppCompatActivity {

    public String associateName[]={"Android","Art","Tree","Toy Story","Five","Kool"};
    public String associateDetail[]={"This is how Android toy looks like",
            "Different Mystique art",
            "A Symetric Tree",
            "The Toy Story 4 ",
            "That's how 5 looks on a Graphical scale",
            "I'll let you decide what it is.."};
    public int associateImg[]={
            R.drawable.d,
            R.drawable.d,
            R.drawable.d,
            R.drawable.d,
            R.drawable.d,
            R.drawable.d
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_associate);

        ListView list=(ListView) findViewById(R.id.listPlayers);
        CustomAdapter customAdapter = new CustomAdapter(this,associateName,associateDetail,associateImg);
        //Toast.makeText(this, "Below Values", Toast.LENGTH_SHORT).show();
        list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),associate0.class);
                startActivity(i);
            }
        });
    }
}
