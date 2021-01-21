package 刷题;

import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int month=sc.nextInt();
            int n=count(month);
            System.out.println(n);
        }
    }

    private static int count(int month) {
        if(month<3){
            return 1;
        }
        return count(month-1)+count(month-2);
    }
}
