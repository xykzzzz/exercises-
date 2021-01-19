package 刷题;

import java.util.*;

public class O {
    /**
     * 查找和排序
     * 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
     * 都按先录入排列在前的规则处理。
     * 示例：
     * jack      70
     * peter     96
     * Tom       70
     * smith     67
     * 从高到低  成绩
     * peter     96
     * jack      70
     * Tom       70
     * smith     67
     * 从低到高
     * smith     67
     * jack      70
     * Tom      70
     * peter     96
     * 输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）
     * 或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开
     */
    static class student{
        String name;
        int score;

        public student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt(); //学生的人数
            int sort=sc.nextInt(); //按什么方法进行排序
            List<student> list=new ArrayList<>(); //存放学生的容器
            for (int i = 0; i < num; i++) {
                list.add(new student(sc.next(),sc.nextInt()));
            }
            if(sort==0){
                Collections.sort(list, new Comparator<student>() { //实现comparator让学生类具备比较能力
                    @Override
                    public int compare(student o1, student o2) {
                        return o2.score-o1.score;
                    }
                });
            }
            if(sort==1){
                Collections.sort(list, new Comparator<student>() {
                    @Override
                    public int compare(student o1, student o2) {
                        return o1.score-o2.score;
                    }
                });
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).name+" "+list.get(i).score);
            }
        }
    }
}
