/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Producer
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	//String[] grocery1= {"manzana","peras","platano","uvas","arina","leche","galletas"};
    	//String[] grocery2= {"huevos","azucar","sal","vinos","cervezas","papel bano"};
    	
    	ArrayList<String> groceries1 = new ArrayList<>(Arrays.asList("manzana","peras","platano","uvas","arina","leche","galletas"));
    	ArrayList<String>groceries2 = new ArrayList<>(Arrays.asList("huevos","azucar","sal","vinos","cervezas","papel de bano"));
    	
    	System.out.println(groceries1);
    	groceries1.add("jamon");
    	System.out.println(groceries1);
    	groceries1.remove(2);
    	System.out.println(groceries1);
    	groceries1.addAll(groceries2);
    	System.out.println(groceries1);
    	
    	 if(groceries1.contains("manzana"))
             groceries1.remove("manzana");
         System.out.println(groceries1);
    	
    	
    	
    	
    	

    }
    
}
