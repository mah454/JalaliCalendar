package sample;

import ir.moke.calendar.PersianDateConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        PersianDateConverter persianDateConverter = new PersianDateConverter();

        persianDateConverter.setPersianDate(1372,8,18);
        String startTime = persianDateConverter.getGregorianDate();

        persianDateConverter.setPersianDate(1395,10,30);
        String endTime = persianDateConverter.getGregorianDate();


        System.out.println("Start Date : " + endTime);
        System.out.println("End Date : " + endTime);

        Date date1 = convertToDate(startTime);
        Date date2 = convertToDate(endTime);
        long minus = dateCalculator(date1,date2);
        System.out.println("Diff is : " + minus+"(ms)");
    }

    private static long dateCalculator(Date startTime, Date endTime) {
        return endTime.getTime() - startTime.getTime();
    }

    private static long dateCalculator(String startTime, String endTime) {
        Date date1 = convertToDate(startTime);
        Date date2 = convertToDate(endTime);
        return dateCalculator(date1,date2);

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
