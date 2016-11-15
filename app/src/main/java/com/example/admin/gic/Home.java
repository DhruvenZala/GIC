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

public class Home extends AppCompatActivity {


    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logo = (ImageView) findViewById(R.id.logo);

        logo.setImageResource(R.drawable.gtu);

        GridView gridview = (GridView) findViewById(R.id.gridView);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                switch (position) {
                    case 0:

                        Intent i = new Intent(getApplicationContext(), Events.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;

                    case 1:
                        //Use some different intent here
                        Intent j = new Intent(getApplicationContext(), Gallery.class);
                        j.putExtra("id", position);
                        startActivity(j);
                        break;
                    case 2:
                        //Use some different intent here
                        Intent k = new Intent(getApplicationContext(), associate.class);
                        k.putExtra("id", position);
                        startActivity(k);
                        break;
                    case 3:
                        //Use some different intent here
                        Intent l = new Intent(getApplicationContext(), Clubs.class);
                        l.putExtra("id", position);
                        startActivity(l);
                        break;

                    case 4:
                        //Use some different intent here
                        Intent m = new Intent(getApplicationContext(), aboutUs.class);
                        m.putExtra("id", position);
                        startActivity(m);
                        break;

                    case 5:
                        //Use some different intent here
                        Intent n = new Intent(getApplicationContext(), Contact.class);
                        n.putExtra("id", position);
                        startActivity(n);
                        break;

                    case 6:
                        //Use some different intent here
                        Intent o = new Intent(getApplicationContext(), Mis.class);
                        o.putExtra("id", position);
                        startActivity(o);
                        break;

                    default:
                        break;
                }

            }
        });

        /**Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show start activity

            startActivity(new Intent(this, MainActivity.class));
            Toast.makeText(this, "First Run", Toast.LENGTH_LONG)
                    .show();
        }


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).apply();

    **/
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
                    R.drawable.events, R.drawable.gallery,
                    R.drawable.associates, R.drawable.clubs,
                    R.drawable.about_us, R.drawable.contact_us,
                    R.drawable.mis
            };


    }
}
