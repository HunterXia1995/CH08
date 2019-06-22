package test8;

public class testWeekDay {
    public static void main(String[] args) {
        weekDay[] values = weekDay.values();
        for (int i = 0; i < values.length; i++) {
            weekDay weekDay = values[i];
            String name = weekDay.name();  //获取枚举的实例名称
            String day = weekDay.getDay();
            int ordinal = weekDay.ordinal(); //获取该枚举对象的位置，位置从0开始
            String string = weekDay.toString();
            System.out.println("name=" + name + ",day=" + day + ",ordinal=" + ordinal + ",string=" + string);
            System.out.println();
        }
    }
}
