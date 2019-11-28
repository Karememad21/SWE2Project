
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner input = new Scanner(System.in);
		boolean mainLoop = true;

		User user1 = new User();
		String user = user1.getUsername();
		String pass = user1.getPassword();
		String stat = user1.getLogin_stat();
		String mail = user1.getEmail();
		String fname = user1.getFname();

		Admin admin1 = new Admin();

		ProductDetails d = new ProductDetails();
		String pname = d.getProductName();
		String pcategory = d.getCategory();
		String price = d.getPrice();
		String br = d.getBrandName();
		String brcat = d.getBrandCategory();
		String sn = d.getStoreName();
		String Type = d.getType();
		String location = d.getLocation();
		String offer=d.getoffer();
		String  Amount=d.getAmount();
		String Shippingaddresse=d.getShippingAddresse();
		Customer customer1 = new Customer();

		StoreOwner so = new StoreOwner();

		Statstics statt = new Statstics();
		int choice;
		do {
			System.out.println(" Main Menu : \n");
			System.out.print("1.) Register if you don't have an account as a store owner \n");
			System.out.print("2.) Register if you don't have an account as a customer\n");
			System.out.print("3.) Login with an existing account : \n");
			System.out.print("4.) Add Items as an admin : \n");
			System.out.print("5.) Add Items as a store owner : \n");
			System.out.print("6.) Add a new store : \n");
			System.out.print("7.) Add new brand : \n");
			System.out.print("8.) View products  : \n");
			System.out.print("9.) View stores  : \n");
			System.out.print("10.) View statstics numbers  : \n");
			System.out.print("11.) View statstics numbers of first lanuch of website : \n");
			System.out.print("12.Buy products : \n");
			System.out.print("13.) Exit\n");
			System.out.print("\nEnter Your Menu Choice: ");

			choice = input.nextInt();

		}

		while (choice > 14);

		switch (choice) {

		case 1:

			user1.RegisterSO(user, pass, stat, fname, mail);

			break;
			
		case 2:

			user1.RegisterCust(user, pass, stat, fname, mail);

			break;
			
		case 3:

			user1.login_verify(user, pass, stat);
			break;

		case 4:

			admin1.addItems(pname, pcategory, price,offer);
			break;
		case 5:

			so.addItems(pname, pcategory, price,offer);
			break;

		case 6:
			so.addNewStore(sn, Type, location);
			break;

		case 7:
			admin1.addNewBrand(br, brcat);
			break;

		case 8:
			customer1.viewproduct();
			break;

		case 9:
			customer1.viewStore();
			break;

		case 10:
			Timer timer = new Timer();
			timer.schedule(new ProductDetails(), 0, 600000);
			break;

		case 11:
			System.out.println("Number of products viewed : " + statt.getNumberOfProducts_viewed());
			System.out.println("Number of stores viewed : " + statt.getNumberOfStores_visited());
			System.out.println("Number of products bought : " + statt.getNumberOfProducts_bought());
			break;
			
		case 12:
			System.out.println("Products to buy " );
			System.out.println("Products to buy " );
			 System.out.println("Product Name");
	            Scanner input1 = new Scanner(System.in);
	            String ProductName = input1.next();
	            System.out.println("Amount");
	            Scanner input2 = new Scanner(System.in);
	            String amount = input2.next();
	            System.out.println("Shipping Addresse");
	            Scanner input3 = new Scanner(System.in);
	            String ShippingAddresse = input3.next();
			customer1.BuyProduct(ProductName, amount, ShippingAddresse);
			break;
			
			
		case 13:
			System.out.println("Exiting Program...");
			System.exit(0);
			break;

		}

		// Bad Menu Option Direct
		if (choice > 14 || choice < 1) {
			System.out.println("This is not a valid Menu Option! Please Select Another.");
			do {
				choice = input.nextInt();
			} while (choice < 14);
		}
		// End bad menu option

	}

}