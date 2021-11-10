package com.example.exercice5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
public class License extends Activity {
    private EditText editText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);

        editText = (EditText)findViewById(R.id.licenseEditText);
        editText.setText("Licensed under the Apache License, Version 2.0 " +
                "(the \"License\"); you may not use this file " +
                "except in compliance with the License. You may " +
                "obtain a copy of the License at " +
                "http://www.apache.org/licenses/LICENSE-2.0");
    }
}