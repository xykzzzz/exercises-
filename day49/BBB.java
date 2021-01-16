package offer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BBB {
    List<Integer> list=new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }
    public Double GetMedian() {
        Collections.sort(list);
        int len = list.size();
        if(list==null){
            return null;
        }else if(list.size()%2!=0){
            return Double.valueOf(list.get(list.size()/2));
        }else {
            return (list.get(len/2)+list.get(len/2-1))/2.0;
        }
    }
}
