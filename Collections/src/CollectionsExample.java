import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Producer
 */
public class CollectionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	List<Integer> list1 = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
    	System.out.println("position de 21 es : " +Collections.binarySearch(list1, 55));
    	
    	
    
        
    }
    
}
