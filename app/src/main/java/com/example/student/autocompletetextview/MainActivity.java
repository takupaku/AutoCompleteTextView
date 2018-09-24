package com.example.student.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView searchCountry;

    //String[] country = {"Bangladesh" , "Bhutan", "Japan", "America", "china"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        searchCountry=findViewById(R.id.autoCompTextId);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.countries_array));

        searchCountry.setAdapter(adapter);//taking string from java/values(res) passing it to searchCountry, this is what ArrayAdapter does!!

    }
}
