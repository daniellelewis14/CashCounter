import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    Safe safe = new Safe();
    
    //Create denominations from Currency class
    //Add count totals for each denomination using .add() method from Currency class
    System.out.println("Let's set up drawer 1.");
    System.out.print("How many pennies?: ");
    Currency pos1Pennies = new Currency(0.01, scanner.nextInt());
    System.out.print("How many nickels?: ");
    Currency pos1Nickels = new Currency(0.05, scanner.nextInt());
    System.out.print("How many dimes?: ");
    Currency pos1Dimes = new Currency(0.10, scanner.nextInt());
    System.out.print("How many quarters?: ");
    Currency pos1Quarters = new Currency(0.25, scanner.nextInt());
    System.out.print("How many One dollar bills?: ");
    Currency pos1Ones = new Currency(1.0, scanner.nextInt());
    System.out.print("How many Five dollar bills?: ");
    Currency pos1Fives = new Currency(5.0, scanner.nextInt());
    System.out.print("How many Ten dollar bills?: ");
    Currency pos1Tens = new Currency(10.0, scanner.nextInt());
    System.out.print("How many Twenty dollar bills?: ");
    Currency pos1Twenties = new Currency(20.0, scanner.nextInt());
    System.out.print("How many Fifty dollar bills?: ");
    Currency pos1Fifties = new Currency(50.0, scanner.nextInt());
    System.out.print("How many Hundred dollar bills?: ");
    Currency pos1Hundreds = new Currency(100.0, scanner.nextInt());

  
    //Adds user-eneterd currency to drawer 1
    Drawer drawer1 = new Drawer(pos1Pennies, pos1Nickels, pos1Dimes, pos1Quarters, pos1Ones, pos1Fives, pos1Tens, pos1Twenties, pos1Fifties, pos1Hundreds);

    System.out.println("\nDrawer Total: " + drawer1.drawerTotal());

    System.out.println(drawer1.deposit());

   //Drawer 2
    System.out.println("Let's set up drawer 2.");
    System.out.print("How many pennies?: ");
    Currency pos2Pennies = new Currency(0.01, scanner.nextInt());
    System.out.print("How many nickels?: ");
    Currency pos2Nickels = new Currency(0.05, scanner.nextInt());
    System.out.print("How many dimes?: ");
    Currency pos2Dimes = new Currency(0.10, scanner.nextInt());
    System.out.print("How many quarters?: ");
    Currency pos2Quarters = new Currency(0.25, scanner.nextInt());
    System.out.print("How many One dollar bills?: ");
    Currency pos2Ones = new Currency(1.0, scanner.nextInt());
    System.out.print("How many Five dollar bills?: ");
    Currency pos2Fives = new Currency(5.0, scanner.nextInt());
    System.out.print("How many Ten dollar bills?: ");
    Currency pos2Tens = new Currency(10.0, scanner.nextInt());
    System.out.print("How many Twenty dollar bills?: ");
    Currency pos2Twenties = new Currency(20.0, scanner.nextInt());
    System.out.print("How many Fifty dollar bills?: ");
    Currency pos2Fifties = new Currency(50.0, scanner.nextInt());
    System.out.print("How many Hundred dollar bills?: ");
    Currency pos2Hundreds = new Currency(100.0, scanner.nextInt());

    //Adds user-eneterd currency to drawer 2
    Drawer drawer2 = new Drawer(pos2Pennies, pos2Nickels, pos2Dimes, pos2Quarters, pos2Ones, pos2Fives, pos2Tens, pos2Twenties, pos2Fifties, pos2Hundreds);

    System.out.println("\nDrawer Total: " + drawer2.drawerTotal());

    System.out.println(drawer2.deposit());

    //Drawer 3
    System.out.println("Let's set up drawer 3.");
    System.out.print("How many pennies?: ");
    Currency pos3Pennies = new Currency(0.01, scanner.nextInt());
    System.out.print("How many nickels?: ");
    Currency pos3Nickels = new Currency(0.05, scanner.nextInt());
    System.out.print("How many dimes?: ");
    Currency pos3Dimes = new Currency(0.10, scanner.nextInt());
    System.out.print("How many quarters?: ");
    Currency pos3Quarters = new Currency(0.25, scanner.nextInt());
    System.out.print("How many One dollar bills?: ");
    Currency pos3Ones = new Currency(1.0, scanner.nextInt());
    System.out.print("How many Five dollar bills?: ");
    Currency pos3Fives = new Currency(5.0, scanner.nextInt());
    System.out.print("How many Ten dollar bills?: ");
    Currency pos3Tens = new Currency(10.0, scanner.nextInt());
    System.out.print("How many Twenty dollar bills?: ");
    Currency pos3Twenties = new Currency(20.0, scanner.nextInt());
    System.out.print("How many Fifty dollar bills?: ");
    Currency pos3Fifties = new Currency(50.0, scanner.nextInt());
    System.out.print("How many Hundred dollar bills?: ");
    Currency pos3Hundreds = new Currency(100.0, scanner.nextInt());

    //Adds user-eneterd currency to drawer 3
    Drawer drawer3 = new Drawer(pos3Pennies, pos3Nickels, pos3Dimes, pos3Quarters, pos3Ones, pos3Fives, pos3Tens, pos3Twenties, pos3Fifties, pos3Hundreds);

    System.out.println("\nDrawer Total: " + drawer3.drawerTotal());

    System.out.println(drawer3.deposit());

    //Drawer 4
    System.out.println("Let's set up drawer 4.");
    System.out.print("How many pennies?: ");
    Currency pos4Pennies = new Currency(0.01, scanner.nextInt());
    System.out.print("How many nickels?: ");
    Currency pos4Nickels = new Currency(0.05, scanner.nextInt());
    System.out.print("How many dimes?: ");
    Currency pos4Dimes = new Currency(0.10, scanner.nextInt());
    System.out.print("How many quarters?: ");
    Currency pos4Quarters = new Currency(0.25, scanner.nextInt());
    System.out.print("How many One dollar bills?: ");
    Currency pos4Ones = new Currency(1.0, scanner.nextInt());
    System.out.print("How many Five dollar bills?: ");
    Currency pos4Fives = new Currency(5.0, scanner.nextInt());
    System.out.print("How many Ten dollar bills?: ");
    Currency pos4Tens = new Currency(10.0, scanner.nextInt());
    System.out.print("How many Twenty dollar bills?: ");
    Currency pos4Twenties = new Currency(20.0, scanner.nextInt());
    System.out.print("How many Fifty dollar bills?: ");
    Currency pos4Fifties = new Currency(50.0, scanner.nextInt());
    System.out.print("How many Hundred dollar bills?: ");
    Currency pos4Hundreds = new Currency(100.0, scanner.nextInt());

    //Adds user-eneterd currency to drawer 4
    Drawer drawer4 = new Drawer(pos4Pennies, pos4Nickels, pos4Dimes, pos4Quarters, pos4Ones, pos4Fives, pos4Tens, pos4Twenties, pos4Fifties, pos4Hundreds);

    System.out.println("\nDrawer Total: " + drawer4.drawerTotal());

    System.out.println(drawer4.deposit());
    
  }
}