package 刷题1;

import java.util.Scanner;

public class F {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.nextLine();
            int i=0;
            int j=s.length()-1;
            int flag=0;
            while(i<=j){
              if(s.charAt(i)!=s.charAt(j)){
                  if(i+1<=j&&s.charAt(i+1)==s.charAt(j)){
                      i++;
                      flag++;
                  }else if(j-1>=i&&s.charAt(j-1)==s.charAt(i)){
                      j--;
                      flag++;
                  }else {
                      flag+=2;
                      break;
                  }
              }else {
                  i++;
                  j--;
              }
            }
            if(flag<2) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
