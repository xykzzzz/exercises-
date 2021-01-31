package fuxi;

import java.util.Scanner;


public class Test1 {
    //7
     //3 4 1 5 6 2 7
    //-1 2
    //0 2
    //-1 -1
    //2 5
    //3 5
    //2 -1
    //5 -1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean judge=false;
            boolean judge1=false;
            int key=arr[i];
            for (int j = i; j >=0 ; j--) {
                if(key<=arr[j]){
                    continue;
                }
                if(key>arr[j]) {
                    System.out.print(j+" ");
                    judge=true;
                    break;
                }
            }
            if(!judge){
                System.out.print(-1+" ");
            }
            for (int j = i; j <arr.length ; j++) {
                if(key<=arr[j]){
                    continue;
                }
                if(key>arr[j]) {
                    System.out.print(j);
                    judge1=true;
                    break;
                }
            }
            if(!judge1){
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
/*
    private static void leftRightWay(int[] arr){
        int len = arr.length;
        int[] right = new int[len];
        int[] left = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < len; i++) {
            while(!stack.empty() && arr[i] < arr[stack.peek()]) {
                int tempTop = stack.pop();
                left[tempTop] = stack.empty() ? -1 : stack.peek();
                right[tempTop] = i;
            }
            stack.push(i);
        }

        while(!stack.empty()) {
            int tempTop = stack.pop();
            left[tempTop] = stack.empty() ? -1 : stack.peek();
            right[tempTop] = -1;
        }

        for(int i = 0; i < len; i++) {
            System.out.println(left[i] + " " + right[i]);
        }
    }*/
