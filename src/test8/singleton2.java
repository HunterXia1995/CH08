package test8;

public class singleton2 {
    private singleton2(){
    }
    private static singleton2 stud=new singleton2();
    public static singleton2 instance(){
        singleton2 stude=stud;
        return stud;
    }
}
