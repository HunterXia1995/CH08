package test11;

public class Client {
    public static void main(String[] args) {
        Idriver driver=new Driver();
        Icar car=new BMW();
        driver.drive(car);
    }
}
