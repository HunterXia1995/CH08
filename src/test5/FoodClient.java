package test5;
import java.util.*;
public class FoodClient {
    FoodManager fd=new FoodManager();
    public static void main(String[] args) {
        FoodClient fd=new FoodClient();
        fd.testAddfood();
        fd.testfindFOOd();
    }
    public void testAddfood() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入商品名称");
        String name=input.next();
        System.out.println("请输入商品价格");
        double price=input.nextDouble();
        System.out.println("请输入商品数量");
        int count=input.nextInt();
        Food food=new Food(name,price,count);
        boolean addfood =fd.addfood(food);
        if (addfood== true) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
    public void testfindFOOd () {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入商品名称");
        String name=input.next();
        Food food = fd.findFOOd(name);
        if (food == null) {
            System.out.println("没有查到");
        } else {
            System.out.println("name" + food.getName() + "price" + food.getPrice() + "count" + food.getCount());
        }
    }

}
