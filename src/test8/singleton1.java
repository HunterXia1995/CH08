package test8;

public class singleton1 {
   private singleton1(){}
   private static singleton1 stu=null;
   public static singleton1 Instance(){
       if(stu==null){
           stu=new singleton1();
       }
       return stu;
   }
}
