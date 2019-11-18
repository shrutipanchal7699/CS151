public class hw4{

  public static void main(String[] args){
	  unsynced_BankAccount account1 = new unsynced_BankAccount(0);
	  Withdraw withdrawRunnable = new Withdraw(account1, 1);
	  Deposit depositRunnable = new Deposit(account1, 1);

	  Thread t1 = new Thread(withdrawRunnable);
	  Thread t2 = new Thread(depositRunnable);
	  //System.out.println("\nUnsynchronized Bank Accounts \n");

	  t1.start();
	  t2.start();
	 // System.out.println("\n\n");
    
    
     // System.out.println("\nSynchronized Bank Accounts \n");
	   
	  
	  synced_BankAccount account2 = new synced_BankAccount(0);
	  Withdraw withdrawRunnable2 = new Withdraw(account2, 1);
	  Deposit depositRunnable2 = new Deposit(account2, 1);

	  Thread t3 = new Thread(withdrawRunnable2);
	  Thread t4 = new Thread(depositRunnable2);
	  t3.start();
	  t4.start();
	 
  }
  
	  
	  
}
