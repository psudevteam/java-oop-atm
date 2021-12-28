package src.user.java;

public abstract class User {

  private String accountHolder, accountPin, accountNumber;
  private double accountBallance;

  public User(String newAccountHolder, double newAccountBallance, String newAccountPin, String newAccountNumber){
    this.setAccountHolder(newAccountHolder);
    this.setAccountBallance(newAccountBallance);
    this.setAccountPin(newAccountPin);
    this.setAccountNumber(newAccountNumber);
  }

  public void setAccountHolder(String newAccountHolder){
    this.accountHolder = newAccountHolder;
  }

  public void setAccountBallance(double newAccountBallance){
    this.accountBallance = newAccountBallance;
  }

  public void setAccountPin(String newAccountPin){
    this.accountPin = newAccountPin;
  }

  public void setAccountNumber(String newAccountNumber){
    this.accountNumber = newAccountNumber;
  }

  public void transferBallance(double amountBallance){
    this.accountBallance -= amountBallance;
  }

  public void receiveBallance(double amountBallance){
    this.accountBallance += amountBallance;
  }

  public String getAccountHolder(){
    return this.accountHolder;
  }

  public double getAccountBallance(){
      return this.accountBallance;
  }

  public String getAccountPin(){
    return this.accountPin;
  }

  public String getAccountNumber(){
    return this.accountNumber;
  }

}
