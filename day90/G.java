package 刷题1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class G {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String ss=sc.nextLine();
        String res=remainStr(s,ss);
        System.out.println(res);
    }

    private static String remainStr(String s, String ss) {
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ss.length(); i++) {
            set.add(ss.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                continue;
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
