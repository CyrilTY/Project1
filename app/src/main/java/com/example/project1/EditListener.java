package com.example.project1;


import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;

public class EditListener implements TextWatcher{

    private EditText toChange;
    private SeekBar seekbar;

    public EditListener(TextWatcher watcher) {


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        toChange.setSelection(toChange.getText().length());
        try{
           seekbar.setProgress(Integer.parseInt(s.toString()));
        }
        catch (Exception e ){

        }

    }
}
