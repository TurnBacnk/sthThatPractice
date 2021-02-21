package day17;

public class Test01 {
    public static void main(String[] args) {
    MyStack mystack =new MyStack(new Object[10]);
        try {
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
            mystack.push(123);
        } catch (MyStackOperationException e) {
            e.printStackTrace();
        }
    }
}
