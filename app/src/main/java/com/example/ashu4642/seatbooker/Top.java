package com.example.ashu4642.seatbooker;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.tonyt.seatbooker.R;


public class Top extends ActionBarActivity {
private Button button;
    private int cuisine;
    private String[] levelNames = {"American", "Italian", "Mexican", "French", "Indian", "Chinese"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        button =(Button)findViewById(R.id.Top_Cuisine_in_the_country);
        button.setOnClickListener((android.view.View.OnClickListener) this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.Top_Cuisine_in_the_country) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
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

public void display(Integer i) {

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
