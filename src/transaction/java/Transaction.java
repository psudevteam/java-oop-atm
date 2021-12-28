// Pendefinisian Package agar compiler tau lokasi file yang akan di Compile
package src.transaction.java;
import src.user.java.User;

// Pendefinisian class 
public class Transaction extends User {

  public Transaction(String newAccountHolder, double newAccountBallance, String newAccountPin, String newAccountNumber){
    super(newAccountHolder, newAccountBallance, newAccountPin, newAccountNumber);
  }

  public String getBallance(){
    return "Rp." + (long)this.getAccountBallance();
  }
}
