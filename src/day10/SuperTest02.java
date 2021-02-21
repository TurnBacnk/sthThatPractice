package day10;
import java.util.*;//import语句引入
/**
 * 在恰当是的时候使用super()；
 */
public class SuperTest02 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);//此处为调用java.util.Scanner函数
        CreditAccount a1= new CreditAccount("123123",999.99,99.9);
        System.out.println(a1.getCredit());
        System.out.println(a1.getActNo());
        System.out.println(a1.getBalance());
    }
}
class Account        //账户
{
    private String actNo;
    private double balance;

    public Account() {
    }

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CreditAccount extends Account    //信用账户
{
    private double credit;
    public CreditAccount()
    {

    }

    public CreditAccount(String actNo, double balance, double credit) {
        super(actNo, balance);//此处无对象创建，依然为原对象a1
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}