package com.example.project1;

import android.widget.EditText;
import android.widget.SeekBar;

public class MySeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

    private EditText toChange;


    public MySeekBarChangeListener(EditText toChange) {
        this.toChange = toChange;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(progress != Integer.parseInt(toChange.getText().toString())){
            toChange.setText(String.valueOf(progress));
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
