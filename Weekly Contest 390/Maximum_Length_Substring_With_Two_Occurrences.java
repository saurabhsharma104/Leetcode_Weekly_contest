class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[] = new int[26];
        int res = 0;
        for(int i=0, j=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            while(j < i && freq[ch-'a'] == 2) freq[s.charAt(j++)-'a']--;
            freq[ch-'a']++;
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}