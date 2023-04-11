package isValid;

import java.util.Stack;

class isValid {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){stack.push(c);}
            else if(stack.isEmpty()||c==')'&&stack.pop()!='('||c==']'&&stack.pop()!='['||c=='}'&&stack.pop()!='{'){return false;}
        }
        return stack.isEmpty();
    }
}
