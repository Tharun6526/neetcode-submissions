class Solution {
    public int calPoints(String[] operations) {
        int sum  = 0;
        Stack<Integer> st =  new Stack<>();
        for(String i  : operations){
            if(i.equals("D")){
                sum += st.peek() * 2;
                st.push(st.peek()*2);
            }else if(i.equals("C")){
                sum-=st.peek();
                st.pop();
            }else if(i.equals("+")){
                if(!st.isEmpty()){
                    int top = st.pop();
                    int sec = st.peek();
                    st.push(top);
                    st.push(top+sec);
                    sum += top+sec;
                }
            }else{
                st.push(Integer.valueOf(i));
                sum += st.peek();
            }
        }
        return sum;
    }
}