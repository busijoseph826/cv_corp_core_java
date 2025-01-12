/*Create  a java application where we need to display 1-10 numbers by using custom defined  thread with an time interval of 3 seconds */

class T extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(3000); // Sleep for 3 seconds (3000 milliseconds)
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Example6 {
    public static void main(String[] args) {
        T t = new T();
        t.start();
    }
}
