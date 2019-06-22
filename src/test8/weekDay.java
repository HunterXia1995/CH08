package test8;

public enum weekDay {
    Sunday("星期日"),
    Monday("星期1"),
    Tuesday("星期2"),
    Wednesday("星期3"),
    Thursday("星期4"),
    Friday("星期5"),
    Saturday("星期6");

    private  String day;
    private weekDay(String day){
        this.day=day;
    }
    public String getDay(){
        return this.day;
    }
    public String tostring(){
        return "name=" + this.name() + ",value=" + this.day;
    }
}
