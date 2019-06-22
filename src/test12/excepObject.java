package test12;

public class excepObject {
    public static void main(String[] args) {
        try{
            int[] arr=new int[5];
            arr[10]=7;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("数组超出绑定范围");
            System.out.println("异常："+ex);
        }
        System.out.println("main（）方法结束");
    }
}
