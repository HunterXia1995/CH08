package test12;

public class ThreadDemo {
    public static void main(String[] args) {
        new TestThread().start();
        for (int i = 0; i < 5; i++){
            System.out.println("main在运行");
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class TestThread extends  Thread{
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Test在运行");
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}