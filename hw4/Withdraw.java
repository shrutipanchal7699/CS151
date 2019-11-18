public class Withdraw implements Runnable{

  private unsynced_BankAccount account;
  private int wd;

  public Withdraw(unsynced_BankAccount bankAccount, int amount){
    account = bankAccount;
    wd   = amount;
  }

  public void run(){
    for(int i = 0; i <= 10; i++){
      try{
        account.withdraw(wd);
        Thread.sleep(100);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
