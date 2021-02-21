package day07;

/**
 * @Date 2020.1.4
 * 关于java语言当中的多态语法机制：
 *      1.Animal、Cat、Bird三个类之间的关系：
 *          Cat继承Animal
 *          Bird继承Animal
 *      2.面向对象三大特征：封装、继承、多态
 *      3.关于多态中涉及到的几个概念
 *          *向上转型（upcasting）
 *              -子类行-->父类型
 *              又称为：自动类型转换
 *          *向下转型（downcasting）
 *              -父类型-->子类行
 *              又称为：强制类型转换。【需要加强制类型转换符】
 *          *无论是向上转型还是向下转型，两种类型之间必须有继承关系
 *          *
 */
public class Test01 {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1("lisi");
        a1.move();
        Bird1 b1 =new Bird1("小鸟");
        b1.move();
        Cat1 c1 = new Cat1("cad");
        c1.move();
        c1.catchMouse();
        //多态语法机制
        Animal1 a2 = new Cat1("bca");
        /**
         * 1、java程序永远都氛围编译阶段和运行阶段
         * 2、先分析编译阶段，在分析运行阶段，编译不通过，根本无法运行
         * 3、编译阶段编译器检查a2这个引用的数据类型为Animal，由于Animal.class
         * 字节码当中只有move（）方法，所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定
         * 只有静态绑定成功之后，才有后续的运行
         * 4、在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，那么以下程序在运行阶段一定会
         * 调用Cat对象的move（）方法，此时放生了程序的动态绑定，运行阶段绑定。
         * 5.无论Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层真实对象就是Cat对象
         * 6.父类型引用指向子类型对象这种机制导致程序存在编译极端绑定和运行阶段绑定两种不同的状态
         * 这种机制可以称为一种多态语法机制
         */
        a2.move();
        /**
         * 分析以下程序为什么不能调用？
         *      因为编译阶段编译器检查到a2的类型是Animal类型
         *      从Animal.class字节码文件当中查找catchMouse（）方法
         *      最终没有找到该方法，导致静态绑定失败，没有绑定成功，也就是编译失败
         *      a2.catchMouse();
         */
        /**
         * 需求：
         *      需要a2执行catchMouse（）方法
         *      a2无法直接调用，因为他的类型是Animal，Animal中没有catchMouse（）方法
         *      我们可以将a2强制类型转换为Cat类型
         *      a2的类型是Animal（父类），转换成Cat类型（子类），被称为向下转型。
         * 注：向下转型也需要两种类型之间必须有继承关系，不然编译报错，强制类型转换需要加强制类型转换符
         *     什么时候需要使用向下转型？
         *          当调用的方法是子类行中特有的，在父类型中不存在，必须进行向下转型
         *
         *
         */
        /**
         * 1、以下程序编译没有问题，因为编译器监测到a3的数据类型是Animal
         * Animal和Cat之间存在继承关系，并且Animal是父类型，Cat是子类型
         * 父类型转换成子类型叫做向下转型，语法合格
         * 2、程序虽然验证通过了，但是程序在运行阶段会出现异常，因为JVM堆内存
         * 当中真实存在的对象是Bird1类型，Bird1对象无法转换成Cat对象，因为两种类型之间不存在
         * 任何继承关系，此刻出现了著名的异常，
         *      java.lang.ClassCastException
         *      类型转换异常，这种异常总是在"向下转型"的时候会发生。
         */
        Cat1 c2 = (Cat1) a2;
        c2.catchMouse();
        Animal1 a3=new Bird1("小小鸟");

        /**
         * 以上异常只有在强制类型转换的时候会发生，也就是说"向下转型"发生隐患
         * 向上转型只要编译通过，运行一定不会出问题：Animal a = new Cat（）
         * 向下转型编译通过，运行可能错误：Animal a3= new Bird1（）；Cat1 c3=（Cat）a3；
         * 怎么避免向下转型出现的ClassCastException呢？
         *      使用instanceof运算符可以避免出现以上的异常
         * instanceof运算符怎么用？
         *      语法格式
         *          （引用 instanceof数据类型名）
         *      以上运算符的执行结果类型是布尔类型
         *      假设(a instanceof Animal)
         *          true表示：
         *              a这个引用指向的对象是一个Animal类型
         *          false表示：
         *              a这个引用指向的对象不是一个Animal类型
         * Java规范中要求，在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCstException异常的发生
         */
        if (a3 instanceof Cat1)
        {
            Cat1 c3=(Cat1) a3;
            c3.catchMouse();
        }
        else if(a3 instanceof Bird1)
        {
            Bird1 b2=(Bird1)a3;
            b2.fly();
        }
        Animal1 a4=new Animal1("abc");
        Animal1 a5 = (Bird1) b1;
        System.out.println(a5.getName());


    }
}
