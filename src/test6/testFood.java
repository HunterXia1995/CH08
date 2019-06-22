package test6;
import java.util.*;
public class testFood {
    Scanner input=new Scanner(System.in);
    FoodManager fm=new FoodManager();

    public static void main(String[] args) {
        testFood t1=new testFood();
        t1.start();
    }
    public void start(){
        while(true){
            switch(printScreen()){
                case 1:
                    addfood();
                    break;
                case 2:
                    findfood();
                    break;
                case 3:
                    lookfood();
                    break;
                case 4:
                    change();
                    break;
                case 5:
                    total();
                    break;
                case 6:
                    highrstprice();
                    break;
                case 7:
                    sort();
                    lookfood();
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
        System.out.println("欢迎使用");
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
    public Food insert(){
        System.out.println("请输入要添加商品名称：");
        String name=input.next();
        System.out.println("请输入要添加商品价钱：");
        double price=input.nextDouble();
        System.out.println("请输入要添加商品数量：");
        int count=input.nextInt();
        Food food = new Food(name, price, count);
        return food;
    }

    public void addfood () {
            Food food = insert();
            if (fm.addfood(food) == true) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        }

        public void findfood() {
            System.out.println("请输入要查询的商品名称：");
            String name=input.next();
            Food food = fm.findFOOd(name);
            if (food == null) {
                System.out.println("暂无此商品");
            } else {
                System.out.println("名字" + food.getName() + "价格" + food.getPrice() + "数量" + food.getCount());
            }
        }
        public void lookfood(){
        Food[] food=fm.lookfood();
        System.out.println("名字\t价格\t数量\t");
        for(int i=0;i<fm.lookfood().length;i++){
            System.out.println(food[i].getName()+"\t"+food[i].getPrice()+"\t"+food[i].getCount());
        }
        }
        public void change(){
           Food food= insert();
           Food f=fm.change(food);
           print(f);
        }
        public void total(){
        double total=fm.total();
        if(total>0){
            System.out.println("商品总价"+total);
        }
        else{
            System.out.println("无商品");
        }
        }
        public void highrstprice(){
        Food[] food=fm.highestprice();
        print(food);
        }
        public void sort(){
        Food[] food=fm.sort();
        }
        public void print(Food...food){
        if(food==null||food.length==0){
            System.out.println("无此商品");
        }
        else{
            System.out.println("名字\t价钱\t数量");
            for(int i=0;i<food.length;i++){
                System.out.println(food[i].getName()+"\t"+food[i].getPrice()+"\t"+food[i].getCount());
            }
        }
        }

    }

