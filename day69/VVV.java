package 刷题;

import java.util.Scanner;

public class VVV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            double x0=sc.nextFloat();
            double y0=sc.nextFloat();
            double z0=sc.nextFloat();
            double x1=sc.nextFloat();
            double y1=sc.nextFloat();
            double z1=sc.nextFloat();
            double r2=Math.pow((z1-z0),2)+Math.pow((y1-y0),2)+Math.pow((x1-x0),2);
            double r=Math.sqrt(r2);
            double s=4*Math.acos(-1)*Math.pow(r,3)/3;
            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f",s);
        }
    }
}
