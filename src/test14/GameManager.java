package test14;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import  java.util.*;
public class GameManager {
    Map<String, Game> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GameManager GM=new GameManager();
        Map<String, Game> map = new HashMap<>();
        GM.chu();
        /*System.out.println("请输入你要查找的年份(列：1990年)");
        String year=input.next();
        Game gg=GM.find(year);
       if( gg==null){
           System.out.println("没有举办世界杯");
       }
       else{
           System.out.println("世界冠军"+gg.getChampion()+"夺冠年份"+gg.getYear());
       }*/
        System.out.println("请输入你要查找的获冠国家");
        String champion=input.next();
        Game game = new Game();
        Game g = new Game("第一届", "1930年", "乌拉圭	", "乌拉圭");
        Game g1 = new Game("第二届", "1934年", "意大利	", "意大利");
        Game g2 = new Game("第三届", "1938年", "法国	", "意大利");
        Game g3 = new Game("第四届", "1950年", "巴西	", "乌拉圭");
        Game g4 = new Game("第五届", "1954年", "瑞士	", "西德	");
        Game g5 = new Game("第六届", "1958年", "瑞典	", "巴西	");
        Game g6 = new Game("第七届", "1962年", "智利	", "巴西	");
        Game g7 = new Game("第八届", "1966年", "英格兰	", "英格兰");
        Game g8 = new Game("第九届", "1970年", "墨西哥	", "巴西	");
        Game g9 = new Game("第十届", "1974年", "前西德	", "西德	");
        Game g10 = new Game("第十一届", "1978年", "阿根廷	", "阿根廷");
        Game g11 = new Game("第十二届", "1982年", "西班牙	", "意大利");
        Game g12 = new Game("第十三届", "1986年", "墨西哥	", "阿根廷");
        Game g13 = new Game("第十四届", "1990年", "意大利	", "西德	");
        Game g14 = new Game("第十五届", "1994年", "美国	", "巴西	");
        Game g15 = new Game("第十六届", "1998年", "法国	", "法国	");
        Game g16 = new Game("第十七届", "2002年", "韩日	", "巴西	");
        Game g17 = new Game("第十八届", "2006年", "德国	", "意大利");
        Game g18 = new Game("第十九届", "2010年", "南非	", "西班牙");
        Game g19 = new Game("第二十届", "2014年", "巴西	", "德国	");
        map.put(g.getYear(),g);
        map.put(g1.getYear(),g1);
        map.put(g2.getYear(),g2);
        map.put(g3.getYear(),g3);
        map.put(g4.getYear(),g4);
        map.put(g5.getYear(),g5);
        map.put(g6.getYear(),g6);
        map.put(g7.getYear(),g7);
        map.put(g8.getYear(),g8);
        map.put(g9.getYear(),g9);
        map.put(g10.getYear(),g10);map.put(g11.getYear(),g11);
        map.put(g12.getYear(),g12);
        map.put(g13.getYear(),g13);
        map.put(g14.getYear(),g14);map.put(g15.getYear(),g15);
        map.put(g16.getYear(),g16);
        map.put(g17.getYear(),g17);
        map.put(g18.getYear(),g18);
        map.put(g19.getYear(),g19);
        //GM.du(champion);
        Collection<Game>  value=map.values();
        for(Game a:value){
            System.out.println(a.getChampion()==champion);
            if("巴西".equals(a.getChampion())){
                System.out.println(a.getYear());

            }
            System.out.println(a.getChampion());
        }

    }
    public void chu(){

        Game game = new Game();
        Game g = new Game("第一届", "1930年", "乌拉圭	", "乌拉圭");
        Game g1 = new Game("第二届", "1934年", "意大利	", "意大利");
        Game g2 = new Game("第三届", "1938年", "法国	", "意大利");
        Game g3 = new Game("第四届", "1950年", "巴西	", "乌拉圭");
        Game g4 = new Game("第五届", "1954年", "瑞士	", "西德	");
        Game g5 = new Game("第六届", "1958年", "瑞典	", "巴西	");
        Game g6 = new Game("第七届", "1962年", "智利	", "巴西	");
        Game g7 = new Game("第八届", "1966年", "英格兰	", "英格兰");
        Game g8 = new Game("第九届", "1970年", "墨西哥	", "巴西	");
        Game g9 = new Game("第十届", "1974年", "前西德	", "西德	");
        Game g10 = new Game("第十一届", "1978年", "阿根廷	", "阿根廷");
        Game g11 = new Game("第十二届", "1982年", "西班牙	", "意大利");
        Game g12 = new Game("第十三届", "1986年", "墨西哥	", "阿根廷");
        Game g13 = new Game("第十四届", "1990年", "意大利	", "西德	");
        Game g14 = new Game("第十五届", "1994年", "美国	", "巴西	");
        Game g15 = new Game("第十六届", "1998年", "法国	", "法国	");
        Game g16 = new Game("第十七届", "2002年", "韩日	", "巴西	");
        Game g17 = new Game("第十八届", "2006年", "德国	", "意大利");
        Game g18 = new Game("第十九届", "2010年", "南非	", "西班牙");
        Game g19 = new Game("第二十届", "2014年", "巴西	", "德国	");
        map.put(g.getYear(),g);
        map.put(g1.getYear(),g1);
        map.put(g2.getYear(),g2);
        map.put(g3.getYear(),g3);
        map.put(g4.getYear(),g4);
        map.put(g5.getYear(),g5);
        map.put(g6.getYear(),g6);
        map.put(g7.getYear(),g7);
        map.put(g8.getYear(),g8);
        map.put(g9.getYear(),g9);
        map.put(g10.getYear(),g10);map.put(g11.getYear(),g11);
        map.put(g12.getYear(),g12);
        map.put(g13.getYear(),g13);
        map.put(g14.getYear(),g14);map.put(g15.getYear(),g15);
        map.put(g16.getYear(),g16);
        map.put(g17.getYear(),g17);
        map.put(g18.getYear(),g18);
        map.put(g19.getYear(),g19);

    }
    public Game find(String year){
        Game gg=map.get(year);
        if(gg==null){
            return null;
        }
        return gg;
    }
    public void du(String name){
    Collection<Game>  value=map.values();
        System.out.println(name);
    for(Game a:value){

        if(name.equals(a.getChampion())){
            System.out.println(a.getYear());

        }
    }
        System.out.println("没有");
    }

}