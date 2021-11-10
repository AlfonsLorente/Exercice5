package com.example.exercice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startFleetingImg(View view) {
        Intent intent = new Intent(this, FleetingImg.class);
        startActivity(intent);
    }

    public void startLicense(View view) {
        Intent intent = new Intent(this, License.class);
        startActivity(intent);
    }

    public void startCheckBoxClass(View view) {
        Intent intent = new Intent(this, CheckBoxClass.class);
        startActivity(intent);
    }
    public void startRPSGame(View view) {
        Intent intent = new Intent(this, RPS_Game.class);
        startActivity(intent);
    }

    public void startLinearLayoutExample(View view) {
        Intent intent = new Intent(this, LinearLayoutExample.class);
        startActivity(intent);
    }
    public void startLinearLayoutBoxModel(View view) {
        Intent intent = new Intent(this, LinearLayoutBoxModel.class);
        startActivity(intent);
    }

    public void startRelativeLayoutExample(View view) {
        Intent intent = new Intent(this, RelativeLayoutExample.class);
        startActivity(intent);
    }

    public void startOverlap(View view) {
        Intent intent = new Intent(this, Overlap.class);
        startActivity(intent);
    }

    public void startTableExample(View view) {
        Intent intent = new Intent(this, TableLayoutExample.class);
        startActivity(intent);
    }

    public void startScrollwork(View view) {
        Intent intent = new Intent(this, Scrollwork.class);
        startActivity(intent);
    }
}