class Solution {
    public int minOperations(int k) {
        int a = (int) Math.sqrt(k);
        if(a*a == k) return a+a-2;
        if(a*(a+1) >= k) return a+a-1;
        if((a+1)*(a+1) >= k) return a+a;
        return -1;  // We will never come to this stage 
    }
}