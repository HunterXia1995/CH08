package Test13;

import java.util.ArrayList;
import java.util.List;

public class WorkerManage {
    List<Worker> worker1=new ArrayList<Worker>();
    public boolean addWorker(String name, int age, double salary){
    Worker worker=new Worker(name,age,salary);
    boolean a=worker1.add(worker);
    return a;
    }
    public void insertWorker(){
        Worker w1 = new Worker("zhang3", 18, 3000);
        Worker w2 = new Worker("li4", 25, 3500);
        Worker w3 = new Worker("wang5", 22, 3200);
        worker1.add(w1);
        worker1.add(w2);
        worker1.add(w3);
        Worker w4=new Worker("zhao6",24,3300);
        worker1.add(1,w4);
        int a=worker1.indexOf(w2);
        worker1.remove(w3);
    }
    public void print(List list){
        System.out.println("名字"+"\t"+"年龄"+"\t"+"工资");
        for(Worker a:worker1){
            System.out.println(a.getName()+" \t"+a.getAge()+" \t"+a.getSalary());
        }

    }
    public void removeWorker(){

    }
    public void start(){
        insertWorker();
        print(worker1);

    }
}
