package test7;

public class Food1 {
    private String name;
    private double price;
    private int  count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Food1() {
        super();
    }
    public Food1(String name,double price,int count) {
        this.name=name;
        this.price=price;
        this.count=count;
    }
}
