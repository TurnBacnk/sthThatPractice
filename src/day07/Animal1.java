package day07;

public class Animal1 {
    private String name;
    private int ID;
    private String idCard;
    private int creditCard;
    public Animal1(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("动物在移动");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
