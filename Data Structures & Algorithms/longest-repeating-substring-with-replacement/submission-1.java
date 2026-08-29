class Solution {
    public int characterReplacement(String s, int k) {
        int i =0;
        int j = 0;
        int max = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();
        int maxlen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            int maxcharfreq = mpp.get(ch);
             max = Math.max(max,maxcharfreq);
            if((j-i+1) - max >k){
                char c = s.charAt(i);
                mpp.put(c,mpp.get(c)-1);
                i++;
            }else{
                maxlen = Math.max(maxlen,j-i+1);
            }
            j++;
        }
        return maxlen;
    }
}
