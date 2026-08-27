class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> mpp = new HashSet<>();
        int len =0;
        int maxlen =0;
        int left = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            while(mpp.contains(ch)){
                maxlen = Math.max(maxlen,len);
                mpp.remove(s.charAt(left));
                left++;
            }
            mpp.add(ch);
            maxlen = Math.max(maxlen , i-left+1);
        }
        return maxlen;
    }
}
