class Solution {
    public int largestRectangleArea(int[] heights) {
        // declare stack
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];

        //get NextSmaller right
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                
                 s.pop();
            }
            if(s.isEmpty()){
                //nsr=-1
                nsr[i]=n; 
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }


        //get NextSmaller left
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
           
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        // findd maxaArera
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
           int height=heights[i];
           int width=nsr[i]-nsl[i]-1;  //j-i-1;
           int currArea=height *width;

           maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
}