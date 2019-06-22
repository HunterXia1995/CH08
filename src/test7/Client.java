package test7;
import java.util.*;
public class Client {
    Scanner input = new Scanner(System.in);
    Food1 food;
    Food1Mananger FM = new Food1Mananger();

    public static void main(String[] args) {
        Client client=new Client();
        client.start();
    }
    public void start(){
        while(true){
            switch(printScreen()){
                case 1:
                    addFood1();
                    break;
                case 2:
                    findFood1();
                    break;
                case 3:
                    querryAll();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    total();
                    break;
                case 6:
                    highest();
                    break;
                case 7:
                   sorts();
                    break;
                case 8:
                    System.out.println("再见");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误" );
                    break;

            }
        }

    }
    public int printScreen(){
        System.out.print("欢迎使用");
        System.out.print("请选择模式");
        System.out.println("请选择使用方式");
        System.out.println("1.可添加新食品");
        System.out.println("2.根据食品名称，查询食品信息");
        System.out.println("3.查询所有商品信息");
        System.out.println("4.根据食品名称，修改食品信息");
        System.out.println("5.计算所有食品总价");
        System.out.println("6.统计所有食品中最贵的商品信息 ");
        System.out.println("7.按照食品的价格升序排序输出这些食品的信息");
        System.out.println("8.退出");
        System.out.println("请选择输入的模式");
        int num=input.nextInt();
        return num;
}

    public void addFood1() {
        System.out.println("请输入新增商品的名字：");
        String name = input.next();
        System.out.println("请输入新增商品的价格：");
        double price = input.nextDouble();
        System.out.println("请输入新增商品的数量：");
        int count = input.nextInt();
        food = new Food1(name, price, count);
        boolean addFood1 = FM.addFood1(food);
        if (addFood1 == true) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public void findFood1() {
        System.out.println("请输入需修改商品的名字：");
        String name = input.next();
        food = FM.findFood1(name);
        if (food == null) {
            System.out.println("无此商品");
        } else {
            System.out.println("名字\t价钱\t数量");
            System.out.println(food.getName() + "\t" + food.getPrice() + "\t" + food.getCount());
        }
    }

    public void querryAll() {
    Food1[] querry=FM.querryAll();
    print(querry);

    }
    public void update(){
        {
            System.out.println("请输入需修改商品的名字：");
            String name = input.next();
            System.out.println("请输入需修改商品的价格：");
            double price = input.nextDouble();
            System.out.println("请输入需修改商品的数量：");
            int count = input.nextInt();
            food = new Food1(name, price, count);
            food=FM.updateFood1(food);
            print(food);
        }
    }
    public void total(){
        if(FM.totalFood1()<0){
            System.out.println("无商品");
        }
        else{System.out.println(FM.totalFood1());}
    }
    public void highest(){
        Food1[] highest=FM.sort();
        print(highest);
    }
    public void sorts(){
        Food1[] sorts=FM.sorts();
        print(sorts);
    }
    public void print(Food1... food1) {
        if (food == null || food1.length == 0) {
            System.out.println("暂无此商品");
        } else {
            System.out.println("名字\t价钱\t数量");
            for (int i = 0; i < food1.length; i++) {
                System.out.println(food1[i].getName() + "\t" + food1[i].getPrice() + "\t" + food1[i].getCount());
            }
        }
    }
}