package day07;

public class CreditAccount  extends Account{//继承
    private String actno;
    private double balance;
    private double credit;


    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public CreditAccount() {
    }

    public CreditAccount(String actno, double balance, double credit) {
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
    }
}
