package com.example.ahmed.sharedpref_example;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void addSharedPref(View v){


        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString("usr","ahmed");
        editor.putString("pass","123");

        editor.commit();
    }


    public void getSharedPref(View v){


        sharedpreferences = getSharedPreferences("Data",MODE_PRIVATE);

        String usr = sharedpreferences.getString("usr","none");
        String pass = sharedpreferences.getString("pass","none");


        Log.d("test1",usr);
        Log.d("test1",pass);
    }
}
