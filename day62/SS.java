package 刷题;

import java.util.Scanner;

public class SS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            if(judgeLength(str)&&judgeType(str)&&judgeRepeat(str)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    private static boolean judgeRepeat(String str) {
        for(int a=0; a<str.length()-2; a++){
            if(str.substring(a+1).contains(str.substring(a,a+3))){
                return false;
            }
        }
        return true;
    }

    private static boolean judgeType(String str) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        char[] chars = str.toCharArray();
        for (char e:chars) {
            if(e>='A'&&e<='Z'){
                a=1;
            }else if(e>='a'&&e<='z'){
                b=1;
            }else if(e>='0'&&e<='9'){
                c=1;
            }else {
                d=1;
            }
        }
        if((a+b+c+d)>=3){
            return true;
        }
        return false;
    }

    private static boolean judgeLength(String str) {
        if(str.length()>8){
            return true;
        }
        return false;
    }
}
