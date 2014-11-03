package com.witmergers.testlayout;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        String [] myValues = {"This is 1","This is 2","This is 3","This is 4","This is 4","This is 5"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, myValues);

        ListView theListView = (ListView)findViewById(R.id.listView);

        theListView.setAdapter(listAdapter);


        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MyActivity.this,"Selected"+adapterView.getItemIdAtPosition(i),Toast.LENGTH_LONG);
                Toast.makeText(MyActivity.this,"Selected next will be"+adapterView.getItemIdAtPosition(i),Toast.LENGTH_LONG);

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
}
