package 刷题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WW {
    //4
    //A B C D
    //8
    //A D E CF A GG A B

    //A : 3
    //B : 1
    //C : 0
    //D : 1
    //Invalid : 3
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int cp=sc.nextInt();
            String[] name=new String[cp];
            for (int i = 0; i < cp; i++) {
                name[i]=sc.next();
            }
            int cv=sc.nextInt();
            int temp1=cv;
            Map<String,Integer> map=new HashMap<>();
            while (cv!=0){
                String temp=sc.next();
                map.put(temp,(map.getOrDefault(temp,0)+1));
                cv--;
            }
            int sum=0;
            for (int i = 0; i < cp; i++) {
                String names=name[i];
                if(map.get(names)!=null){
                    sum=sum+map.get(names);
                    System.out.println(names+" : "+map.get(names));
                }else {
                    System.out.println(names+" : 0");
                }
            }
            System.out.println("Invalid : "+(temp1-sum));
           // System.out.println(Arrays.toString(name));
        }
    }
}