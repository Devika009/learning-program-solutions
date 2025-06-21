import java.util.*;

public class EcommerceSearch {
    private static List<String> products = Arrays.asList(
        "Laptop", "Smartphone", "Shoes", "Watch", "Backpack", "Headphones", "Camera", "Book", "Tablet", "Charger"
    );

    public static List<String> searchProduct(String query) {
        List<String> results = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(query.toLowerCase())) {
                results.add(product);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product to search: ");
        String query = scanner.nextLine();

        List<String> results = searchProduct(query);

        if (results.isEmpty()) {
            System.out.println("No products found matching: " + query);
        } else {
            System.out.println("Search results:");
            for (String product : results) {
                System.out.println("- " + product);
            }
        }
    }
}
