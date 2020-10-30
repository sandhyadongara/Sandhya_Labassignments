package Lab4;
	public class SavingsAccount extends Account{
		
		private final double MINIMUM_BALANCE = 500;
		
		
		public SavingsAccount(double balance,Person person) {
			super(balance,person);
		}
		
		/**
		 * account have minimum balance of 500 for successful withdraw.
		 */
		@Override
		public void withdraw(double amount) {
			
			double newBalance = super.getBalance() - amount;
			
			if(newBalance>=MINIMUM_BALANCE) {
				
				super.setBalance(newBalance);
			}
			
			else {
				System.out.println("Can't withdraw as " +this.getAccHolder().getName()+" account don't have sufficient funds.");
			}
		}
	}

