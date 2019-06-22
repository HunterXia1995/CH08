package Test13;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Pr1 {
    public static void main(String[] args) {
        Queue queue=new ArrayBlockingQueue(2);
        queue.add(23);
        queue.add("帅哥");
        for(Object a:queue){
            System.out.println(a);
        }
    }
}
