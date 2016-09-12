import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		print("Enter Name: ");
		ab.setName(sc.nextLine());
		print("Enter Address: ");
		ab.setAddress(sc.nextLine());
		print("Enter City: ");
		ab.setCity(sc.nextLine());
		print("Enter State: ");
		ab.setState(sc.nextLine());
		print("Enter Zip: ");
		ab.setZip(sc.nextLine());
		print("Enter Phone: ");
		String phone = sc.nextLine();
		boolean validPhone = ab.validatePhone(phone);
		print("Enter Email: ");
		String email = sc.nextLine();
		boolean validEmail = ab.validateEmail(email);
		
		if(validPhone == true){
			ab.setPhone(phone);
		}
		else{
			print("Invalid Phone Number\n");
		}
		if(validEmail == true){
			ab.setEmail(email);
		}
		else{
			print("Invalid Email Address\n");
		}
		
		print("Name: " + ab.getName());
		print("Address: " + ab.getAddress());
		print("City: " + ab.getCity());
		print("State: " + ab.getState());
		print("Zip: " + ab.getZip());
		print("Phone: " + ab.getPhone());
		print("Email: " + ab.getEmail());
		
		print("\nMailing Address:\n" + ab.printAddress());
	}
	public static void print(String input){
		System.out.println(input);
	}
}
