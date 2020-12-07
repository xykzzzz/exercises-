package 刷题;

/**
 * 给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 *1
 * 返回：["0","1"]
 */
public class LL {
    public String[] getGray(int n) {
        // write code here
        String[]res=null;
        if(n==1){
           res=new String[]{"0","1"};
        }else{
            String[] gray = getGray(n - 1);
            res=new String[gray.length*2];
            for (int i = 0; i < gray.length; i++) {
                res[i]="0"+gray[i];
                res[res.length-1-i]="1"+gray[i];
            }
        }
        return res;
    }
}
