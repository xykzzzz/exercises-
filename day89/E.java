package 刷题1;

public class E {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] res=new int[n*n];
        int index=0;
        int i=0;
        int j=n-1;
        while (i<n){
            int x=i;
            int y=j;
            while (x<n&&y<n){
                res[index]=arr[x][y];
                x++;
                y++;
                index++;
            }
            if(j>0){
                j--;
            }else {
                i++;
            }
        }
        return res;
    }
}
