package InterfaceTest;

public class Computer {
    private int price;
    private InsertDrawable insertDrawable;

    public Computer(int price,InsertDrawable insertDrawable) {
        this.price = price;
        this.insertDrawable = insertDrawable;
    }

    public Computer() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }
    public void doSome()
    {
        this.insertDrawable.use();
    }
}
