/* 1. Create a Java Application where we need to create a LinkedList Object by using 
Integer as its Generic type, add 5 elements to the LinkedList, remove the 
element at the second index of the list, add a new element at the second index 
of the list, replace the third index element with a new element and print the 
LinkedList by using ListIterator in both forward and backward directions.  */
/*
import java.util.*;

public class Sample{
	public static void main(String args[]){
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		System.out.println(lst);
		lst.remove(1);
		System.out.println(lst);
		lst.add(1,7);
		System.out.println(lst);
		lst.set(2,9);
		System.out.println(lst);
		ListIterator<Integer> it = lst.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
*/

/* 2. Create a Java Application where we need to create a LinkedList Object by using 
Integer as its Generic type, add a few elements to it, remove the middle element, 
and print the LinkedList. */

/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		System.out.println("Original list "+lst);
		int mid = lst.size()/2;
		lst.remove(mid);
		System.out.println("Updated list "+lst);
	}
}
*/

/*3. Create a Java Application where we need to create a LinkedList Object by using 
Integer as its Generic type, add a few elements to it, remove the first and last 
element of the LinkedList, and print the LinkedList.  */
/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		
		System.out.println("Original list "+lst);
		lst.removeFirst();
		System.out.println("list after removing first elememt "+lst);
		lst.removeLast();
		System.out.println("list after removeing last element "+lst);
	}
}
*/

/*4. Create a Java Application where we need to create a LinkedList Object by using 
Integer as its Generic type, add a few elements to it, and sort the elements 
without using the sort method. */
/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(12);
		lst.add(2);
		lst.add(87);
		lst.add(67);
		System.out.println("Before sorting "+lst);
		sorting(lst);
		System.out.println("After sorting "+lst);
	}
	public static void sorting(LinkedList<Integer> lst){
		int n = lst.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (lst.get(j) > lst.get(j + 1)) {
                    // swap
                    int temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);
                }
            }
        }
	}
}
*/