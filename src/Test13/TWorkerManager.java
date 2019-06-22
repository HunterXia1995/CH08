package Test13;

import java.util.Comparator;
import java.util.TreeSet;

public class TWorkerManager {
    public static void main(String[] args) {
        TreeSet<Worker> t=new TreeSet<Worker>(new MyComparator());


        Worker w1 = new Worker("zhang3", 18, 3000);
        Worker w2 = new Worker("li4", 25, 3500);
        Worker w3 = new Worker("wang5", 22, 3200);
        t.add(w1);
        t.add(w2);
        t.add(w3);
        t.stream().forEach(a->{
                System.out.println(a);
        });
    }
    public static class MyComparator implements Comparator<Worker>{
        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getAge()-o2.getAge();
        }
    }
}
