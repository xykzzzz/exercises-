package 刷题;

import java.math.BigInteger;
import java.util.Scanner;

//输入一个int整数 1516000
//将这个整数以字符串的形式逆序输出 0006151
public class FF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (n!=0){
            sb.append(n%10);
            n=n/10;
        }
        System.out.println(sb.toString());
    }
}
