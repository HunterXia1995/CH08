package test6;

public class FoodManager {
    Food[] foods=new Food[500];
    Food food;
    int count=0;
    public boolean addfood(Food food){

        if(food==null){
            return false;
        }
        if(count>foods.length){
            return false;
        }
       foods[count++]=food;
        return true;
    }

    public Food findFOOd(String name) {
        for (int j = 0; j < foods.length; j++) {
            if (foods[j] != null && name.equals(foods[j].getName())) {
                return foods[j];
            }
        }
        return null;
    }
    public Food[] lookfood(){
        Food[] food=new Food[count];
        for(int i=0;i<count;i++){
            food[i]=foods[i];
        }
        return food;
    }
    public  Food change(Food food){
        for(int i=0;i<count;i++){
            if(foods[i]!=null&&foods[i].getName().equals(food.getName())){
               foods[i].setPrice(food.getPrice());
               foods[i].setCount(food.getCount());
                return foods[i];
            }
        }
        return null;
    }
    public double total(){
        int  total=0;
        if(foods==null||count==0){
            return -1;
        }
        for(int i=0;i<count;i++){
           total+=foods[i].getCount()*foods[i].getPrice();
        }
        return total;
    }
    public Food[] highestprice(){
        double max=null==foods[0]?0:foods[0].getPrice();
        for(int i=0;i<count;i++){
            if(max<foods[i].getPrice()){
                max=foods[i].getPrice();
            }
        }
        int $count=0;
        for(int i=0;i<count;i++){
            if(max==foods[i].getPrice()){
                $count++;
            }
        }
        Food[] food=new Food[$count];
        int j=0;
        for(int i=0;i<count;i++){
            if(max==foods[i].getPrice()){
                food[j++]=foods[i];
            }
        }
        return food;
    }
    public Food[] sort(){
        int j;
        for(int i=0;i<count-1;i++){
            for(j=0;j<count-1-i;j++){
              if(foods[j].getPrice()>foods[j+1].getPrice()){
                 Food target=foods[j+1];
                  foods[j+1]=foods[j];
                  foods[j]=target;
              }
              else if (foods[j].getPrice() == foods[j+1].getPrice()) { //当价格相同，则根据库存数量降序排序
                  if (foods[j].getCount() < foods[j+1].getCount()) {
                      //交换位置
                      Food target = foods[j];
                      foods[j] = foods[j+1];
                      foods[j + 1] = target;
                  }
              }
            }
        }
        return foods;
    }
}
