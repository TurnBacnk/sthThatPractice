package day13;

public class ArrayTest02 {
    public static void main(String[] args) {
        Test02 t = new Test02();
        /*
         for (int i = 0; i < 10; i++) {
            t.push(123);
        }
         */
        /*
        此处未真正实现将数据弹栈，而是再次压栈时，根据栈帧index来覆盖
         */
       t.push(123);
       t.push(456);
       t.pop();
       t.pop();
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
       t.push(123);
    }
}
