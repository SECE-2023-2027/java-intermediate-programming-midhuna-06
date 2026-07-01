import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter product details (id, name, price, stock quantity):");
        int id = scn.nextInt();

        String productName = scn.next();

        double price = scn.nextDouble();

        int stockQuantity = scn.nextInt();

        Product obj = new Product(String.valueOf(id), productName, price, stockQuantity);

        obj.applyDiscount(10);

        System.out.println(obj.getPrice());
        System.out.println(obj.getStockQuantity());
    }
}