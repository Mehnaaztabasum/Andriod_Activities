package com.example.andriod.time;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener ,DatePickerDialog.OnDateSetListener
         {
    EditText e1 ,e2, e3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.t1);
        e2 = findViewById(R.id.from);
        e3 = findViewById(R.id.to);




        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dailogfragment dateDialogFragmt = new Dailogfragment();
                dateDialogFragmt.show(getSupportFragmentManager(), "DatePicker");

            }
        });


        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerFragment myDateDialog = new TimePickerFragment();
                myDateDialog.show(getSupportFragmentManager(), "timePicker");
            }
        });

    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String date = String.valueOf(i2) + "/" + String.valueOf(i1) +" /" + String.valueOf(i);
        e1.setText(date);

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i6, int i5) {
        String s = String.valueOf(i6) + ":" + String.valueOf(i5);
        e2.setText(s);
        e3.setText(s);
    }
    }


