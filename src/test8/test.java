package test8;

public class test {
    public static void main(String[] args) {
        singleton2 h1 = singleton2.instance();
        singleton2 h2 = singleton2.instance();
        System.out.println(h1);
        System.out.println(h2);
        singleton1 f1 = singleton1.Instance();
        singleton1 f2 = singleton1.Instance();
        System.out.println(f1);
        System.out.println(f2);
    }
}
