package test2;
import java.time.Month;
import java.util.*;
public class pra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输年份：");
        int year = input.nextInt();
        System.out.println("请输月份：");
        int month = input.nextInt();
        System.out.println("请输日期：");
        int day = input.nextInt();
        String[] weekDays = {
                "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"
        };
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, day % 7);
        int w = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(w);
        int num = 0;
        switch (month) {
            case 1:
                num = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    num = 29;
                } else {
                    num = 28;
                }
                break;
            case 3:
                num = 31;
                break;
            case 4:
                num = 30;
                break;
            case 5:
                num = 31;
                break;
            case 6:
                num = 30;
                break;
            case 7:
                num = 31;
                break;
            case 8:
                num = 31;
                break;
            case 9:
                num = 30;
                break;
            case 10:
                num = 31;
                break;
            case 11:
                num = 30;
                break;
            case 12:
                num = 31;
                break;
        }
        int i;
        for (i = 0; i < 7; i++) {
            if ((i + 1) % 7 == 0) {
                System.out.println(weekDays[i] + "\t");
            } else {
                System.out.print(weekDays[i] + "\t");
            }
        }
        if (w - day % 7 >= 0) {
            int j;
            for (j = 0; j < w - day % 7; j++) {
                System.out.print("      \t");
            }
            int k;
            for (k = 1; k <= num; k++) {
                if ((w - day % 7 + k) % 7 == 0) {
                    if(k==day){
                        System.out.println("   *" + k + "\t");
                    }
                    else{System.out.println("    " + k + "\t");}
                } else {
                    if(k==day){
                        System.out.print("   *" + k + "\t");
                    }
                    else{System.out.print("    " + k + "\t");}
                }

            }
        } else {
            int h;
            for (h = 0; h < 7 + w - day % 7; h++) {
                System.out.print("       \t");
            }
            int b;
            for (b = 1; b <= num; b++) {
                if ((7+w - day % 7 + b) % 7 == 0) {
                    if(b==day){
                        System.out.println("   *" + b + "\t");
                    }
                    else{System.out.println("    " + b+ "\t");}
                } else {
                    if(b==day){
                        System.out.print("   *" + b + "\t");
                    }
                    else{System.out.print("    " + b+ "\t");}
                }
            }
        }
    }
}


