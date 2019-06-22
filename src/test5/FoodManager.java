package test5;

public class FoodManager {
    private Food[] foods = new Food[500];
    int count = 0;

    public boolean addfood(Food food) {
        if (foods[count] != null) {
            return false;
        }
        if (count > foods.length) {
            return false;
        }
        foods[count++] = food;
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

    public Food[] lookFood() {
        Food[] food = new Food[count];
        int i;
        for (i = 0; i < count; i++) {
            food[i] = foods[i];

        }
        return food;
    }

    public double total() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == null) {
                break;
            }
            total += foods[i].getPrice() * foods[i].getCount();

        }
        return total;
    }
    public boolean change(Food food){
        for (int j = 0; j < foods.length; j++) {
            if (foods[j] != null && food.getName().equals(foods[j].getName())) {
                foods[j]=food;
                foods[j].setPrice(food.getPrice());
                foods[j].setCount(food.getCount());
                return true;
            }
        }
        return false;
    }
    public Food[] highPrice(){
        double max = null == foods[0] ? 0 : foods[0].getPrice();
        for(int i=0;i<count;i++){
            if(max<foods[i].getPrice()){
                max=foods[i].getPrice();
            }

        }
        int $count=0;;
        for(int  i=0;i<count;i++) {
            if (max == foods[i].getPrice()) {
                $count++;
            }
        }
           Food[] foodss=new Food[$count];
            int i=0;
            int j=0;
            for( i=0;i<count;i++){
                if(max==foods[i].getPrice()){

                    foodss[j++]=foods[i];
                }
            }
          return foodss;
    }
    public Food[] sort(){
        for(int i=0;i<count-1;i++){
            for(int j=0;j<count-1-i;j++){
            if(foods[j].getPrice()>foods[j+1].getPrice()){
               Food target=foods[j+1];
               foods[j+1]=foods[j];
               foods[j]=target;
            }
        }
        }
        return foods;
    }
}