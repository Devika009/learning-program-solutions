// Main.java
public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Use the Singleton object
        obj1.showMessage();

        // Confirm both references point to the same object
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}
