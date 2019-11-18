public class synced_BankAccount extends unsynced_BankAccount{

  private int balance;

  public synced_BankAccount(){
    balance = 0;
  }

  public synced_BankAccount(int bal){
    balance = bal;
  }

  public synchronized void withdraw(int amount){
	//System.out.println("\nsynced Bank Account withdrawal\n");
	balance = balance - amount;
    System.out.println("Withdrawing: " + amount);
    System.out.println("synced--Balance after withdrawal is: " + balance);
  }

  public synchronized void deposit(int amount){
    //System.out.println("\nsynced Bank Account deposit\n");
	balance = balance + amount;
    System.out.println("Depositing: " + amount);
    System.out.println("synced--Balance after deposit is: " + balance);
  }
}
