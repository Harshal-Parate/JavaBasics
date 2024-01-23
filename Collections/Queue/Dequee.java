package Collections.Queue;

import java.util.*;

public class Dequee {

    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();
        Deque<Integer> w = new LinkedList<>();

        Queue<Integer> e = new PriorityQueue<>();

        //Adding elements in Deque
        q.offerFirst(1);
        q.offerLast(0);
        q.push(3);
        q.addLast(10);

        //Removing elements from Deque
        q.pollFirst();
        q.pollLast();
        q.pop();
        q.removeLast();






    }
}
