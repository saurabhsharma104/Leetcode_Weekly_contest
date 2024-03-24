class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((long[] a, long[] b) -> {
            return Long.compare(b[1], a[1]);
        });
        HashMap<Long, Long> hm = new HashMap<>();
        long[] res = new long[nums.length];
        for(int i=0; i<nums.length; i++) {
            long num = (long)nums[i];
            hm.put(num, hm.getOrDefault(num, 0L) + freq[i]);
            pq.add(new long[]{num, hm.get(num)});

            while(hm.get(pq.peek()[0]) != pq.peek()[1]) pq.poll();
            
            res[i] = pq.peek()[1];
        }  
        return res;
    }
}