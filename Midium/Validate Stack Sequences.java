class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();

        int j=0; // which is itrate the poped array
        
        int n=pushed.length;
        for(int i=0;i<n;i++){
            // pusht the data int stack
            st.push(pushed[i]);

            while(!st.isEmpty() && st.peek() == popped[j]){
                // pop the elemnet form stack
                st.pop();
                j++; // increment
            }
        }

        return st.isEmpty();  // if empty give true either false;
    }
}