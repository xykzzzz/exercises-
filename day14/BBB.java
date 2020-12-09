package 刷题;


import java.util.Scanner;

public class BBB {
    //2 2 0 0 0 3 0 0 1 0 1 0 0 1 5 5 5 8
    //2 2 0 0 0 3 0 0 1 010015558
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        int ii=0;
        while (sc.hasNext()){
            int x=sc.nextInt();
            arr[ii]=x;
            ii++;
            if(ii==10){
                break;
            }
        }
        //插入排序
        for (int i = 0; i< arr.length - 1; i++) {
            int j=0;
            int key=arr[i+1];
            for ( j = i; j >=0 ; j--) {
                if(key<arr[j]){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=key;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                arr[i] ^= arr[0];
                arr[0]^=arr[i];
                arr[i] ^= arr[0];
                break;
            }
        }
        String s="";
        for (int i = 0; i < arr.length; i++) {
            s=s+arr[i];
        }
        System.out.println(s);
    }
}
