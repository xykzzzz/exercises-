package fuxi;

import java.util.Arrays;
import java.util.Comparator;

public class FF {
    public static int findMinArrowShots(int[][] points) {
        if(points.length==0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]>o2[1]){
                    return 1;
                }else if(o1[1]<o2[1]){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        int shoot_num=1;
        int start=points[0][0];
        int end=points[0][1];
        for (int i = 1; i <points.length ; i++) {
            if(points[i][0]<=end){
                start=points[i][0];
                if(end>points[i][1]){
                    end=points[i][1];
                }
            }else {
                shoot_num++;
                start=points[i][0];
                end=points[i][1];
            }
        }
        return shoot_num;
    }
}
