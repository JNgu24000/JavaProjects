import java.util.ArrayList;

class Patient {

  private String name;
  private String illness;
  private ArrayList<Bill> bills;

  public Patient(String name, ArrayList<Bill> bills) {
    this.name = name;
    this.bills = bills;
  }

  public String getname() {
    return name;
  }
  public String getillness(){
    return illness;
  }
  public void setname(String name) {
    this.name = name;
  }
 public void setillness(String illness){
    this.illness=illness;
  }
   @Override
  public String toString() {
    return "[Patient's name = " + name + ", Patient's illness = " + illness + "]";
  }
  public void addBill(Bill bill){
    bills.add(bill);
  }
  public void printBills(){
    double total=0;
    for(Bill bill:bills){
      total=total+bill.getAmount();
      System.out.println(bill);
    }
    System.out.println(total);
  }
}