package test2;
class Test1{
    public void move(){
        System.out.println("运动方式");
    }
    public void Sss(){
    System.out.println("123");
}}

class fish extends Test1{
    public void move(){
        super.Sss();
        System.out.println("游泳");
    }
}
class horse extends Test1 {
    public void move() {
        System.out.println("跑");
    }
}
public class pra4{
    public static void main(String[] args){
    Test1 a=new fish();
    horse h=new horse();
   a.move();

    }
}