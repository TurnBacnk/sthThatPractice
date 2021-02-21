package day12;

public class Test {
    public static void main(String[] args) {

        FoodMenu foodMenu1 = new ChineseCook();
        FoodMenu foodMenu2 = new AmericaCook();
        Customer c1 = new Customer(foodMenu1);
        Customer c2 = new Customer(foodMenu2);
        c1.order();
        c2.order();
    }
}
