package com.stackroute.pe2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayCalculator {

    public static String[] calCalendar()
    {
        String[] strDates=new String[2];
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        strDates[0]=df.format(c.getTime());
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        strDates[1]=df.format(c.getTime());
        return strDates;
    }

    public static void main(String []args){
        String[] resDates=new String[2];
        resDates=calCalendar();
        System.out.println(resDates[0]);
        System.out.println(resDates[1]);
    }
}
