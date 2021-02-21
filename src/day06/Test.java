package day06;
/**今天的笔记 方法调用
 * 构造器
 */
public class Test
{
    public static void method1()
    {
        //调用doSome
        //完整方式
        //省略方式的调用

        //调用doOther方法
        //完整方式调用
        //省略方式调用

        //访问i；
        //完整方式访问
        //省略方式访问
        Test.doSome();//静态方法调用静态方法
        doSome();//上面的省略写法
        Test test=new Test();//创建对象
        test.doOther();//静态方法引用非静态方法
        int i= test.i;//静态方法访问非静态变量
        System.out.println(i);
    }
    public void method2()
    {
        //调用doSome
        //完整方式
        //省略方式的调用

        //调用doOther方法
        //完整方式调用
        //省略方式调用

        //访问i；
        //完整方式访问
        //省略方式访问
        Test.doSome();//非静态方法调用静态方法
        doSome();//上面的省略写法
        Test test=new Test();//创建对象
        test.doOther();//调用非静态方法
        int i= test.i;//非静态方法访问非静态变量
        System.out.println(i);
    }
    //主方法
    public static void main(String[] args) {
        //要求在这里编写程序调用method1
        //使用完整方式调用
        //使用省略方式调用

        //要求在这里编写程序调用method2
        //使用完整方式调用
        //使用省略方式调用
        Test.method1();
        method1();
        Test test= new Test();
        test.method2();
    }
    //没有static的变量
    int i=10;
    public static void doSome()
    {
        System.out.println("do some!");
    }
    public void doOther()
    {
        System.out.println("do other!");
    }
}
