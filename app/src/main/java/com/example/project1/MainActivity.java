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

        eText1_sBar1();
        eText2_sBar2();
        eText3_sBar3();
        eText4_sBar4();
        eText5_sBar5();
        eText6_sBar6();

    }

    public void test() {
        eText1 = findViewById(R.id.editText1);
        sBar1 = findViewById(R.id.seekBar1);
        sBar1.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText1));
        eText1.addTextChangedListener(new NewWatcher(sBar1));
    }

    public void eText1_sBar1() {
        eText1 = findViewById(R.id.editText1);
        sBar1 = findViewById(R.id.seekBar1);
        sBar1.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText1));
        eText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (eText1.getText().toString().isEmpty()) {
                    eText1.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    sBar1.setProgress(Integer.parseInt(s.toString()));
                }
            }
        });

    }

    public void eText2_sBar2() {
        eText2 = findViewById(R.id.editText2);
        sBar2 = findViewById(R.id.seekBar2);
        sBar2.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText2));
        eText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (eText2.getText().toString().isEmpty()) {
                    eText2.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    sBar2.setProgress(Integer.parseInt(s.toString()));
                }
            }
        });

    }

    public void eText3_sBar3() {
        eText3 = findViewById(R.id.editText3);
        sBar3 = findViewById(R.id.seekBar3);
        sBar3.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText3));
        eText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (eText3.getText().toString().isEmpty()) {
                    eText3.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    sBar3.setProgress(Integer.parseInt(s.toString()));
                }
            }
        });

    }

    public void eText4_sBar4() {
        eText4 = findViewById(R.id.editText4);
        sBar4 = findViewById(R.id.seekBar4);
        sBar4.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText4));
        eText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (eText4.getText().toString().isEmpty()) {
                    eText4.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    sBar4.setProgress(Integer.parseInt(s.toString()));
                }
            }
        });

    }

    public void eText5_sBar5() {
        eText5 = findViewById(R.id.editText5);
        sBar5 = findViewById(R.id.seekBar5);
        sBar5.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText5));
        eText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (eText5.getText().toString().isEmpty()) {
                    eText5.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    sBar5.setProgress(Integer.parseInt(s.toString()));
                }
            }
        });

    }

    public void eText6_sBar6() {
        eText6 = findViewById(R.id.editText6);
        sBar6 = findViewById(R.id.seekBar6);
        sBar6.setOnSeekBarChangeListener(new MySeekBarChangeListener(eText6));
        eText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (eText6.getText().toString().isEmpty()) {
                    eText6.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    sBar6.setProgress(Integer.parseInt(s.toString()));
                }
            }
        });

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
