import java.util.ArrayList;

public class Drawer {
  public Currency pennies;
  public Currency nickels;
  public Currency dimes;
  public Currency quarters;
  public Currency ones;
  public Currency fives;
  public Currency tens;
  public Currency twenties;
  public Currency fifties;
  public Currency hundreds;

  //Contructor adds currency objects to drawer
  //Inherets count and value of original objects
  public Drawer(Currency pennies, Currency nickels, Currency dimes, Currency quarters, Currency ones, Currency fives, Currency tens, Currency twenties, Currency fifties, Currency hundreds) {
    this.pennies = pennies;
    this.nickels = nickels;
    this.dimes = dimes;
    this.quarters = quarters;
    this.ones = ones;
    this.fives = fives;
    this.tens = tens;
    this.twenties = twenties;
    this.fifties = fifties;
    this.hundreds = hundreds;
  }

  //Returns the total value of the drawer contents
  public double drawerTotal() {
    return pennies.totalValue() + nickels.totalValue() + dimes.totalValue() + quarters.totalValue() + ones.totalValue() + fives.totalValue() + tens.totalValue() + twenties.totalValue() + fifties.totalValue() + hundreds.totalValue();
  }

  //Making deposits and printing the results of the deposit 

  public String deposit() {
    double drawerTotal = this.drawerTotal();

    //Create variables to hold the number of each currency deposited
    int hundredsDeposited = 0;
    int fiftiesDeposited = 0;
    int twentiesDeposited = 0;
    int tensDeposited = 0;
    int fivesDeposited = 0;
    int onesDeposited = 0;
    int quartersDeposited = 0;
    int dimesDeposited = 0;
    int nickelsDeposited = 0;
    int penniesDeposited = 0;
    int originalPennies = pennies.count;
    int originalNickels = nickels.count;
    int originalDimes = dimes.count;
    int originalQuarters = quarters.count;
    int originalOnes = ones.count;
    int originalFives = fives.count;
    int originalTens = tens.count;
    int originalTwenties = twenties.count;
    int originalFifties = fifties.count;
    int originalHundreds = hundreds.count;


    while (drawerTotal > 400.0) {

      if (drawerTotal == 400.0) {
        return "No deposit to be made";
      }

      while (hundreds.count >= 1 && drawerTotal >= 500.0) {
        hundreds.count -= 1;
        hundredsDeposited++;
        drawerTotal -= 100;
      } 

      while (fifties.count >= 1 && drawerTotal >= 450.0) {
        fifties.count -=1;
        drawerTotal -= 50;
        fiftiesDeposited++;
      } 

      while (twenties.count > 0 && drawerTotal >= 420.0) {
        twenties.count -= 1;
        drawerTotal -= 20;
        twentiesDeposited++;
      } 

      while (tens.count >= 1 && drawerTotal >= 410.0) {
        tens.count -= 1;
        drawerTotal -= 10;
        tensDeposited++;
      } 

      while (fives.count >= 1 && drawerTotal >= 405.0) {
        fives.count -= 1;
        drawerTotal -= 5;
        fivesDeposited++;
      } 

      while (ones.count >= 1 && drawerTotal >= 401) {
        ones.count -= 1;
        drawerTotal -= 1;
        onesDeposited++;
      } 

      while (quarters.count >= 1 && drawerTotal >= 400.25) {
        quarters.count -= 1;
        drawerTotal -= 0.25;
        quartersDeposited++;
      } 

      while (dimes.count >= 1 && drawerTotal >= 400.10) {
        dimes.count -= 1;
        drawerTotal -= 0.10;
        dimesDeposited++;
      } 

      while (nickels.count >= 1 && drawerTotal >= 400.05) {
        nickels.count -= 1;
        drawerTotal -= 0.05;
        nickelsDeposited++;
      } 

      while (pennies.count >= 1 && drawerTotal >= 400.01) {
        pennies.count -= 1;
        drawerTotal -= 0.01;
        penniesDeposited++;
      }
      
      break;
    } 

    //Returns the number of each denomination deposited
    String depositSummary = "\nPennies: " + penniesDeposited + "\n" + "Nickels: " + nickelsDeposited + "\n" + "Dimes: " + dimesDeposited + "\n" + "Quarters: " + quartersDeposited + "\n" + "Dollars: " + onesDeposited + "\n" + "Fives: " + fivesDeposited + "\n" + "Tens: " + tensDeposited + "\n" + "Twenties: " + twentiesDeposited + "\n" + "Fifties: " + fiftiesDeposited + "\n" + "Hundreds: " + hundredsDeposited + "\n";

    //Returns the value of the total deposit
    double totalDeposit = (hundredsDeposited * 100) + (fiftiesDeposited * 50) + (twentiesDeposited * 20) + (tensDeposited * 10) + (fivesDeposited * 5) + (onesDeposited * 1) + (quartersDeposited * 0.25) + (dimesDeposited * 0.10) + (nickelsDeposited * 0.05) + (penniesDeposited * 0.01);

    //Returns the number of each denomination remaining in the drawer after the deposit
    String remainingInDrawer = "\nPennies: " + (originalPennies - penniesDeposited) + "\n" + "Nickels: " + 
(originalNickels - nickelsDeposited) + "\n" + "Dimes: " + (originalDimes - dimesDeposited) + "\n" + "Quarters: " + (originalQuarters - quartersDeposited) + "\n" + "Dollars: " +(originalOnes - onesDeposited) + "\n" + "Fives: " + (originalFives - fivesDeposited) + "\n" + "Tens: " + (originalTens - tensDeposited) + "\n" + "Twenties: " + (originalTwenties - twentiesDeposited) + "\n" + "Fifties: " + (originalFifties - fiftiesDeposited) + "\n" + "Hundreds: " + (originalHundreds - hundredsDeposited) + "\n";

    //Return statement formatted to give the final results of the deposit
    return "\nDeposit Summary: \n" + depositSummary + "\nTotal Deposit: " + totalDeposit + "\n" + "\nRemaining in drawer:\n" + remainingInDrawer;

  }

}