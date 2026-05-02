/* import java.util.ArrayList;

public class Sample{
	public static void main(String[]args){
		//Array List Creation
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		
	}
}
*/

/* 1. Create a Java Application where we need to create an ArrayList Object and 
perform the following operations  
	1. Add five elements to the ArrayList Object  
	2. Print the ArrayList  
	3. Remove the element from the second index  
	4. Add a new element in the second index  
	5. Replace the third index with a new element.  
	6. Print the ArrayList by using Iterator.  */
/*
import java.util.*;	
public class Sample{
	public static void main(String[]args){
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		System.out.println(lst);
		lst.remove(1);
		System.out.println(lst);
		lst.add(1,8);
		System.out.println(lst);
		lst.set(2,9);
		System.out.println(lst);
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
*/

/* 2.Create a Java Application where we need to create an ArrayList Object by using 
Integer as its Generic type. Add a few elements to it and print the list in forward 
and backward directions by using ListIterator. */
/*
import java.util.*;
public class Sample{
	public static void main(String[]args){
		ArrayList<Integer> lst = new ArrayList<>();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		ListIterator<Integer> it = lst.listIterator();
		//forward iteration
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//backward iteration
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}
}
*/

/* 3.Create a Java Application where we need to create an ArrayList Object by using 
Integer as its Generic type, add 100 elements to it, and print all the elements 
alternatively by using Iterator.  */

/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		ArrayList<Integer>lst = new ArrayList<>();
		int  i = 1;
		while(i<=100){
			lst.add(i);
			i++;
		}
		ListIterator<Integer> it = lst.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+ ", ");
			if(it.hasNext()){
				it.next();
			}
		}
	}
}
*/

/* 4.Create a Java Application where we need to create two ArrayList Objects by 
using Integer as its Generic type, add multiples of 2 to the first ArrayList and 
multiples of 3 to the second ArrayList. Display the values of ArrayList2 which 
are present in ArrayList1. */
/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		ArrayList<Integer>lst = new ArrayList<>();
		ArrayList<Integer>lst1 = new ArrayList<>();
		
		for(int i=0;i<=100;i++){
			if(i%2==0){
				lst.add(i);
			}
		}
		
		for(int i=0;i<=100;i++){
			if(i%3==0){
				lst1.add(i);
			}
		}
		for(Integer i: lst){
			if(lst1.contains(i)){
				System.out.println(i+" ");
			}
		}
	}
}
*/

/* 5.Create a Java Application where we need to create an ArrayList Object by using 
Integer as its Generic type, add a few elements to it, and print all the elements 
using the ForEach loop.  */

/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=0;i<100;i+=5){
			lst.add(i);
		}
		for(Integer i: lst){
			System.out.println(i+" ");
		}
	}
}
*/

/* 6. Create a Java Application where we need to create an ArrayList Object by using 
Integer as its Generic type, Add a few elements to it, then print all the values in 
ascending order.  */

/*
import java.util.*;

public class Sample{
	public static void main(String[]args){
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(1);
		lst.add(89);
		lst.add(65);
		lst.add(54);
		//acending order
		Collections.sort(lst);
		for(Integer i: lst){
			System.out.println(i+ " ");
		}
		// descending order
		Collections.sort(lst,Collections.reverseOrder());
		for(Integer i: lst){
			System.out.println(i+ " ");
		}
	}
}
*/

/* 7.Create a Java Application where we have one class Student, it contains private 
fields like student ID, student Name, and student Marks without initialization. 
Initialize these private fields by using both setter Injection and Constructor 
injection. Add the data of 5 students and then create an ArrayList object by using 
the Student class as its Generic type. Add the data of all students to this 
ArrayList and then display all of them.  */

/*
import java.util.*;

class Student{
	private int id;
	private String name;
	private int marks;
	
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void setId(int id){
		this.id  = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMarks(int marks){
		this.marks = marks;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
}

public class Sample{
	public static void main(String[]args){
		ArrayList<Student> lst = new ArrayList<>();
		lst.add(new Student(1,"Joseph",86));
		lst.add(new Student(2,"Busi",86));
		lst.add(new Student(3,"Sam",87));
		lst.add(new Student(4,"Paul",85));
		for(Student std : lst){
			System.out.println(std.getId()+" "+ std.getName()+" "+std.getMarks());
		}
	}
}
*/