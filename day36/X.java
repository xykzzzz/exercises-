package offer;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class X {
    public RandomListNode Clone(RandomListNode pHead) {
        Map<RandomListNode,RandomListNode> newOldMap=new TreeMap<>(new Comparator<RandomListNode>() {
            @Override
            public int compare(RandomListNode o1, RandomListNode o2) {
                return o1.label-o2.label;
            }
        });
        //复制链表
        RandomListNode fakeNode=new RandomListNode(-1);
        RandomListNode tail=fakeNode;
        RandomListNode current=pHead;
        while (current!=null){
            RandomListNode newNode=new RandomListNode(current.label);
            tail.next=newNode;
            tail=newNode;
            newOldMap.put(current,newNode);
            current=current.next;
        }
        RandomListNode oldCurrent=pHead;
        RandomListNode newCurrent=fakeNode.next;
        while (oldCurrent!=null){
            RandomListNode oldRandom=oldCurrent.random;
            RandomListNode newRandom;
            if(oldRandom==null){
                newRandom=null;
            }else{
                newRandom=newOldMap.get(oldRandom);
            }
            newCurrent.random=newRandom;
            oldCurrent=oldCurrent.next;
            newCurrent=newCurrent.next;
        }
        return fakeNode.next;
    }
}
