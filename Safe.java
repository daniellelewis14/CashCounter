import java.util.ArrayList;

public class Safe {
  private ArrayList<Drawer> drawersDeposited;

  public Safe () {
    this.drawersDeposited = new ArrayList<>(); 
  }

  public void addToSafe(Drawer drawer) {
    drawersDeposited.add(drawer);
  }

  public double totalInSafe() {
    double safeTotal = 0;
    for (Drawer drawer: drawersDeposited) {
      safeTotal += drawer.drawerTotal();
    }
    return safeTotal;
  }  

  //TO DO: Figure out how to transfer deposits to the safe class from the drawer class

  
}