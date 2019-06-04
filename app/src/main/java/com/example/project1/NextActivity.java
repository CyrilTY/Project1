package com.example.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent packOfGrades = getIntent();
        String[] fächers = packOfGrades.getStringArrayExtra("Fächer");
        int[] notens = packOfGrades.getIntArrayExtra("noten");

        TableLayout tabelle = findViewById(R.id.table);
        for (int i = 0; i < fächers.length; i++) {
            TableRow row = new TableRow(this);
            //TextView n = new TextView(this);
            //n.setText(" " + notens[i]);
            TextView f = new TextView(this);
            f.setText(fächers[i]);
            row.addView(f);

            TextView n = new TextView(this);
            n.setText(" " + notens[i]);

            n.setWidth(TableRow.LayoutParams.MATCH_PARENT);
            n.setGravity(Gravity.RIGHT);
            //n.setWidth(750);

            row.addView(n);

            tabelle.addView(row);
        }
        tabelle.invalidate();
    }
}
