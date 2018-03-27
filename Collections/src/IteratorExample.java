import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Producer
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Collection<String> collection = Arrays.asList("red","orange","blue","green","indigo","violet","yellow");
    	
    	Iterator<String> iterator = collection.iterator();
    	
    	while(iterator.hasNext())
    	{
    		System.out.println(iterator.next());
    		
    	}
    	
    	//System.out.println(collection);
        
    }

}
