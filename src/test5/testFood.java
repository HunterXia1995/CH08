package test5;

public class testFood {
    public static void main(String[] args) {
        testFood t1=new testFood();
         t1.testAddfood();
         //t1.testfindFOOd();
         //t1.testlookfood();
         //t1.testtotal();
         //t1.testchange();
         t1.testhighPrice();
         t1.testsort();
         t1.testlookfood();


    }
    FoodManager fd=new FoodManager();


    public void testAddfood() {
        Food food = new Food("牛肉干", 10, 5);
        if (fd.addfood(food) == true) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        } Food f1=new Food("大帅比",10,5);
        Food f2=new Food("大帅",1,5);
        Food f3=new Food("大",2,5);
        fd.addfood(f1);
        fd.addfood(f2);
        fd.addfood(f3);
    }
        public void testfindFOOd () {
            Food food = fd.findFOOd("牛肉干");
            if (fd.findFOOd("牛肉干") == null) {
                System.out.println("没有查到");
            } else {
                System.out.println("name" + food.getName() + "price" + food.getPrice() + "count" + food.getCount());
            }
        }
        public void testlookfood(){
        Food[] foods=fd.lookFood();
        if(foods==null||foods.length==0){
            System.out.println("暂无商品信息");
            return;
        }
        else{System.out.println("名称\t     价格\t 数量");
            for(int i=0;i<foods.length;i++){
                Food food=foods[i];

                System.out.println(food.getName()+"\t"+food.getPrice()+"\t"+food.getCount());
            }
        }
        }
        public void testtotal(){
        System.out.println("一共"+fd.total()+"元");
        }
        public void testchange(){
        Food food=new Food("牛肉干",20,5);
        boolean d=fd.change(food);
        if(d==true){
            System.out.println("name" + food.getName() + "price" + food.getPrice() + "count" + food.getCount());
        }
        else{
            System.out.println("失败");
        }
        }
        public void testhighPrice(){
            Food[] foods=fd.highPrice();
            if(foods==null||foods.length==0){
                System.out.println("暂无商品信息");
                return;
            }
            else{System.out.println("名称\t 价格\t 数量");
                for(int i=0;i<foods.length;i++){
                    Food food=foods[i];
                    System.out.println(food.getName()+"\t"+food.getPrice()+"\t"+food.getCount());
                }
            }

        }
        public void testsort(){
            Food[] foods=fd.sort();
}
    }