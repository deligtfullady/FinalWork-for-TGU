package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnActTwo;
    private Bundle savedInstanceState;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        Button btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, Activity2.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                intent = new Intent(this, Activity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }


            }
    }
