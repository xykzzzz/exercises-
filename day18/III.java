package 刷题;

import java.util.*;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/97ba57c35e9f4749826dc3befaeae109?orderByHotValue=1&questionTypes=000100&done=0&pos=10&mutiTagIds=581&onlyReference=false
 * 来源：牛客网
 *
 * 给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，
 * 一共N辆火车，每辆火车以数字1-9编号，火车站只有一个方向进出，
 * 同时停靠在火车站的列车中，只有后进站的出站了，先进站的才能出站。
 * 要求输出所有火车出站的方案，以字典序排序输出。
 *
 * 输入
 * 3
 * 1 2 3
 * 输出
 * 1 2 3
 * 1 3 2
 * 2 1 3
 * 2 3 1
 * 3 2 1
 */
public class III {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int start=0;
            List<int[]> allOrder=new ArrayList<>();
            Permutation(arr,start,n,allOrder);
            Set<String> sortResult=new TreeSet<>();
            for (int[] out :allOrder) {
                if(isLegal(arr,out,n)){
                    StringBuilder sb=new StringBuilder();
                    for (int i = 0; i < n - 1; i++) {
                        sb.append(out[i]+" ");
                    }
                    sb.append(out[n-1]);
                    sortResult.add(sb.toString());
                }
            }
            for (String s:sortResult) {
                System.out.println(s);
            }
        }
    }

    private static boolean isLegal(int[] in, int[] out, int n) {
        Deque<Integer> stack=new LinkedList<>();
        int i=0;
        int j=0;
        while (i<n){
            if(in[i]==out[j]){
                i++;
                j++;
            }else {
                if(stack.isEmpty()){
                    stack.push(in[i]);
                    i++;
                }else {
                    int top=stack.peek();
                    if(top==out[j]){
                        j++;
                        stack.pop();
                    }else if(i<n){
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while (!stack.isEmpty()&&j<n){
            int top=stack.pop();
            if(top==out[j]){
                j++;
            }else {
                return false;
            }
        }
        return true;
    }

    private static void Permutation(int[] arr, int start, int n, List<int[]> allOrder) {
        if(n==start){
            return;
        }
        if(n-1==start){
            int[] newArr=arr.clone();
            allOrder.add(newArr);
            return;
        }
        for (int i = start; i <n ; i++) {
            swap(arr,start,i);
            Permutation(arr,start+1,n,allOrder);
            swap(arr,start,i);
        }
    }

    private static void swap(int[] arr, int start, int i) {
        int temp=arr[start];
        arr[start]=arr[i];
        arr[i]=temp;
    }
}
