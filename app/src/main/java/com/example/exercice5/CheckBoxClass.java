package com.example.exercice5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxClass extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_class);

        checkBox = (CheckBox) findViewById(R.id.check);
        checkBox.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            checkBox.setText("This checkbox is: checked");
        }
        else {
            checkBox.setText("This checkbox is: unchecked");
        }
    }
}