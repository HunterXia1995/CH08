package test10;

public class Client {
    public static void main(String[] args) {
        soldier soldier=new soldier("三奥");
        Abstractgun gun=new Handgun();
        soldier.setGun(gun);
        soldier.killenemy();
    }
}
