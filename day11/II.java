package 刷题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class II {
    //对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出 100311
    //0:2<br/>1:3<br/>3:1
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        char[] number = s.toCharArray();
        Map<Integer,Integer> map=new HashMap<>();
        for (char c:number) {
                map.put(c-'0',(map.getOrDefault(c-'0',0))+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            int num=entry.getKey();
            int count=entry.getValue();
            System.out.println(num+":"+count);
        }
    }
}
