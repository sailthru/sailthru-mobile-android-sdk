package com.carnivalmobile.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.carnival.sdk.AttributeMap;
import com.carnival.sdk.Carnival;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateAttributes() {
        AttributeMap map = new AttributeMap();
        map.putString("key", "value");

        Carnival.setAttributes(map, null);
    }
}
