/*3.Create a Java Application with a Class "JewelleryMart" having 3 chains and 2 rings(variables). Three individual Persons(Three custom defined threads) has to purchase the products (need to create purchase method with two parameters to buy the products). Print the purchase details of every individual and remaining product details at the end.*/

// Class representing the JewelleryMart

class JewelleryMart {
    private int chains = 3; // Number of chains available
    private int rings = 2;  // Number of rings available

    // Synchronized purchase method to handle thread safety

    public synchronized void purchase(String person, int chainCount, int ringCount) {
        System.out.println(person + " is trying to purchase " + chainCount + " chain(s) and " + ringCount + " ring(s).");

        if (chainCount > chains || ringCount > rings) {
            System.out.println("Insufficient stock for " + person + ". Purchase failed.");
            return;
        }

        // Deducting the purchased products from stock

        chains -= chainCount;
        rings -= ringCount;

        System.out.println(person + " purchased " + chainCount + " chain(s) and " + ringCount + " ring(s).");
    }

    // Method to display the remaining stock

    public void displayStock() {
        System.out.println("\nRemaining Stock:");
        System.out.println("Chains: " + chains);
        System.out.println("Rings: " + rings);
    }
}

// Class representing a person purchasing jewelry

class Person extends Thread {
    private JewelleryMart mart;
    private String name;
    private int chainCount;
    private int ringCount;

    public Person(JewelleryMart mart, String name, int chainCount, int ringCount) {
        this.mart = mart;
        this.name = name;
        this.chainCount = chainCount;
        this.ringCount = ringCount;
    }

    
    public void run() {
        mart.purchase(name, chainCount, ringCount);
    }
}

// Main class

class JewelleryStore {
    public static void main(String[] args) {
        JewelleryMart mart = new JewelleryMart();

        // Creating three persons as separate threads

        Person person1 = new Person(mart, "Person 1", 1, 1); // Wants 1 chain, 1 ring
        Person person2 = new Person(mart, "Person 2", 2, 1); // Wants 2 chains, 1 ring
        Person person3 = new Person(mart, "Person 3", 1, 1); // Wants 1 chain, 1 ring

        // Starting the threads

        person1.start();
        person2.start();
        person3.start();

        // Wait for all threads to complete

        try {
            person1.join();
            person2.join();
            person3.join();
        } catch (InterruptedException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Display remaining stock

        mart.displayStock();
    }
}
