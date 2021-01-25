package 刷题;

import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []gradeCredit=new int[n];
            int []score=new int[n];
            for (int i = 0; i < n; i++) {
                gradeCredit[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                score[i]=sc.nextInt();
            }
            System.out.printf("%.2f",averageScore(gradeCredit,score));
        }
    }

    private static double averageScore(int[] gradeCredit, int[] score) {
        double sum=0;
        double allClass=0;
        for (int i = 0; i < score.length; i++) {
            allClass=allClass+gradeCredit[i]*GPA(score[i]);
            sum+=gradeCredit[i];
        }
        return allClass/sum;
    }

    private static double GPA(int score) {
        double gpa = 0.0;
        if(score>=90&&score<=100)
            gpa=4.0;
        if(score>=85&&score<=89)
            gpa=3.7;
        if(score>=82&&score<=84)
            gpa=3.3;
        if(score>=78&&score<=81)
            gpa=3.0;
        if(score>=75&&score<=77)
            gpa=2.7;
        if(score>=72&&score<=74)
            gpa=2.3;
        if(score>=68&&score<=71)
            gpa=2.0;
        if(score>=64&&score<=67)
            gpa=1.5;
        if(score>=60&&score<=63)
            gpa=1.0;
        if(score<60)
            gpa=0.0;
        return gpa;
    }
}
