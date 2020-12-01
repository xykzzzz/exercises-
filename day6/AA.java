package 刷题;

import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=a;
        int n=b;
        //先求出最大公约数 辗转相除法
        while (b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        //循环中出来a的值为最大公约数
        System.out.println(m*n/a);
    }
}
