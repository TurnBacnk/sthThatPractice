package day15;

/**
 * 自动装箱：基本数据类型自动转换成包装类
 * 自动拆箱：包装类自动转换成基本数据类型
 *
 *
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        // integer 是引用数据类型，900是基本数据类型，此过程为自动装箱
        Integer x = 900;

        //x是包转类型
        //y是基本数据类型
        //此过程为自动拆箱
        int y = x;
        System.out.println(y);
    }
}
