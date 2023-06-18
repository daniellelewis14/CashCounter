public class Currency {
  public int count;
  public double value;

  public Currency(double value) {
    this.value = value;
    this.count = 0;
  }

  public Currency(double value, int count) {
    this.value = value;
    this.count = count;
  }

  public void add(int count) {
    this.count = count;
  }
  
  public double totalValue() {
    double total = this.value * this.count;
    return total;
  }


}