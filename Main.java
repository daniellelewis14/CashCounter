import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    //Create denominations from Currency class
    //Add count totals for each denomination using .add() method from Currency class
    System.out.println("Let's set up our drawer.");
    System.out.print("How many pennies?: ");
    Currency pennies = new Currency(0.01, scanner.nextInt());
    System.out.print("How many nickels?: ");
    Currency nickels = new Currency(0.05, scanner.nextInt());
    System.out.print("How many dimes?: ");
    Currency dimes = new Currency(0.10, scanner.nextInt());
    System.out.print("How many quarters?: ");
    Currency quarters = new Currency(0.25, scanner.nextInt());
    System.out.print("How many One dollar bills?: ");
    Currency ones = new Currency(1.0, scanner.nextInt());
    System.out.print("How many Five dollar bills?: ");
    Currency fives = new Currency(5.0, scanner.nextInt());
    System.out.print("How many Ten dollar bills?: ");
    Currency tens = new Currency(10.0, scanner.nextInt());
    System.out.print("How many Twenty dollar bills?: ");
    Currency twenties = new Currency(20.0, scanner.nextInt());
    System.out.print("How many Fifty dollar bills?: ");
    Currency fifties = new Currency(50.0, scanner.nextInt());
    System.out.print("How many Hundred dollar bills?: ");
    Currency hundreds = new Currency(100.0, scanner.nextInt());
    
    Drawer drawer = new Drawer(pennies, nickels, dimes, quarters, ones, fives, tens, twenties, fifties, hundreds);

    System.out.println("Ones in drawer: " + drawer.howManyInDrawer(ones));

    System.out.println("Drawer Total: " + drawer.drawerTotal());

    drawer.deposit();

    
  }
}