package com.example.project1;

import android.app.AutomaticZenRule;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class Subjectchecker implements TextWatcher {
    private Button aButton;
    private EditText[] editTextArray;
    private SeekBar[] seekbarArray;

    Subjectchecker(Button addReportEntry, EditText[] testInputs, SeekBar[] sliders){
        aButton = addReportEntry;
        editTextArray = testInputs;
        seekbarArray = sliders;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (s.length() == 0){

            aButton.setEnabled(false);
            editTextArray[0].setEnabled(false);
            editTextArray[1].setEnabled(false);
            editTextArray[2].setEnabled(false);
            editTextArray[3].setEnabled(false);
            editTextArray[4].setEnabled(false);
            editTextArray[5].setEnabled(false);

            seekbarArray[0].setEnabled(false);
            seekbarArray[1].setEnabled(false);
            seekbarArray[2].setEnabled(false);
            seekbarArray[3].setEnabled(false);
            seekbarArray[4].setEnabled(false);
            seekbarArray[5].setEnabled(false);
        }
        else{
            aButton.setEnabled(true);
            editTextArray[0].setEnabled(true);
            editTextArray[1].setEnabled(true);
            editTextArray[2].setEnabled(true);
            editTextArray[3].setEnabled(true);
            editTextArray[4].setEnabled(true);
            editTextArray[5].setEnabled(true);

            seekbarArray[0].setEnabled(true);
            seekbarArray[1].setEnabled(true);
            seekbarArray[2].setEnabled(true);
            seekbarArray[3].setEnabled(true);
            seekbarArray[4].setEnabled(true);
            seekbarArray[5].setEnabled(true);
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}
