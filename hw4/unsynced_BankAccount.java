public class unsynced_BankAccount{

  private int balance;

  public unsynced_BankAccount(){
    balance = 0;
  }

  public unsynced_BankAccount(int bal){
    balance = bal;
  }

  public void withdraw(int amount){
	//System.out.println("\nUnsynced Bank Account withdrawal\n");
    balance = balance - amount;
    System.out.println("unsyned-Withdrawing: " + amount);
    System.out.println("unsynced-Balance after withdrawal is: " + balance);
  }

  public void deposit(int amount){
	//System.out.println("\nUnsynced Bank Account deposit\n");
	balance = balance + amount;
    System.out.println("unsyned-Depositing " + amount);
    System.out.println("unsyned-Balance after deposit is: " + balance);
  }
}
