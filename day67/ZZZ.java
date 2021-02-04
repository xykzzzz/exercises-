package 刷题;

import java.util.*;

public class ZZZ {
    //10
    //C J
    //J B
    //C B
    //B B
    //B C
    //C C      5 3 2
    //C B      2 3 5
    //J B      B B
    //B C
    //J J
    static class Node{
        String A;
        String B;

        public Node(String a, String b) {
            A = a;
            B = b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Deque<Node> stack=new LinkedList<>();
        for (int i = 0; i < N; i++) {
            stack.push(new Node(sc.next(),sc.next()));
        }
        int count=0;
        Map<String,Integer> mapA=new HashMap<>();
        Map<String,Integer> mapB=new HashMap<>();
        while (!stack.isEmpty()){
            Node node = stack.pop();
            if(node.A.equals(node.B)){
                count++;
                continue;
            }
            if(judge(node.A,node.B)){
                String s=node.A;
                mapA.put(s,(mapA.getOrDefault(s,0)+1));
            }
            if(!judge(node.A,node.B)){
                String s=node.B;
                mapB.put(s,(mapB.getOrDefault(s,0)+1));
            }
        }
            int numA=N-count;
             int numB=N-count;
            int maxA=0;
            int maxB=0;
            int max1=0;
            String a=null;
            String b=null;
            int max2=0;
        for (Map.Entry<String,Integer> e:mapA.entrySet()) {
            maxA=maxA+e.getValue();
            if(max1<e.getValue()){
                max1=e.getValue();
                a=e.getKey();
            }
        }
        for (Map.Entry<String,Integer> e:mapB.entrySet()) {
            maxB=maxB+e.getValue();
            if(max2<e.getValue()){
                max2=e.getValue();
                b=e.getKey();
            }
        }
            System.out.println(maxA+" "+count+" "+(numA-maxA));
            System.out.println(maxB+" "+count+" "+(numB-maxB));
            if(a==null){
                System.out.println("B"+" "+b);
            }
            if(b==null){
                System.out.println(a+" "+"B");
            }
            if(a!=null&&b!=null) {
                System.out.println(a + " " + b);
            }
    }

    private static boolean judge(String a, String b) {
        if(a.equals("C")&& b.equals("J")){
            return true;
        }
        if(a.equals("J")&&b.equals("B")){
            return true;
        }
        if(a.equals("B")&&b.equals("C")){
            return true;
        }
        return false;
    }
}
