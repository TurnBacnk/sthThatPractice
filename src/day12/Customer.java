package day12;

public class Customer  {
    private  FoodMenu foodMenu;

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public Customer() {
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    public void order()
    {
        this.foodMenu.luroumian();
        this.foodMenu.roujiangmian();
    }
}
