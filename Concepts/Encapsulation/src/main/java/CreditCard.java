public class CreditCard{

private String name;
private String creditCardNumber;
private String expirationDate;
private int cvv;

public String getName(){
  return name;
  }
public String getCreditCardNumber(){
  return creditCardNumber;
  }
public String getExpirationDate(){
  return expirationDate;
  }
public int getCVV(){
  return cvv;
  }

public void setName(String name){
  this.name = name;
  }
public void setCreditCardNumber(String creditCardNumber){
  this.creditCardNumber = creditCardNumber;
  }
public void setExpirationDate(String expirationDate){
  this.expirationDate = expirationDate;
  }
public void setCVV(int cvv){
  this.cvv = cvv;
  }
}

