package 刷题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T {
    //ppRYYGrrYBR2258
    //YrR8RrY   yes  8
    static int oldSize;
    static int newSize;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String shop=sc.nextLine();
            String emp=sc.nextLine();
            boolean judge=search(shop,emp);
            if(judge){
                System.out.println("Yes "+(shop.length()-emp.length()));
            }else {
                System.out.println("No "+(emp.length()-oldSize+newSize));
            }
        }
    }

    private static boolean search(String shop, String emp) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i <shop.length() ; i++) {
            list.add(shop.charAt(i));
        }
         oldSize=shop.length();
        for (int i = 0; i < emp.length(); i++) {
            int j=0;
            if(list.contains(emp.charAt(i))){
                while (j<list.size()) {
                    char c = emp.charAt(i);
                    if(list.get(j)==c){
                        list.remove(j);
                        break;
                    }
                    j++;
                }
            }
        }
         newSize=list.size();
        return oldSize - newSize == emp.length();
    }
}
