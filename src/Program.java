
public class Program {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		// ilk önce creditmanagerda yazdım. burda onları çağırıyorum.

		Customer customer = new Customer(); // örneğini oluşturma
		customer.id = 1;
		customer.firstName = "Zeynep";
		customer.lastName = "Özdemir";
		customer.nationalIdentity = "123456789";
		customer.city = "Ankara";

		// CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager = new CustomerManager(customer);
		// customerManager.Save(1, "Zeynep", "Özdemir", "123456789");
		// customerManager.Save(customer);
		customerManager.Save();
		customerManager.Delete();

		Company company = new Company();
		company.taxNumber = "100000";
		company.companyName = "Arçelik";
		company.id = 100;

		CustomerManager customerManager2 = new CustomerManager(new Person());

		Person person = new Person();
		person.nationalIdentity = "111111111";

	}

}
