package com.example.project1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;

public class NewWatcher implements TextWatcher{
    private SeekBar seekBar;
    private EditText editText;

    public NewWatcher(SeekBar seekBar, EditText editText){

        this.editText = editText;
        this.seekBar = seekBar;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        int i = Integer.parseInt(s.toString());
        if (i >= 0 && i <= 40) {
           seekBar.setProgress( i - 0);
        }
        else {
            int j = seekBar.getProgress();
            editText.setSelection(j);
        }
    }
}
