package 刷题1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class K {
    //5 5

    //1 4
    //2 3
    //5
    static List<List<Integer>> lists=new ArrayList<>();
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            backTrace(1,0,m,n);
            for (List<Integer> l : lists) {
                for (int i = 0; i < l.size(); i++) {
                    System.out.print(l.get(i));
                    if (i != l.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    private static void backTrace(int startIndex, int sum, int target, int n) {
        if(sum>=target){
            if(sum==target){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = startIndex; i <=n; i++) {
            if(i>target){
                continue;
            }
            list.add(i);
            backTrace(i+1,sum+i,target,n);
            list.remove(list.size()-1);
        }
    }
}
