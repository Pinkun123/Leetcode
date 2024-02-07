// class Solution {
//     public int Opratore(int a,int b,String token){
//         if(token == "+"){
//             return a+b;
//         }
//         else if(token == "-"){
//             return a+b;
//         }
//         else if(token == "*"){
//             //convert int to long
//             // long x=Long.valueOf(a);
//             // long y=Long.valueOf(b);
//             // return x+y;
//             return a*b;
//         }
//         else{
//             return a/b;
//         }
       
//     }
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> st=new Stack<>();

//         for(String token : tokens){
//             // check token is operetor
//             if( token =="+" || token =="-" || token =="*" || token =="/"){
//                 // pop two elemnt from stack
//                 int b=st.pop();  // first int 
        
//                 int a=st.pop();// 2nd int
               

//                 // then store the value in res
//                 int res=Opratore(a,b,token);
//                 st.push(res);
//             }
//             else{
//                 // convert String to int
//                  st.push(Long.parseLong(token));
//             }
//         }
//         return st.pop();
//     }
// }



class Solution {
    long resolves(long a, long b, char Operator) {
        if (Operator == '+') return a + b;
        else if (Operator == '-') return a - b;
        else if (Operator == '*') return a * b;
        return a / b;
    }

    public int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            if (tokens[i].length() == 1 && tokens[i].charAt(0) < 48) {
                long integer2 = stack.pop();
                long integer1 = stack.pop();
                char operator = tokens[i].charAt(0);
                long resolvedAns = resolves(integer1, integer2, operator);
                stack.push(resolvedAns);
            } else {
                stack.push(Long.parseLong(tokens[i]));
            }
        }
        return stack.pop().intValue();
    }
}
