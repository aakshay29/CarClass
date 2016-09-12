import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {

	static String name;
	static String address;
	static String city;
	static String state;
	static String zip;
	static String phone;
	static String email;
	
	public String printAddress(){
		return name + "\n" + address + ", " + city + ", " + state + "-" + zip + "\n" + phone + "\n" + email;
	}
	
	public void setName(String inputName){
		name = inputName;
	}	
	public String getName(){
		return name;
	}
	
	public void setAddress(String inputAddress){
		address = inputAddress;
	}	
	public String getAddress(){
		return address;
	}
	
	public void setCity(String inputCity){
		city = inputCity;
	}	
	public String getCity(){
		return city;
	}
	
	public void setState(String inputState){
		state = inputState;
	}	
	public String getState(){
		return state;
	}
	
	public void setZip(String inputZip){
		zip = inputZip;
	}	
	public String getZip(){
		return zip;
	}
	
	public void setPhone(String inputPhone){
		phone = inputPhone;
	}	
	public String getPhone(){
		return phone;
	}
	
	public void setEmail(String inputEmail){
		email = inputEmail;
	}	
	public String getEmail(){
		return email;
	}
	
	public boolean validateEmail(String emailAddress) {
		boolean isValid = false;
		String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr = emailAddress;
		// Make the comparison case-insensitive.
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {

			isValid = true;
		}
		return isValid;
	}

	public boolean validatePhone(String phoneNumber) {
		boolean isValid = false;

		String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
		CharSequence inputStr = phoneNumber;
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		}
		return isValid;
	}

}
