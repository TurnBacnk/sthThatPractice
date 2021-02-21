package day10;

/**
 * 1、super是一个关键字，全部小写
 * 2、this
 *      this能出现在实例和构造方法中
 *      this的语法是："this.","this()"
 *      this.大部分情况下可以是可以省略的
 *      this.不能省略的情况：区分局部变量和实例变量
 *          public void setName(String name)
 *          {
 *              this.name = name;
 *          }
 *      this()只能出现在构造方法的第一行，通过当前的构造方法去调用"本类"
 *      中其他的构造方法，目的是代码复用
 * 3、super
 *      super能出现在实例方法和构造方法中
 *      super的语法"super." "super()"
 *      super不能使用在静态方法中
 *      super.大部分情况下可以省略
 *      super.不能省略的情况
 *          在父类和子类中出现同名变量的时候，如果想在子类中访问父类的特征，super.不能省略
 *
 *      super()只能出现在构造方法的第一行，通过当前的构造访方法去调用"父类"
 *      中的构造方法，目的是创建子类对象时，先初始化父类型特征
 *      super()
 *          表示通过子类的构造方法调用父类的构造方法
 *          模拟现实世界中的这种场景，要想有儿子，需先有父亲
 *      重要的结论()
 *          既没有this()也没有super()的话，默认会有一个super()；
 *          必须保证父类的无参数构造方法是存在的
 *          object方法一定会执行,并且object中的无参数构造方法处于栈顶
 */
public class SuperTest01 {
    public static void main(String[] args) {
    new C();
    }
}
class A{
    public A()
    {
        System.out.println("1");
    }
}
class B extends A{
    public B()
    {
        System.out.println("2");
    }
    public B(String name)
    {
        System.out.println("3");
    }
}
class C extends B{
    public C()
    {
        this("zhangsan");
            System.out.println("4");
    }
    public C(String name)
    {
        this(name,20);
        System.out.println("5");
    }
    public C(String name,int age)
    {
        super(name);
        System.out.println("6");
    }
}