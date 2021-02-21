package day09;

/**
 * 关于java语言当中final关键字
 *  1、final是一个关键字，表示最终的，不可变的
 *  2、final修饰的类无法继承
 *  3、final修饰的方法无法被覆盖
 *  4、final修饰的变量一但被赋值止之后，不可重新赋值
 *  5、final修饰的实例变量必须手动赋值
 *  6、常量的定义方法
 *          public static final 类型 常量名=值；
 *  java规范中要求所有常量的名字全部大写，每个单词之间使用下划线分开。
 */
public class FinalTest01 {
    public static final String country="中国";

    public static void main(String[] args) {
        System.out.println(country);

    }
}
