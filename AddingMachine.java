 

public class AddingMachine {
  private int total;
  private String A = "0";
  
  public AddingMachine () {
    total = 0; 
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
      total = total + value;
      A = A + "+" + value;
  }

  public void subtract (int value) {
       total = total - value;
      A = A + "-" + value;
  }

  public String toString () {
    return A;
  }

  public void clear() {
      total = 0;
      A = "0";
  }
}