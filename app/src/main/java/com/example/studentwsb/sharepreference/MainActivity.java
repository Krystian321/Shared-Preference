package com.example.studentwsb.sharepreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences =
                this.getSharedPreferences("com.example.studentwsb.sharepreference", Context.MODE_PRIVATE);
  //zapisanie
        sharedPreferences.edit().putString("imie","Krystian").apply();

// odczytanie
       String name = sharedPreferences.getString("imie","");

       Log.i("Imie",name);
    }
}
