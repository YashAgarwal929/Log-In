package com.example.ankur.registrationform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class Signin extends AppCompatActivity {
TextView textView;
TextView textView1;
//static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        textView=findViewById(R.id.editText3);
        textView1=findViewById(R.id.editText8);
        textView.setText(getIntent().getExtras().getString("username"));
        textView1.setText(getIntent().getExtras().getString("password"));
//        SharedPreferences sharedPreferences=getSharedPreferences("mypref",MODE_PRIVATE);
//        String str=sharedPreferences.getString("emailkey", "");
//        String str1=sharedPreferences.getString("phonekey","");
//        textView.setText(str);
//        textView1.setText(str1);
//
//        if(str.equals("1")){
//            textView.setText(str);
//            textView1.setText(str1);
//            i=1;
//        }


    }

}
