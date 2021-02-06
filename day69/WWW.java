package 刷题;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class WWW {
    //7_This_is_a_test
    //_hs_s_a_es
    //7TI
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputShow=sc.nextLine().toUpperCase();
        String realShow=sc.nextLine().toUpperCase();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < inputShow.length(); i++) {
            set.add(inputShow.charAt(i));
        }
        for (int i = 0; i <realShow.length() ; i++) {
            if(set.contains(realShow.charAt(i))){
                set.remove(realShow.charAt(i));
            }
        }
        for(Character c: set){
            System.out.print(c);
        }
        System.out.println();
    }
}
