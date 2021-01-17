package offer;

public class DDD {
    //地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
    // 每一次只能向左，右，上，下四个方向移动一格，
    // 但是不能进入行坐标和列坐标的数位之和大于k的格子。
    // 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
    // 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
    // 请问该机器人能够达到多少个格子？
    //5,10,10    21
    public static int movingCount(int threshold, int rows, int cols) {
        int count=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
   /*             if(i<=9&&j<=9){
                    if(i+j<=threshold){
                        count++;
                    }
                }else if(i>9&&j<=9){
                    int sum=help(i);
                    if(sum+j<=threshold){
                        count++;
                    }
                }else if(i<=9&&j>9){
                    int sum=help(j);
                    if(sum+i<=threshold){
                        count++;
                    }
                }else {
                    int sum1=help(i);
                    int sum2=help(j);
                    if(sum1+sum2<=threshold){
                        count++;
                    }
                }*/
                if(help(i)+help(j)<=threshold){
                    count++;
                }else if(cols==1||rows==1){
                    return count;
                }
            }
        }
        return count;
    }

    private static int help(int i) {
        if(i<=9){
            return i;
        }
        String s=""+i;
        char[] chars = s.toCharArray();
        int sum=0;
        for (int j = 0; j < chars.length; j++) {
            sum=sum+(chars[j]-'0');
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(10, 1, 100));
    }
}
