package 刷题1;

import java.util.Scanner;

public class I {
    static int[] month_day = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            int judge=iConverDateToDay(year,month,day);
            System.out.println(judge);
        }
    }

    private static int iConverDateToDay(int year, int month, int day) {
        int sumDay=0;
        for (int i = 0; i < month - 1; i++) {
            sumDay+=month_day[i];
        }
        if(month_day[month-1]<day){
            return -1;
        }
        sumDay+=day;
        if(month > 2 && is_leap(year)){
            sumDay += 1;
        }
        return sumDay;
    }

    private static boolean is_leap(int n) {
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
}
