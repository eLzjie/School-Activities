package Long_Quiz;
//CELINO, ELIAH JOSEPH
// 2-BSIT-A

import java.util.*;

public class Problem_Four {
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
    
        Stack<String> stack = new Stack<>();   
        Queue<String> queue = new LinkedList<>();  
        
        int operation = 0;
        String queue_temp = "";
        String remover = "";
        String stack_temp = "";
        
        while(operation != 7){
            printMenu();
            operation = in.nextInt();
            in.nextLine();
            
            switch (operation){
                case 1:
                    System.out.println("Enter String Value: ");
                    queue_temp = in.nextLine();
                    queue.offer(queue_temp);
                    System.out.println("String Added!");
                    break;

                case 2:
                    System.out.println("Queue Values: \n");
                    for(String q : queue){
                        System.out.println(q);
                    }
                    break;

                case 3:
                    remover = queue.poll();
                    stack.push(remover);
                    System.out.println("String Replaced!");
                    break;

                case 4: 
                    System.out.println("Stack Values: \n");
                    for(String s : stack){
                        System.out.println(s);
                    }
                    break;

                case 5:
                    stack.pop();
                    System.out.println("Stack Popped!");
                    break;
                    
                case 6:
                    System.out.println("Stack Contents: \n");
                    for(String s : stack){
                        System.out.println(s);
                    }
                    break;
                    
                case 7:
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid Input");

            }
        }
        
                
    }  
    
    private static void printMenu() {
        System.out.println("\n\n[1] Insert in Queue");
        System.out.println("[2] Display Queue Values");
        System.out.println("[3] Remove and Place");
        System.out.println("[4] Display Stack Values");
        System.out.println("[5] Remove from Stack");
        System.out.println("[6] Display Stack Contents");
        System.out.print("\nSelect Operation: ");
    }
    
    
}
