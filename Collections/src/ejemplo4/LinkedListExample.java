package ejemplo4;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Producer
 */

public class LinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	LinkedList<String> states = new LinkedList<String>();
    	states.add("Alaska");
    	states.add("Arizona");
    	states.add("Arkansas");
    	states.add("Califronia");
    	states.add("New York");
    	states.add("Washington");
    	
    	states.addFirst("Kansas");
    	System.out.println(states);
    	System.out.println("imprime el ultimo estado: "+states.getLast());
    	
    	ListIterator iterator = states.listIterator(states.size());
    	while(iterator.hasPrevious())
    	{
    		
    		System.out.println(iterator.previous());
    	}
    	
    	
     
       
    }
  
  
}


