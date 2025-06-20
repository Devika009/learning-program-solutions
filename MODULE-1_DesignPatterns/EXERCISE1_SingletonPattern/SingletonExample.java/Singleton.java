// Singleton.java
public class Singleton {
    // Static variable to hold the one and only instance
    private static Singleton instance;

    // Private constructor prevents external instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to provide global access point
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
