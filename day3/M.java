package 刷题;


import java.util.*;

//输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”
// ，则删除之后的第一个字符串变成”Thy r stdnts
public class M {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String res=remainString(s1,s2);
        System.out.println(res);
    }

    private static String remainString(String s1, String s2) {
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            if(set.contains(s1.charAt(i))){
                continue;
            }else{
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }
}
