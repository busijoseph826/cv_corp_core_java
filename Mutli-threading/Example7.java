
/* Create a java application where we need to create 3 custom defined threads by using first thread we need to display 10-1 numbers by using 2nd thread display 11-20 numbers by using 3rd thread display 21-30 numbers */

// Note: After display 10-1 we need to start display 11-20
// After display 15 we need to display 21 to 30 numbers

class T1 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            if (i == 15) {
                t2.suspend();
            }
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(i);
        }
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

      
        t1.start();
        t1.join();

    
        t2.start();

 
        Thread.sleep(500);

     
        t3.start();
        t3.join();

  
        t2.resume();
        t2.join();
    }
}
/*class T1 extends Thread {
    public void run() {
        int n = 10;
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}

class T2 extends Thread {
    public void run() {
        int n = 11;
        while (n < 21) {
            System.out.println(n);
            // After printing 15, start T3
            if (n == 15) {
                T3 t3 = new T3();
                t3.start();
                try {
                    t3.join(); // Wait for T3 to complete
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            n++;
        }
    }
}

class T3 extends Thread {
    public void run() {
        int n = 21;
        while (n < 31) {
            System.out.println(n);
            n++;
        }
    }
}
class Test {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t1.join(); // Wait for T1 to complete

        t2.start();
        t2.join(); // Wait for T2 to complete
    }
}*/
