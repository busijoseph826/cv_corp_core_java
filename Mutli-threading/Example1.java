/* create a java application where we need to create three threads and display the default names and priority values then provide user defined names and priority values and display the updated priority values and names */

public class ThreadExample1 {
    public static void main(String[] args) {
    
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

     
        System.out.println("Default Thread Details:");
        System.out.println("Thread 1: " + t1.getName() + " | Priority: " + t1.getPriority());
        System.out.println("Thread 2: " + t2.getName() + " | Priority: " + t2.getPriority());
        System.out.println("Thread 3: " + t3.getName() + " | Priority: " + t3.getPriority());

       
        t1.setName("CustomThread-1");
        t1.setPriority(Thread.MAX_PRIORITY);

        t2.setName("CustomThread-2");
        t2.setPriority(5);

        t3.setName("CustomThread-3");
        t3.setPriority(3);

       
        System.out.println("\nUpdated Thread Details:");
        System.out.println("Thread 1: " + t1.getName() + " | Priority: " + t1.getPriority());
        System.out.println("Thread 2: " + t2.getName() + " | Priority: " + t2.getPriority());
        System.out.println("Thread 3: " + t3.getName() + " | Priority: " + t3.getPriority());
    }
}