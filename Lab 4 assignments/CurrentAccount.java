package Lab4;

public class CurrentAccount extends Account {
	private double overDraftLimit;
	
	public CurrentAccount(double balance, Person person, double overDraftLimit) {
		super(balance, person);
		this.overDraftLimit = overDraftLimit;
	}

	
	public void withdraw(double amount) {
		
		double newBalance = this.getBalance() - amount;
	
		if (newBalance <= 0) {
			if (Math.abs(newBalance) < this.overDraftLimit) {
				
				this.setBalance(newBalance);
			}
			
			else {
				System.out.println(
						"Can't withdraw as " + this.getAccHolder().getName() + " account overdraft limit is reached.");
			}
		}
		
		else {
			this.setBalance(newBalance);
		}
	}
}
