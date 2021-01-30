package 刷题;

import java.util.Scanner;

public class QQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            float sum1=all(n);
            float sum2=other(n);
            float res=(sum2/sum1)*100;
            System.out.println(String.format("%.2f",res)+"%");
        }
    }

    private static float other(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(other(n-1)+other(n-2));
        }
    }

    private static float all(int n) {
        if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }
        else {
            return n*all(n-1);
        }
    }
}
