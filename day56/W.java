package 刷题;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 数字分类 (20)
 * 题目描述
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，
 * 随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
 * 输出描述:
 * 对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，
 * 但行末不得有多余空格。
 * 若其中某一类数字不存在，则在相应位置输出“N”。
 * 输入例子:
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 输出例子:
 * 30 11 2 10.4 9
 */
public class W {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []num=new int[N];
        int i=0;
        int temp=0;
        int count=0;
            while (i<N){
                num[i]=sc.nextInt();
                i++;
            }
            int A1=0,A2=0,A3=0,A4=0,A5=0;
            boolean b1=false,b2=false,b3=false,b4=false,b5=false;
            for (int j = 0; j < N; j++) {
                if(num[j]%5==0&&num[j]%2==0) {
                    A1 = A1 + num[j];
                    b1=true;
                }
                if(num[j]%5==1){
                    A2=A2+(int)Math.pow(-1,temp)*num[j];
                    temp++;
                    b2=true;
                }
                if(num[j]%5==2){
                   A3++;
                    b3=true;
                }
                if(num[j]%5==3){
                    A4=A4+num[j];
                    count++;
                    b4=true;
                }
                if(num[j]%5==4){
                    b5=true;
                    if(A5<num[j]){
                        A5=num[j];
                    }
                }
            }
            if(b1){
                System.out.print(A1+" ");
            }else {
                System.out.print("N ");
            }
            if(b2){
                System.out.print(A2+" ");
            }else {
                System.out.print("N ");
            }
            if(b3){
                System.out.print(A3+" ");
            }else {
                System.out.print("N ");
            }
            if(b4){
                System.out.print(A4/count+"."+(int)((A4%count*100/count+5)/10)+" ");
            }else {
                System.out.print("N ");
            }
            if(b5){
                System.out.print(A5);
            }else {
                System.out.print("N");
            }
        System.out.println();
        }
    }
