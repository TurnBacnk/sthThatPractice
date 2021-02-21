package day06;
/*
*自定义的日期类型
*   this可以用在哪里
*   1.可以使用在实例方法当中,代表当前对象【this.】
*   2.可以使用在构造方法当中，通过当前的构造方法调用其他的构造方法【this(实参)；】
* */
public class Date
{
    private int year;
    private int month;
    private int day;

    public Date() {
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
