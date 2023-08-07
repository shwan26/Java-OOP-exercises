package Customer_n_Account2_5;

public class TestCustomer2_5 {
	public static void main(String[] args) {
		
		//customer 
		Customer customer1 = new Customer(001, "AA", 'f');
		System.out.println("Customer ID: "+customer1.getId());
		System.out.println("CustomerName: "+customer1.getName());
		System.out.println("Customer Gender: "+customer1.getGender());
		System.out.println("Customer: "+customer1.toString());
		System.out.println();
		
		//Account
		Account account1 = new Account(001, customer1, 10000);
		System.out.println("Customer AccID: "+account1.getId());
		System.out.println("Customer Name: "+account1.getCustomerName());
		System.out.println("Balance: "+account1.getBalance());
		account1.setBalance(20000);
		System.out.println("New balance: "+account1.getBalance());
		System.out.println("Deposit Amount: 1000");
		account1.deposit(1000);
		System.out.println("Balance after deposit: "+account1.getBalance());
		account1.withdraw(3000);
		System.out.println("Balance after withdraw: "+account1.getBalance());
		
		
	}
}
