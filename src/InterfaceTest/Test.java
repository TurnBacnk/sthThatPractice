package InterfaceTest;

/**
 * 接口调用演示，可后续建立keyboard类等，使用InsertDrawable接口中的use方法
 *  computer类中有方法可将其实现
 */
public class Test {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Computer c1 = new Computer(12,m);
        c1.doSome();
    }
}
