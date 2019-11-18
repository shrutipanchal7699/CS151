public class Deposit implements Runnable{

  private unsynced_BankAccount account;
  private int deposit;

  public Deposit(unsynced_BankAccount bankAccount, int amount){
	  account  = bankAccount;
	  deposit = amount;
  }

  public void run(){
    for(int i = 0; i < 11; i++){
      try{
        account.deposit(deposit);
        Thread.sleep(100);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
