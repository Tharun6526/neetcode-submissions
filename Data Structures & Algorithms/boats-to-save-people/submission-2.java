class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int cnt= 0;
            while(i<=j &&people[j]==limit){
                cnt++;
                j--;
            }
            while(i<=j &&people[i]==limit){
                cnt++;
                i++;
            }
            while(i<=j){
            if(people[i]+people[j]<=limit){
                cnt++;
                i++;
                j--;
            }else{
                cnt++;
                j--;
            }
        }
        return cnt;
    }
}