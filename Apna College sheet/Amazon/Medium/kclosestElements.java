import java.util.*;

class kclosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> {
                    int diff = Math.abs(b - x) - Math.abs(a - x);

                    if (diff == 0) {
                        return b - a;
                    }

                    return diff;
                });

        List<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.sort(ans);

        return ans;
    }
}