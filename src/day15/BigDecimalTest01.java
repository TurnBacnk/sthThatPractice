package day15;

/**
 * BigDecimal属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
 */

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        BigDecimal v3 = v1.add(v2);
        BigDecimal v4 = v3.divide(v1);
        System.out.println(v4);
    }
}
