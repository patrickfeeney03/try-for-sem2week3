package ie.atu.week3;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Product and Animal Viewer\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            System.out.println("Enter code for animal or product: ");
            String code = sc.nextLine();

            Product p = Database.getProduct(code);
            Animal a = Database.getAnimal(code);

            System.out.println(p);
            System.out.println(a);

            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();


        }

    }
}
