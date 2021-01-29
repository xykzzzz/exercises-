package 刷题;

import java.util.Scanner;

public class TT {
    //守形数是这样一种整数，它的平方的低位部分等于它本身。
    // 比如25的平方是625，低位部分是25，因此25是一个守形数。
    // 编一个程序，判断N是否为守形数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            if(num == 5 || num == 6){
                System.out.println("Yes!");
            }else if((num>=2&&num<5)||(num>6&&num<=9)){
                System.out.println("No!");
            }
            else {
                int num2=(int)Math.pow(num,2);
               int target =parse(num2);
              //  System.out.println(target);
               if(target==num){
                   System.out.println("Yes!");
               }else {
                   System.out.println("No!");
               }
            }
        }
    }

    private static int parse(int num2) {
        int sum=0;
        int i=0;
        while (num2!=0&&i!=2){
            sum=sum+num2%10*(int)Math.pow(10,i);
            num2/=10;
            i++;
        }
        return sum;
    }
}
