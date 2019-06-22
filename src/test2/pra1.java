package test2;

 public class pra1{
    protected void print() {
        System.out.println("The print() in class Person.");
    }
}
 class DemoSuper extends pra1{
    public DemoSuper(){
        super(); //调用父类的构造方法，而且放第一行，如果不写，系统自动加
    }
    public void print() {
        System.out.println("The print() in class DemoSuper.");
        super.print();// 调用父类的方法
    }
    public static void main(String[] args) {
        DemoSuper ds = new DemoSuper();
        ds.print();
    }
}
