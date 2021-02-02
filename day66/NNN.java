package 刷题;

import java.util.*;

public class NNN {
    static Map<String, Integer> file;
    static List<Node> lists=new ArrayList<>();
    static class Node {
        String name;
        int count;

        public Node(String name) {
            this.name = name;
            this.count=1;
        }

        public void add(int value) {
            count += value;
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            file = new HashMap<>();
            String fileName;
            int count = 0, index;
            while (sc.hasNext()) {
                fileName = sc.nextLine();
                    fileName = fileName.substring(fileName.lastIndexOf('\\') + 1);
                if (file.containsKey(fileName)) {
                    lists.get(file.get(fileName)).add(1);
                } else {
                    file.put(fileName, count++);
                    index = fileName.indexOf(' ');
                    fileName = index > 16 ? fileName.substring(index - 16) : fileName;
                    lists.add(new Node(fileName));
                }
            }
            Collections.sort(lists, (node1, node2) -> node2.count - node1.count);
            Node node;
            for(int i = 0; i < Math.min(8, lists.size()); i++){
                node = lists.get(i);
                System.out.println(node.name + " " + node.count);
            }
        }
}
