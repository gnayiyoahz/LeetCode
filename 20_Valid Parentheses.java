class Solution {
    public boolean isValid(String s) {
        Stack myStack = new Stack();
        int l = s.length();
        
        for (int i = 0; i < l; i++) {
            
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } 
            
            if (c == ')' || c == ']' | c == '}') {
                try {
                    char prev = (char) myStack.peek();
                    if (match(prev,c)) {
                        myStack.pop();

                    } else {
                        return false;
                    }
                } catch (Exception e ){
                    return false;
                }
            }   
        }
        if (myStack.size() != 0) return false;
        return true;
        
        
    }
    
    public boolean match(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '[' && c2 == ']') return true;
        if (c1 == '{' && c2 == '}') return true;
        return false;
    }

    
}
