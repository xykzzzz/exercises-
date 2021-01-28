package 刷题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VV {
    //输入一个数n，然后输入n个数值各不相同，再输入一个值x，
    // 输出这个值在这个数组中的下标（从0开始，若不在数组中则输出-1
    //2 //1 3 //0
    //-1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int target=sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if(list.contains(target)){
                    int res = list.indexOf(target);
                    System.out.println(res);
                    break;
                }else {
                    System.out.println(-1);
                }
            }
        }
    }
}
