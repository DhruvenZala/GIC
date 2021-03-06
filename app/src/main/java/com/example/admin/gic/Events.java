package com.example.admin.gic;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        GridView gridview = (GridView) findViewById(R.id.gridViewEvents);
        gridview.setAdapter(new Events.ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(Events.this, "" + position,
                  //      Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(), event0.class);
                        i.putExtra("id", position);
                        startActivity(i);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                // if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

        // references to our images
        private Integer[] mThumbIds = {
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
                R.drawable.d, R.drawable.about_us,
                R.drawable.associates, R.drawable.gtu,
                R.drawable.gtu, R.drawable.d,
        };


    }
}

