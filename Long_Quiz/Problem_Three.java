package Long_Quiz;
//CELINO, ELIAH JOSEPH
// 2-BSIT-A

import java.util.Stack;

public class Problem_Three {
    public static void main (String[] args){
    
        Stack<Integer> stack = new Stack<>();   
        
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(6);
        
        for(int s : stack){
            System.out.println(s);
        }
        
        stack.pop();
        stack.pop();
        
        for(int s : stack){
            System.out.println(s);
        }
                
    }    
}
