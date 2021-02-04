package 刷题;
import java.util.Scanner;
public class XXX {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            System.out.println(fib(n));
        }
        public static int fib(int n) {
            if(n<0)
                return 0;
            if(n==0)
                return 1;
            return fib(n-1)+fib(n-2);
        }
    }
