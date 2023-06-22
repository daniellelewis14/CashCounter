import java.util.ArrayList;
import java.math.BigDecimal;

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
  public BigDecimal drawerTotal() {
    ArrayList<BigDecimal> bdList = new ArrayList<>();
    bdList.add(pennies.totalValue());
    bdList.add(nickels.totalValue());
    bdList.add(dimes.totalValue());
    bdList.add(quarters.totalValue());
    bdList.add(ones.totalValue());
    bdList.add(fives.totalValue());
    bdList.add(tens.totalValue());
    bdList.add(twenties.totalValue());
    bdList.add(fifties.totalValue());
    bdList.add(hundreds.totalValue());
    BigDecimal bdTotal = BigDecimal.ZERO;
    for (BigDecimal value: bdList) {
      if (value != null) {
        bdTotal = bdTotal.add(value);
      }
    }
    return bdTotal;
  }

  //Making deposits and printing the results of the deposit 

  public String deposit() {
    double drawerTotal = drawerTotal().doubleValue();

    //Create variables to hold the number of each currency deposited
    Currency hundredsDeposited = new Currency(100.0, 0);
    Currency fiftiesDeposited = new Currency(50.0, 0);
    Currency twentiesDeposited = new Currency(20.0, 0);
    Currency tensDeposited = new Currency(10.0, 0);
    Currency fivesDeposited = new Currency(5.0, 0);
    Currency onesDeposited = new Currency(1.0, 0);
    Currency quartersDeposited = new Currency(0.25, 0);
    Currency dimesDeposited = new Currency(0.10, 0);
    Currency nickelsDeposited = new Currency(0.05, 0);
    Currency penniesDeposited = new Currency(0.01, 0);
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
        hundredsDeposited.count++;
        drawerTotal -= 100;
      } 

      while (fifties.count >= 1 && drawerTotal >= 450.0) {
        fifties.count -=1;
        drawerTotal -= 50;
        fiftiesDeposited.count++;
      } 

      while (twenties.count > 0 && drawerTotal >= 420.0) {
        twenties.count -= 1;
        drawerTotal -= 20;
        twentiesDeposited.count++;
      } 

      while (tens.count >= 1 && drawerTotal >= 410.0) {
        tens.count -= 1;
        drawerTotal -= 10;
        tensDeposited.count++;
      } 

      while (fives.count >= 1 && drawerTotal >= 405.0) {
        fives.count -= 1;
        drawerTotal -= 5;
        fivesDeposited.count++;
      } 

      while (ones.count >= 1 && drawerTotal >= 401) {
        ones.count -= 1;
        drawerTotal -= 1;
        onesDeposited.count++;
      } 

      while (quarters.count >= 1 && drawerTotal >= 400.25) {
        quarters.count -= 1;
        drawerTotal -= 0.25;
        quartersDeposited.count++;
      } 

      while (dimes.count >= 1 && drawerTotal >= 400.10) {
        dimes.count -= 1;
        drawerTotal -= 0.10;
        dimesDeposited.count++;
      } 

      while (nickels.count >= 1 && drawerTotal >= 400.05) {
        nickels.count -= 1;
        drawerTotal -= 0.05;
        nickelsDeposited.count++;
      } 

      while (pennies.count >= 1 && drawerTotal >= 400.01) {
        pennies.count -= 1;
        drawerTotal -= 0.01;
        penniesDeposited.count++;
      }
      
      //safe.addToSafe(penniesDeposited, nickelsDeposited, dimesDeposited, quartersDeposited, onesDeposited, fivesDeposited, tensDeposited, twentiesDeposited, fiftiesDeposited, hundredsDeposited);
      
      break;
      
    } 

    //Returns the number of each denomination deposited
    String depositSummary = "\nPennies: " + penniesDeposited.count + "\n" + "Nickels: " + nickelsDeposited.count + "\n" + "Dimes: " + dimesDeposited.count + "\n" + "Quarters: " + quartersDeposited.count + "\n" + "Dollars: " + onesDeposited.count + "\n" + "Fives: " + fivesDeposited.count + "\n" + "Tens: " + tensDeposited.count + "\n" + "Twenties: " + twentiesDeposited.count + "\n" + "Fifties: " + fiftiesDeposited.count + "\n" + "Hundreds: " + hundredsDeposited.count + "\n";

    //Returns the value of the total deposit
    double totalDeposit = (hundredsDeposited.count * 100) + (fiftiesDeposited.count * 50) + (twentiesDeposited.count * 20) + (tensDeposited.count * 10) + (fivesDeposited.count * 5) + (onesDeposited.count * 1) + (quartersDeposited.count * 0.25) + (dimesDeposited.count * 0.10) + (nickelsDeposited.count * 0.05) + (penniesDeposited.count * 0.01);
    BigDecimal bdTotalDeposit = BigDecimal.valueOf(totalDeposit);

    //Returns the number of each denomination remaining in the drawer after the deposit
    String remainingInDrawer = "\nPennies: " + (originalPennies - penniesDeposited.count) + "\n" + "Nickels: " + 
(originalNickels - nickelsDeposited.count) + "\n" + "Dimes: " + (originalDimes - dimesDeposited.count) + "\n" + "Quarters: " + (originalQuarters - quartersDeposited.count) + "\n" + "Dollars: " +(originalOnes - onesDeposited.count) + "\n" + "Fives: " + (originalFives - fivesDeposited.count) + "\n" + "Tens: " + (originalTens - tensDeposited.count) + "\n" + "Twenties: " + (originalTwenties - twentiesDeposited.count) + "\n" + "Fifties: " + (originalFifties - fiftiesDeposited.count) + "\n" + "Hundreds: " + (originalHundreds - hundredsDeposited.count) + "\n";

    //Return statement formatted to give the final results of the deposit
    return "\nDeposit Summary: \n" + depositSummary + "\nTotal Deposit: " + bdTotalDeposit + "\n" + "\nRemaining in drawer:\n" + remainingInDrawer;

  }

}