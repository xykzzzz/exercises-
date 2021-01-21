package 刷题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class R {
    static String password="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String translate="VWXYZABCDEFGHIJKLMNOPQRSTU";
    static Map<Character,Character> map=new HashMap<>();
    public static void method(){
        for (int i = 0; i < password.length(); i++) {
            map.put(password.charAt(i),translate.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        method();
        while (sc.hasNext()){
            String s=sc.nextLine();
            String res=pass(s); //HELLO WORLD<br/>SNHJ
            System.out.println(res);
        }
    }

    public static String pass(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(chars[i]>='A'&&chars[i]<='Z'){
                chars[i]=map.get(chars[i]);
                sb.append(chars[i]);
            }else {
                sb.append(chars[i]);
                continue;
            }
        }
        return sb.toString();
    }
}
