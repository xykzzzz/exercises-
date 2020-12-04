package 刷题;

import java.util.Scanner;

//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
public class EE {
    //此方法消耗太大 运行时间过长
/*    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long n=1;
        for (int i = num; i >0 ; i--) {
            n*=i;
        }

        int count=0;
        while (n%10==0){
           count=count+1;
            n=n/10;
        }
        System.out.println(count);
    }*/
//转化问题 求一个数有末尾几个0 转化为先遍历从5到这个数，然后求每个数可以被5整除，count++
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for (int i = num; i >=5 ; i--) {
            int temp=i;
            while (temp%5==0){
                count++;
                temp=temp/5;
            }
        }
        System.out.println(count);
    }
}
