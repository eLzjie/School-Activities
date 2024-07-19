package Long_Quiz;
//CELINO, ELIAH JOSEPH
// 2-BSIT-A

import java.util.Queue; 
import java.util.LinkedList; 

public class Problem_Two {
    public static void main (String[] args){
    
        Queue<Integer> queue = new LinkedList<>();     
        
        queue.offer(4);
        queue.offer(2);
        queue.offer(3);
        queue.offer(1);
        queue.offer(7);
                
        for(int q : queue){
            System.out.println(q);
        }
        
        queue.poll();
        queue.poll();
        
        for(int q : queue){
            System.out.println(q);
        }  
    }    
}
