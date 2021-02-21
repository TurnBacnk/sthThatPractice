package day07;
/**
 * 关于java语言当中的集成
 *      1、集成是面向对象的三大特征之一，三大特征是：封装，继承，多态
 *      2、继承"基本"的作用是，代码服用。但是继承最"重要"的作用是：有了继承才有了以后"方法覆盖"多态机制"
 *      3、继承的语法格式
 *          [修饰符列表] class 类名 extends 父类名
 *          {
 *              类体=属性+方法
 *          }
 *      4、java语言中的继承只支持单继承，一个类不能同时继承很多类，只能继承一个类。在c++中支持多继承
 *      5、关于继承中的一些术语：
 *          B类继承A类，其中：
 *              A类称为：父类、基类、超类、superclass
 *              B类称为：子类、派生类、subclass
 *      6、java语言当中子类继承父类否继承哪些数据？
 *          *私有的不支持继承
 *          *构造方法不支持继承
 *          *其他数据都可以
 *      7、虽然java芋圆当中只支持单继承，但是一个类也可以间接继承其他类，例如：
 *          C extends B{
 *
 *          }
 *          B extends A{
 *
 *          }
 *          A extend T{
 *
 *          }
 *          C直接继承B类，但是C类间接继承T A 。
 *      8、java语言中稼穑一个类没有显示的继承任何类，该类默认继承JavaSE当中提供的java.lang.Object类
 */
public class ExtendsTest继承 {
    public static void main(String[] args) {
        CreditAccount act = new CreditAccount();
        act.setCredit(0.99);
        act.setBalance(-1000);
        act.setActno("act-100");
        System.out.println(act.getCredit());
        System.out.println(act.getActno());
        System.out.println(act.getBalance());


    }
}
