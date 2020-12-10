package 刷题;

import java.util.Scanner;

//6
//31+33+35+37+39+41
//3^3=7+9+11
public class CCC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=100) {
             String s= GetSequelOddNum(n);
            System.out.println(s);
        }
    }

    private static String GetSequelOddNum(int n) {
        int mid=n*n;
        int start=mid+1-n;
        int end=mid-1+n;
        StringBuilder sb=new StringBuilder();
        for (; start <=end ; start+=2) {
            if(start==end){
                sb.append(start);
                break;
            }
            sb.append(start+"+");
        }
        return sb.toString();
    }
}