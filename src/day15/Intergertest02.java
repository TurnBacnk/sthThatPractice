package day15;

public class Intergertest02 {
    public static void main(String[] args) {
        Integer x = new Integer(1000);
        int y = x.intValue();
        System.out.println(y);
        Integer a = new Integer("123");
        Integer b = new Integer("456");
        //java.lang.NumberFormatException 数字格式化异常
        //System.out.println(a);


        //重点方法
        //static int parseInt(String s)
        //静态方法，传参String，返回int
        int retValue = Integer.parseInt("123");
        int retValue2= Integer.parseInt("456");
        System.out.println(a+100);
        System.out.println(b-123);
        double retValue3 = Double.parseDouble("3.14");
        System.out.println(retValue3+1);//4.140000000000001(精度问题)

        float retValue4 = Float.parseFloat("1.0");
        System.out.println(retValue4+1);
    }
}
