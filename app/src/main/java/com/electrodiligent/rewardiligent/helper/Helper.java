package com.electrodiligent.rewardiligent.helper;

import org.joda.time.DateTime;
import org.joda.time.Interval;

import java.time.Period;
import java.util.Date;

/**
 * Created by sumit on 18-02-2018.
 */

public class Helper {

    public static String yourCurrentAge() {
        Date sumitBirthday = new Date();
        Date currentDate = new Date();
        DateTime dob = new DateTime(1990, 12, 07, 21, 21);
        sumitBirthday=dob.toDate();
                Interval interval = new Interval(sumitBirthday.getTime(), currentDate.getTime());
        org.joda.time.Period period = interval.toPeriod();

        return ("Your current age is, "+period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days " + period.getHours() + " hours " + period.getMinutes() + " minutes " + period.getSeconds() + " seconds.");

    }


}
