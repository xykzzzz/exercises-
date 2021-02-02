package 刷题;

import java.util.Scanner;

public class OO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            for (int i = 0; i < s.length(); i++) {
                String s1=Integer.toBinaryString(s.charAt(i));
                //System.out.println(s1);
                String s2=String.format("%07d",Integer.parseInt(s1));
                System.out.println(s2);
                int count=0;
                for (int j = 0; j < 7; j++) {
                    if(s2.charAt(j)=='1'){
                        count++;
                    }
                }
                System.out.println(count%2==0?"1"+s2:"0"+s2);
            }
        }
    }
}
