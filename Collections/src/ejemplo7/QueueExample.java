/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo7;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Producer
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Queue<Integer> queue = new LinkedList<>();
    	for (int i = 1; i <=10 ; i++) {
    		
			queue.add(i);
		}
    	
    	System.out.println("elementos dentro queue: "+queue);
    	int removed= queue.remove();
    	System.out.println("queue removido: "+removed);
    	System.out.println(queue);
    	int top = queue.peek();
    	System.out.println("top element is: "+top);
    	System.out.println(queue);
    	int topp = queue.poll();
    	System.out.println("el valor elimando del top es: "+topp);
    	
    	System.out.println(queue);
    	
        
    }

}
