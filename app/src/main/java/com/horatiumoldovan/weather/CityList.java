package com.horatiumoldovan.weather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CityList extends Activity {
    ListView listView;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        String [] cities = new String[]{getString(R.string.city_Londra), getString(R.string.city_Paris), getString(R.string.city_Cluj)};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cities);
        listView.setAdapter(adapter);
    }

}
