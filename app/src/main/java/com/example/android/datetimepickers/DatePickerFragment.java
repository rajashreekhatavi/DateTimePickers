package com.example.android.datetimepickers;

import android.support.v4.app.DialogFragment;
import android.app.DatePickerDialog;
 import android.app.Dialog;
 import android.os.Bundle;
 import android.support.annotation.NonNull;
 import android.support.v4.app.Fragment;
 import android.widget.DatePicker;

 import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
    implements DatePickerDialog.OnDateSetListener{
    @Override
     public Dialog onCreateDialog(Bundle savedInstanceState) {
                 // Use the current date as the default date in the picker.
                 final Calendar c = Calendar.getInstance();
                 int year = c.get(Calendar.YEAR);
                 int month = c.get(Calendar.MONTH);
                 int day = c.get(Calendar.DAY_OF_MONTH);


                 // Create a new instance of DatePickerDialog and return it.
                 return new DatePickerDialog(getActivity(), this, year, month, day);
             }


             /**
       * Grabs the date and passes it to processDatePickerResult().
       * @param view  The date picker view
       * @param year  The year chosen
       * @param month The month chosen
     * @param day   The day chosen
     */
             public void onDateSet(DatePicker view, int year, int month, int day) {
                 // Convert the date elements to strings.
                 // Set the activity to the Main Activity.
                 MainActivity activity = (MainActivity) getActivity();
                 // Invoke Main Activity's processDatePickerResult() method.
                 activity.processDatePickerResult(year, month, day);
             }


}



