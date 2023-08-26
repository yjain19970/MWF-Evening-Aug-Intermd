package collectionsdemo;

import java.lang.reflect.Array;
import java.util.*;

public class DemoList {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);


        ArrayList<Integer> list2 = new ArrayList<>(10);
        list2.add(100);
        list2.add(150);


        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student(15));
        studentLinkedList.add(new Student(17));
        studentLinkedList.addFirst(new Student(1));
        studentLinkedList.addLast(new Student(100));

        List<Integer> vec = new Vector<>();
        Vector<Integer> vec2 = new Vector<>();

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(15);

        Set<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(15);

        System.out.println(set.equals(set3));
        // above will ONLY GIVE FUNC RELATED TO SET INTERFACE.


        HashSet<Integer> set2  = new HashSet<>();
        // I CAN GET ALL THE FUNC OF HASHSET + SET
        set2.hashCode();


        TreeSet<Integer> treeSet = new TreeSet<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.offer(15);


        pq.remove(10);
        pq.poll();















    }
}
