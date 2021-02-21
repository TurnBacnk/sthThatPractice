package day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        System.out.println(nowTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        String simpleDateFormatString = simpleDateFormat.format(nowTime);
        System.out.println(simpleDateFormatString);
        Date datatime = simpleDateFormat.parse(simpleDateFormatString);
        System.out.println(datatime);
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = simpleDateFormat1.parse(time);
        System.out.println(dateTime);
    }
}
