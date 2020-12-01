package 刷题;

import java.util.Scanner;

public class BB {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            int w=in.nextInt();
            int h=in.nextInt();
            int res;
            if(w%4==0||h%4==0)
                res=w*h/2;
            else
                res=w*h/2+1;
            System.out.println(res);
        }
    }

