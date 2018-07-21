package com.example.android.datetimepickers;

import android.support.v4.app.DialogFragment;
import android.app.Dialog;
 import android.app.TimePickerDialog;
 import android.os.Bundle;
 import android.support.annotation.NonNull;
 import android.support.v4.app.Fragment;
 import android.text.format.DateFormat;
 import android.widget.TimePicker;
import java.util.Calendar;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    @Override
     public Dialog onCreateDialog(Bundle savedInstanceState) {
                 // Use the current time as the default values for the picker.
                 final Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                 int minute = c.get(Calendar.MINUTE);


                 // Create a new instance of TimePickerDialog and return it.
                 return new TimePickerDialog(getActivity(), this, hour, minute,
                                 DateFormat.is24HourFormat(getActivity()));
            }


    /**
       * Grabs the time and converts it to a string to pass
       * to the Main Activity in order to show it with processTimePickerResult().
       * @param view          The time picker view
       * @param hourOfDay     The hour chosen
       * @param minute        The minute chosen
       */
             public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                 // Set the activity to the Main Activity.
                 MainActivity activity = (MainActivity) getActivity();
                 // Invoke Main Activity's processTimePickerResult() method.
                 activity.processTimePickerResult(hourOfDay, minute);
             }


}
