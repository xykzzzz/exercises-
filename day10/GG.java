package 刷题;

import java.util.Scanner;

//输入为一个正整数N(1 ≤ N ≤ 1,000,000)
//输出一个最小的步数变为Fibonacci数
public class GG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=1;
        while (n>c){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(Math.min(n-b,c-n));
    }
}
/*
0 1 1 2 3 5 8 13 21*/
