package day06;

public class DataTest
{
    public static void main(String[] args) {
        Date time1 =new Date();
        System.out.println(time1.getYear()+"."+ time1.getMonth()+"."+ time1.getDay());
        Date time2 =new Date(2021,1,3);
        System.out.println(time2.getYear()+"."+time2.getMonth()+"."+time2.getDay());
    }
}
