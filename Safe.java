import java.util.ArrayList;

public class Safe {
  private ArrayList<Drawer> drawersDeposited;

  public Safe () {
    this.drawersDeposited = new ArrayList<>();
  }

  public String addToSafe(Currency penniesDeposited, Currency nickelsDeposited, Currency dimesDeposited, Currency quartersDeposited, Currency onesDeposited, Currency fivesDeposited, Currency tensDeposited, Currency twentiesDeposited, Currency fiftiesDeposited, Currency hundredsDeposited) {
    
    Drawer drawer = new Drawer(penniesDeposited, nickelsDeposited, dimesDeposited, quartersDeposited, onesDeposited, fiftiesDeposited, tensDeposited, twentiesDeposited, fiftiesDeposited, hundredsDeposited);
    drawersDeposited.add(drawer);
    
    String depositSummary = "\nPennies: " + penniesDeposited.count + "\n" + "Nickels: " + nickelsDeposited.count + "\n" + "Dimes: " +      dimesDeposited.count + "\n" + "Quarters: " + quartersDeposited.count + "\n" + "Dollars: " + onesDeposited.count + "\n" + "Fives: " + fivesDeposited.count + "\n" + "Tens: " + tensDeposited.count + "\n" + "Twenties: " + twentiesDeposited.count + "\n" + "Fifties: " + fiftiesDeposited.count + "\n" + "Hundreds: " + hundredsDeposited.count + "\n";
    
    return depositSummary;
  }

  public double totalInSafe() {
    double safeTotal = 0;
    for (Drawer drawer: drawersDeposited) {
      safeTotal += drawer.drawerTotal().doubleValue();
    }
    return safeTotal;
  }  

  //TO DO: Figure out how to transfer deposits to the safe class from the drawer class
}