package Long_Quiz;
//CELINO, ELIAH JOSEPH
// 2-BSIT-A

import java.util.ArrayList; 

public class Problem_One {
    public static void main (String[] args){
    
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        
        for (int num : numbers){
            System.out.println(num);
        }
        
        numbers.remove(2);
        numbers.add(0, 10);
        
        for (int num : numbers){
            System.out.println(num);
        }  
    } 
}
