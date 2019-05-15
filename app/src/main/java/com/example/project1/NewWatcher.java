package com.example.project1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;

public class NewWatcher implements TextWatcher {
    private SeekBar seekBar;
    private EditText editText;

    public NewWatcher(SeekBar seekBar) {

        this.seekBar = seekBar;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (editText.getText().toString().isEmpty()) {
            editText.setText("0");
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() > 0) {
            seekBar.setProgress(Integer.parseInt(s.toString()));
        }
    }

}
