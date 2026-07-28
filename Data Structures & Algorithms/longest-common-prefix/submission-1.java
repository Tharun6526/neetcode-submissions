class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb =  new StringBuilder();
        String k = strs[0];
        for(int idx = 0; idx < k.length(); idx++){
            char currentChar = k.charAt(idx);
            for(int i = 0; i < strs.length; i++){
                if(idx >= strs[i].length() || strs[i].charAt(idx) != currentChar){
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}