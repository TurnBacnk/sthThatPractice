package day15;

import java.text.DecimalFormat;

public class Number {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00000000");
        String str = decimalFormat.format(999123.1231230000);
        System.out.println(str);
    }
}
