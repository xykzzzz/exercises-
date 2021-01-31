package fuxi;

import java.util.*;

public class Test {
    //4
    //1 1 2 3
    //2 3
    private static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        findNumS(arr,len);
        if(list!=null) {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if(i==list.size()-1){
                    System.out.println(list.get(i));
                }else {
                    System.out.print(list.get(i) + " ");
                }
            }
        }
    }

    private static void findNumS(int[] arr, int len) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int x:arr) {
            map.put(x,(map.getOrDefault(x,0)+1));
        }
        for (Map.Entry<Integer,Integer> e:map.entrySet()) {
            if(e.getValue()%2==1){
                list.add(e.getKey());
            }
        }
    }
}
