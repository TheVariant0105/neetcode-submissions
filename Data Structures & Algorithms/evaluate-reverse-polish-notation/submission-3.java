class Solution { 
    public int evalRPN(String[] tokens) {
        Stack<Integer>stk=new Stack<>();
        for(String str:tokens){
            if(Character.isDigit(str.charAt(str.length()-1))){
                stk.push(Integer.parseInt(str));
            }
            if(str.equals("+")){
                stk.push(stk.pop()+stk.pop());
            }
            if(str.equals("*")){
                stk.push(stk.pop()*stk.pop());
            }
            if(str.equals("-")){
                int val1=stk.pop();
                int val2=stk.pop();
                stk.push(val2-val1);
            }
            if(str.equals("/")){
                int val1=stk.pop();
                int val2=stk.pop();
                stk.push(val2/val1);
            }
        }
        return stk.pop();
    }
}
