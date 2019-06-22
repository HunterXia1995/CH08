package test6;

public class Food {
    private String name;
    private double price;
    private int  count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Food(String name,double price,int count){
        this.name=name;
        this.price=price;
        this.count=count;
    }
}
