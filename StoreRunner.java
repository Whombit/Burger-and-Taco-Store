//Imports the Scanner class from Java.utils
import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {

        //Instantiates a Scanner object "input"
        Scanner input = new Scanner(System.in);
        //Instantiates a Burger object "doubleDeluxe"
        Burger doubleDeluxe = new Burger();
        //Instantiates a Taco object "carnitas"
        Taco carnitas = new Taco();

        //Tries to read the user's input
        try {

            //Uses the user's input to create the values for the variables in the burger and taco objects
            // Uses mutators to set the values for the variables in the burger and taco objects'
            System.out.println("Patties: ");
            int newPatties = input.nextInt();
            doubleDeluxe.setPatties(newPatties);
            System.out.println("Price: ");
            double newPrice = input.nextDouble();
            System.out.println("Hard shell true/false: ");
            boolean newIsHardShell = input.nextBoolean();
            System.out.println("Is it a meal: ");
            boolean newMeal = input.nextBoolean();

            doubleDeluxe.setPatties(newPatties);
            doubleDeluxe.setPrice(newPrice);
            doubleDeluxe.setMeal(newMeal);
            carnitas.setPrice(newPrice);
            carnitas.setIsHardShell(newIsHardShell);
            carnitas.setMeal(newMeal);

        }

        //Catches any exceptions thrown by the user's input in the try block
        catch(Exception e){
            System.out.println("Something went wrong, retry.");
        }

        //Prints the values of the burger and taco objects
        System.out.println("Double Deluxe \n" + doubleDeluxe + "\n");
        System.out.println("Carnitas \n" + carnitas + "\n");

        //Prints a message to the user and closes the scanner
        System.out.println("Enjoy!");
        input.close();
    }
}