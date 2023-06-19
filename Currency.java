public class Currency {
  public int count;
  public double value;

  //Constructor calls for the value which is static 
  //and the count which is user entered in the Main method
  
  public Currency(double value, int count) {
    this.value = value;
    this.count = count;
  }
  //To add additional currency to the count
  public void add(int count) {
    this.count = count;
  }
  
  //Returns the total value of an individual coin or bill
  public double totalValue() {
    double total = this.value * this.count;
    return total;
  }

  //Returns how many of each coin or bill is held in each object
  public int howMany() {
    return this.count;
  }

}