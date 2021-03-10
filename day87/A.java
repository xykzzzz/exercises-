package 刷题1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        int j=0;
        int sum=0;
        int max=0;
        while (j++<n) {
            int i=sc.nextInt();
            int L=sc.nextInt();
            sc.nextLine();
            if(i==1) {
                list.add(L);
                sum=sum+L;
            }
            if(i==2){
               list.remove(list.indexOf(L));
               sum-=L;
            }
            Collections.sort(list);
            if(list.size()>0){
                max=list.get(list.size()-1);
            }
            if(sum-max>max){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
