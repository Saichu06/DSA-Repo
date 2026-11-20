import java.util.*;

class kthLargestInStream {
    private PriorityQueue<Integer> pq;
    private int k;

    public void KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (pq.peek() < num) {
                pq.offer(num);
                while (pq.size() > k)
                    pq.poll();
            }
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.offer(val);
        } else if (pq.peek() < val) {
            pq.offer(val);
            while (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }
}