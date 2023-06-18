import java.util.ArrayList;

public class Drawer {
  private Currency pennies;
  private Currency nickels;
  private Currency dimes;
  private Currency quarters;
  private Currency ones;
  private Currency fives;
  private Currency tens;
  private Currency twenties;
  private Currency fifties;
  private Currency hundreds;

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

  public String deposit(double total) {
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
    String depositSummary = "Pennies: " + penniesDeposited + "\n" + "Nickels: " + nickelsDeposited + "\n" + "Dimes: " + dimesDeposited + "\n" + "Quarters: " + quartersDeposited + "\n" + "Dollars: " + onesDeposited + "\n" + "Fives: " + fivesDeposited + "\n" + "Tens: " + tensDeposited + "\n" + "Twenties: " + twentiesDeposited + "\n" + "Fiftys: " + fiftiesDeposited + "\n" + "Hundreds: " + hundredsDeposited + "\n";
    double totalDeposit = (hundredsDeposited * 100) + (fiftiesDeposited * 50) + (twentiesDeposited * 20) + (tensDeposited * 10) + (fivesDeposited * 5) + (onesDeposited * 1) + (quartersDeposited * 0.25) + (dimesDeposited * 0.10) + (nickelsDeposited * 0.05) + (penniesDeposited * 0.01);
    
    
    while (total > 400.00) {

      if (total == 400) {
        break;
      }
      
      while (hundreds.count > 0 && total >= 500) {
        hundreds.count =- 1;
        total =- 100;
        hundredsDeposited++;
      }

      while (fifties.count > 0 && total >= 450) {
        fifties.count =-1;
        total =- 50;
        fiftiesDeposited++;
      }
  
      while (twenties.count > 0 && total >= 420) {
        twenties.count =- 1;
        total =- 20;
        twentiesDeposited++;
      }
  
      while (tens.count > 0 && total >= 410) {
        tens.count =- 1;
        total =- 10;
        tensDeposited++;
      }
  
      while (fives.count > 0 && total >= 405) {
        fives.count =- 1;
        total =- 5;
        fivesDeposited++;
      }

      while (ones.count > 0 && total >= 401) {
        ones.count =- 1;
        total =- 1;
        onesDeposited++;
      }

      while (quarters.count > 0 && total >= 400.25) {
        quarters.count =- 1;
        total =- 0.25;
        quartersDeposited++;
      }

      while (dimes.count > 0 && total >= 400.10) {
        dimes.count =- 1;
        total =- 0.10;
        dimesDeposited++;
      }

      while (nickels.count > 0 && total >= 400.05) {
        nickels.count =- 1;
        total =- 0.05;
        nickelsDeposited++;
      }

      while (pennies.count > 0 && total >= 400.01) {
        pennies.count =- 1;
        total =- 0.01;
        penniesDeposited++;
      }
      
    }
  
    return "Deposit Summary: \n" + depositSummary + "\n Total Deposit: " + totalDeposit; 
    
  }
  
}