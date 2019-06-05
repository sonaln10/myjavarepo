package collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * Java program to demonstrate What is CopyOnWriteArrayList in Java,
 * Iterator of CopyOnWriteArrayList
 * doesn’t support add, remove or any modification operation.
 *
 * @author sonal.nikhade10@gmail.com
 */
public class CopyOnWriteArrayListExample{

    public static void main(String args[]) {
      
//        ArrayList<String> threadSafeList = new ArrayList<String>();
    	CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");
      
        //add, remove operator is not supported by CopyOnWriteArrayList iterator
       Iterator<String> failSafeIterator = threadSafeList.iterator();
        while(failSafeIterator.hasNext()){
       	  System.out.println("Before: "+threadSafeList);
      //  	threadSafeList.add("JEE");
        
        //	System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
       //	failSafeIterator.remove();
           if(failSafeIterator.next().equals("J2EE"))
           	threadSafeList.add("Sonal");
//        	  threadSafeList.remove("J2EE");
        
           System.out.println("After: "+threadSafeList);
           //  failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
        }
    }
}


