package 刷题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//3 9 3 2 5 6 7 3 2 3 3 3
//3
public class U {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String []str=s.split(" ");
            Integer [] arr= new Integer[str.length];
            for(int i=0;i<str.length;i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            System.out.println(bigThanHalf(arr,arr.length));
        }
    }

    private static int bigThanHalf(Integer[] arr, int length) {
        Map<Integer,Integer> counts =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
                counts.put(arr[i],counts.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:counts.entrySet()) {
            int count=entry.getValue();
            int key=entry.getKey();
            if(count>=(length/2)){
                return  key;
            }
        }
        return 0;
    }
}
