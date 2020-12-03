package 刷题;

import java.util.*;

public class CC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x > 1000) {
                x = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                list.add(i);
            }
            int index = 0;
            while (list.size() > 1) {
                index = (index + 2) % list.size();
                list.remove(index);
            }
            int getNum = list.get(0);
            System.out.println(getNum);
        }
    }
}
