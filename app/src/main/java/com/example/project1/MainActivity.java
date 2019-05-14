package com.example.project1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    private EditText eText1;
    private EditText eText2;
    private EditText eText3;
    private EditText eText4;
    private EditText eText5;
    private EditText eText6;

    private SeekBar sBar1;
    private SeekBar sBar2;
    private SeekBar sBar3;
    private SeekBar sBar4;
    private SeekBar sBar5;
    private SeekBar sBar6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        eText1 = findViewById(R.id.editText2);
        sBar1 = findViewById(R.id.seekBar1);
        sBar1.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText1));
        eText1.addTextChangedListener(new NewWatcher(sBar1, eText1));

        /*
        editText_2 = findViewById(R.id.editText3);
        seekBar_2 = findViewById(R.id.seekBar2);
        seekBar_2.setOnSeekBarChangeListener(new MySeekBarChangeListener(editText_2)); */

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
