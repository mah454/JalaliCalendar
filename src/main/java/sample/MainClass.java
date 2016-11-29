package sample;

import ir.moke.calendar.PersianDateConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        PersianDateConverter persianDateConverter = new PersianDateConverter();

        persianDateConverter.setPersianDate(1372,8,18);
        String startDate = persianDateConverter.getGregorianDate();

        persianDateConverter.setPersianDate(1395,10,30);
        String endDate = persianDateConverter.getGregorianDate();


        System.out.println("Start Date : " + startDate);
        System.out.println("End Date : " + endDate);

        Date date1 = convertToDate(startDate);
        Date date2 = convertToDate(endDate);
        long minus = dateCalculator(date1,date2);
        System.out.println("Diff is : " + minus+"(ms)");
    }

    private static long dateCalculator(Date startTime, Date endTime) {
        return endTime.getTime() - startTime.getTime();
    }

    private static Date convertToDate(String strDate) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
