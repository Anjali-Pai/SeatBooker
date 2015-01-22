package com.example.ashu4642.seatbooker;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.ashu4642.SeatBooker.R;

import java.util.ArrayList;
import java.util.List;


public class Top extends ListActivity {
private Button button;
    private Context context;
    private int cuisine;
    private String[] levelNames = {"All", "Italian", "Mexican", "Indian", "Chinese"};
    List<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        button = (Button) findViewById(R.id.Top_Cuisine_in_the_county);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Top_Cuisine_in_the_county) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setTitle("Choose Cuisine");


                    builder.setSingleChoiceItems(levelNames, 0, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            display(which);

                        }
                    });
                    AlertDialog ad = builder.create();
                    ad.show();

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {

                        }
                    });

                    builder.show();
                }
            }
        });
    }





public void display(Integer i) {
if(i==1);
    {
        list.add("Seaside Thai and French Cuisine");
        list.add("The New Yarmouth Restaurant");
        list.add("The Breakfast Shoppe");
        list.add("Don Lobos Mexican Grill");
        list.add("Liv2eat Restaurant");
        list.add("Dessert Fantasies");
        list.add("Dumfries Cafe");
        list.add("My Deli & Cafe Greek Bistro");
        list.add("K Town Bistro");
        list.add("Louisiana Restaurant");

    }
    if(i==2);
    {
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
    }
    if(i==3);
    {
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
    }
    if(i==4);
    {
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
    }
    if(i==5);
    {
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
        list.add("The Breakfast Shoppe");
    }
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            R.layout.activity_top, list);
    setListAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
