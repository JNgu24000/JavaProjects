import java.util.*;

class Main {

  public static void main(String[] args) {
  ArrayList<Bill>bills = new ArrayList<Bill>();
  Patient p1 = new Patient("John",bills);
  p1.setillness("severe cold");
  System.out.println(p1);
  Bill b1 = new Bill(99.95,"June 15 2021");
  p1.addBill(b1);
  p1.printBills();

  }

}