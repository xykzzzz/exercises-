package 刷题;

import java.util.Scanner;

public class OOO {
    //十七个银西可(Sickle)兑一个加隆(Galleon)，二十九个纳特(Knut)兑一个西可
    //输入在1行中分别给出P和A，格式为“Galleon.Sickle.Knut”，其间用1个空格分隔。
    // 这里Galleon是[0, 107]]区间内的整数，
    // Sickle是[0,17)区间内的整数，Knut是[0, 29)区间内的整数
    //10.16.27 应付 14.1.28 实付
    //3.2.1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1 = s.split(" ");
        String yf=s1[0];
        String sf=s1[1];
        String[] split = yf.split("\\.");
        int sumYf=0;
        int a=new Integer(split[0])*493;
        int b=new Integer(split[1])*29;
        int c=new Integer(split[2]);
        sumYf=a+b+c;
        String[] split1 = sf.split("\\.");
        int sumSf;
        int aa=new Integer(split1[0])*493;
        int bb=new Integer(split1[1])*29;
        int cc=new Integer(split1[2]);
        sumSf=aa+bb+cc;
        int judge=sumSf-sumYf;
        if(judge<0){
            judge=-judge;
            int n=judge/493;
            int nn=(judge%493)/29;
            int nnn=(judge%493)%29;
            System.out.println("-"+n+"."+nn+"."+nnn);
        }
        else if(judge==0){
            System.out.println(judge);
        } else{
            int n=judge/493;
            int nn=(judge%493)/29;
            int nnn=(judge%493)%29;
            System.out.println(n+"."+nn+"."+nnn);
        }
    }
}
