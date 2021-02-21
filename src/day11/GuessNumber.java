package day11;
/**
 * 猜数字，定义一个 int 类型 a；通过guess方法比较
 */

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        while(true)
        {
            A a= new A(999);
            System.out.print("Plz input the number that you think:");
            Scanner input = new Scanner(System.in);
            int guessNum = input.nextInt();
            B number = new B(a);
            number.guess(guessNum);
        }
    }
}
class A
{
    private int v;

    public A(int v) {
        this.v = v;
    }

    public A() {
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
class B extends A
{
    private A a;

    public B(A a) {
        this.a = a;
    }

    public void guess(int guessNum)
    {
        int trueNum = a.getV();
        if(guessNum==trueNum)
        {
            System.out.println("Guess successfully！");
            System.exit(0);
        }
        else if(guessNum>trueNum)
        {
            System.out.println("Bigger than the truth.");
        }
        else if(guessNum<trueNum)
        {
            System.out.println("Litter than the truth.");
        }

    }
}
