package 刷题;

import java.util.Scanner;

public class XX {
    //对于给定的正整数 n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和。
    //4     12       97      39999
    //4 7 //3 9  //16 22    //39 36
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int temp=(int)Math.pow(n,2);
           // System.out.println(temp);
            int sum1 = convert(n);
            int sum2=convert(temp);
            System.out.println(sum1+" "+sum2);
        }
    }
    public static int convert(int n){
        int temp=n;
        int sum=0;
        while (temp!=0){
            sum=sum+temp%10;
            temp/=10;
        }
        return sum;
    }
}
