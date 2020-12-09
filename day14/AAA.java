package 刷题;

import java.util.Scanner;

public class AAA {
    public static String AddLongInteger(String addend,String augEnd){
        char[] add = addend.toCharArray();
        long res=0;
        for (int i = 0; i < add.length; i++) {
            if (i == 0) {
                res = add[i] - '0';
            } else {
                res = res * 10 + (add[i] - '0');
            }
        }
        char[] aug = augEnd.toCharArray();
        long res1=0L;
        for (int i = 0; i <aug.length ; i++) {
            if (i == 0) {
                res1 = aug[i] - '0';
            } else {
                res1= res1* 10 + (aug[i] - '0');
            }
        }
        long ret=res+res1;
        String s=ret+"";
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ss=sc.next();
        String s1 = AddLongInteger(s, ss);
        System.out.println(s1);
    }
}
