package fuxi;

import java.util.Scanner;

public class A1 {
    //abcd12345ed125ss123456789
    //123456789
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = maxNumLength(s);
        System.out.println(res);
    }

    private static String maxNumLength(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right=0;
        int maxCount = 0;
        for (int move = 0; move < chars.length; move++) {
            if (chars[move] - '0' >= 0 && chars[move] - '0' <= 9) {
                left++;
                if(maxCount<left){
                    maxCount=left;
                    right=move;
                }
            }else {
                left=0;
            }
        }
        return s.substring(right-maxCount+1,right+1);
    }
}
