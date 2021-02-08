package 刷题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//输入一行字符串，计算其中A-Z大写字母出现的次数
public class RRR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<>();
        while (sc.hasNext()){
            String str=sc.nextLine();
            for (char i = 'A'; i <='Z' ; i++) {
                map.put(i,0);
            }
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                    char c=str.charAt(i);
                    map.put(c,map.getOrDefault(c,0)+1);
                }
            }
            for (Map.Entry<Character,Integer> e:map.entrySet()) {
                char key = e.getKey();
                int value = e.getValue();
                System.out.println(key+":"+value);
            }
        }
    }
}
