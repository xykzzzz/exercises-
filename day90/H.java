package 刷题1;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String res=reverse(sentence);
        System.out.println(res);
    }

    private static String reverse(String sentence) {
        String[] s = sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = s.length-1; i >=0 ; i--) {
            if(i==0){
                sb.append(s[i]);
            }else {
                sb.append(s[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
