package test7;

public class Food1Mananger {
    Food1[] foods = new Food1[500];
    Food1 Food;
    int count = 0;

    public boolean addFood1(Food1 food) {
        if (food == null) {
            return false;
        }
        if (count >= 500) {
            return false;
        }
        foods[count++] = food;
        return true;
    }

    public Food1 findFood1(String name) {
        for (int i = 0; i < count; i++) {
            if (foods[i] != null && name.equals(foods[i].getName())) {
                Food = foods[i];
                return Food;
            }
        }
        return null;
    }

    public Food1[] querryAll() {
        Food1[] querryFood = new Food1[count];
        for (int i = 0; i < count; i++) {
            querryFood[i] = foods[i];
        }
        return querryFood;
    }

    public Food1 updateFood1(Food1 food) {
        for (int i = 0; i < count; i++) {
            if (foods[i] != null && food.getName().equals(foods[i].getName())) {
                foods[i].setPrice(food.getPrice());
                foods[i].setCount(food.getCount());
                return foods[i];
            }
        }
        return null;
    }

    public double totalFood1() {
        int total=0;
        if(foods==null){
            return -1;
        }
        for (int i = 0; i < count; i++) {
            total+=foods[i].getPrice();
        }
        return total;
    }
    public Food1[] sort() {
        double max = foods == null ? 0 : foods[0].getPrice();
        for (int i = 0; i < count; i++) {
            if (foods[i].getPrice() > max) {
                max = foods[i].getPrice();
            }
        }
        int $count = 0;
        for (int i = 0; i < count; i++) {
            if (max == foods[i].getPrice()) {
                $count++;
            }

        }
        Food1[] sort = new Food1[$count];
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (foods[i].getPrice() == max) {
                sort[j++] = foods[i];
            }
        }
        return sort;
    }
    public Food1[] sorts(){
        Food1[] sorts=new Food1[count];
        for(int i=0;i<count-1;i++){
            for(int j=0;j<count-1-i;j++){
                if(foods[j].getPrice()>foods[j+1].getPrice()){
                   Food1 target=foods[j];
                    foods[j]=foods[j+1];
                    foods[j+1]=target;
                }
                else if(foods[j].getPrice()==foods[j+1].getPrice()){
                    if(foods[j].getCount()<foods[j+1].getCount()){
                        Food1 target=foods[j];
                        foods[j]=foods[j+1];
                        foods[j+1]=target;
                    }
                }
            }
        }
        for(int i=0;i<count;i++){
            sorts[i]=foods[i];
        }
        return sorts;
    }
}