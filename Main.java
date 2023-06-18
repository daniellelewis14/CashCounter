import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    //Create denominations from Currency class
    Currency pennies = new Currency(0.01);
    Currency nickels = new Currency(0.05);
    Currency dimes = new Currency(0.10);
    Currency quarters = new Currency(0.25);
    Currency ones = new Currency(1.0);
    Currency fives = new Currency(5.0);
    Currency tens = new Currency(10.0);
    Currency twenties = new Currency(20.0);
    Currency fifties = new Currency(50.0);
    Currency hundreds = new Currency(100.0);

    System.out.println("Let's set up our drawer.");
    System.out.print("How many pennies?: ");
    pennies.add(scanner.nextInt());
    System.out.print("How many nickels?: ");
    nickels.add(scanner.nextInt());
    System.out.print("How many dimes?: ");
    dimes.add(scanner.nextInt());
    System.out.print("How many quarters?: ");
    quarters.add(scanner.nextInt());
    System.out.print("How many One dollar bills?: ");
    ones.add(scanner.nextInt());
    System.out.print("How many Five dollar bills?: ");
    fives.add(scanner.nextInt());
    System.out.print("How many Ten dollar bills?: ");
    tens.add(scanner.nextInt());
    System.out.print("How many Twenty dollar bills?: ");
    twenties.add(scanner.nextInt());
    System.out.print("How many Fifty dollar bills?: ");
    fifties.add(scanner.nextInt());
    System.out.print("How many Hundred dollar bills?: ");
    hundreds.add(scanner.nextInt());

    Drawer drawer = new Drawer(pennies, nickels, dimes, quarters, ones, fives, tens, twenties, fifties, hundreds);

    drawer.deposit(drawer.drawerTotal());

    
  }

}