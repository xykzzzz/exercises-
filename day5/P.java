package 刷题;

import java.util.Scanner;

//A-B B-C A+B B+C
// 1   -2  3   4
// A2 B1 C3
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_b, b_c, ab, bc;
        int a,b,c;
        while (sc.hasNext()) {
            a_b = sc.nextInt();
            b_c = sc.nextInt();
            ab = sc.nextInt();
            bc = sc.nextInt();
            a = (a_b + ab) / 2;
            b = (ab - a_b) / 2;
            c = (bc - b_c) / 2;
            if (a - ((a_b + ab) / 2) != 0) {
                System.out.println("NO");
                return;
            }
            if ((b - ((ab - a_b) / 2) != 0 || (b != (bc + b_c) / 2))) {
                System.out.println("NO");
                return;
            }
            if (c - ((bc - b_c) / 2) != 0) {
                System.out.println("NO");
                return;
            }
            System.out.println(a + " " + b + " " + c);
        }
    }
}
