class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<=x.length()-1;i++){
            if(stk.empty()) stk.push(x.charAt(i));
            else if(!stk.empty() && stk.peek() == '{' && x.charAt(i) == '}') stk.pop();
            else if(!stk.empty() && stk.peek() == '[' && x.charAt(i) == ']') stk.pop();
            else if(!stk.empty() && stk.peek() == '(' && x.charAt(i) == ')') stk.pop();
            else stk.push(x.charAt(i));

        }

        if(stk.empty())
            return true;
        return false;
    }
}
