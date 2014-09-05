package com.carnivalmobile.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.carnival.sdk.Carnival;
import com.carnival.sdk.CarnivalStreamActivity;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyActivity.this, CarnivalStreamActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setTags(View v) {

        final ArrayList<String> newTags = new ArrayList<String>();
        newTags.add("tag1");
        newTags.add("tag2");

        Carnival.getTags(new Carnival.TagsHandler() {
            @Override
            public void onSuccess(List<String> strings) {
                //Remove duplicate tags
                strings.removeAll(newTags);
                //Add the new tags
                strings.addAll(newTags);
                Carnival.setTags(strings);
            }

            @Override
            public void onFailure(Error error) {

            }
        });
    }

    public void removeTags(View v) {
        Carnival.setTags(new ArrayList<String>());
    }
}
