package 刷题;

import java.util.Scanner;

public class UU {
    //10.0.3.193 //167969729
    //167773121 //10.3.3.193
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String ip=sc.next();
            int n=sc.nextInt();
            String res="";
            String[] split = ip.split("\\.");
            for (int i = 0; i < split.length; i++) {
                int temp=new Integer(split[i]);
                String s=convert(temp);
                //System.out.println(s);
                res=res+s;
                //System.out.println(res);
            }
            System.out.println(res);
            long sum=0;
            for (int i = 0; i < res.length(); i++) {
                int x=res.charAt(i)-'0';
                System.out.print(x+" ");
                sum=sum+x*(int)Math.pow(2,i);
            }
            System.out.println(sum);
        }
    }

    private static String convert(int n) {
        StringBuilder sb=new StringBuilder();
        int[] temps=new int[32];
        for (int i = 0; i < 32; i++) {
            temps[i]=n%2;
            n/=2;
        }
        for (int i = 7; i >=0 ; i--) {
            sb.append(temps[i]);
        }
        return sb.toString();
    }

}
