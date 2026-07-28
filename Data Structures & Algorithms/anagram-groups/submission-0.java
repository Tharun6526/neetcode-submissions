class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mpp = new HashMap<>();
        for(String s :strs){
            int[] freq =  new int[26];
            for(int i =0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
            }
            String k = Arrays.toString(freq);
            mpp.putIfAbsent(k,new ArrayList<>());
            mpp.get(k).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
