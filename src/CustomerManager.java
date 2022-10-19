
public class CustomerManager {
	private Customer _customer;
private ICrediManager _creditManager;

	public CustomerManager(Customer customer, ICrediManager creditManager) {
		_customer = customer;
		_creditManager= creditManager;
	}

	// public void Save(Customer customer)
	public void Save() {
		// System.out.println("Müşteri Kaydedildi" + _customer.firstName);
		System.out.println("Müşteri Kaydedildi");
	}

//public void Save( id, String firstName, String lastName, String nationalIdentitity)//

	public void Delete() {
		// System.out.println("Müşteri Silindi" + _customer.firstName);
		System.out.println("Müşteri Silindi");
	}
public void giveCredit() {
	_creditManager.Calculate();
	
	
	
	
}
}
