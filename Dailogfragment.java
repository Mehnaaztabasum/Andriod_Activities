package com.example.andriod.time;



import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import java.time.Month;
import java.util.Calendar;

public class Dailogfragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int dt=c.get(Calendar.DAY_OF_MONTH);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        DatePickerDialog datePickerDialog=new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener)
                getActivity(),year,month,dt);
        return datePickerDialog;
    }
}
