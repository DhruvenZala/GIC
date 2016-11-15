package com.example.admin.gic;

import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.admin.gic.R.string.cancel;
import static com.example.admin.gic.R.string.password;
import static com.example.admin.gic.R.string.submit;
import static com.example.admin.gic.R.string.username;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.admin.gic.MESSAGE";

    ImageView logo;

    EditText edtFirstName;
    EditText edtLastName;
    Button submit;
    Button cancel;
    ArrayList result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        edtFirstName =(EditText)findViewById(R.id.edtFirstName);
        edtLastName =(EditText)findViewById(R.id.edtLastName);
        logo = (ImageView)findViewById(R.id.logo);

        logo.setImageResource(R.drawable.gtu);

        submit = (Button) findViewById(R.id.btnSubmit);

        cancel = (Button)findViewById(R.id.btnCancel);

        result = new ArrayList();

        //String username = user.getText().toString();
        //String password = pass.getText().toString();


        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtFirstName.getText().toString();
                String passWord = edtLastName.getText().toString();


                /**Data d1 = new Data();
                d1.setusername(user);
                d1.setpassword(pass);

                // adding username,password,email to result array list
                result.add(d1);

                // Inserting data
                insert(result);**/

                if((userName.equals("1") && passWord.equals("1"))
                ||(userName.equals("2") && passWord.equals("2"))
                        ||(userName.equals("3") && passWord.equals("3"))) {
                    Intent intent = new Intent(getApplicationContext(), Home.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "LogIn Succesful",Toast.LENGTH_SHORT).show();
            }
                else{Toast.makeText(MainActivity.this, "LogIn Failed",Toast.LENGTH_SHORT).show();}
            }
        });

        cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

}
}
