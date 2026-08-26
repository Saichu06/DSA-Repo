package GFG.Oracle;

import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
        int size = q.size()-1;
        while(size-->0){
            q.add(q.poll());
        }
    }

    void pop() {
        if(!q.isEmpty()){
             q.poll();
        }
    }

    int top() {
        if(q.size()==0){
            return -1;
        }
        
        return q.peek();
    }

    int size() {
        return q.size();
    }
}
