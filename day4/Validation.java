package day4;

public class Validation implements UserAccount{

	private String email;
	private String password ;



	public Validation(String email, String password) {
		this.email = email;
		this.password = password;
	}



	@Override
	public String userValidation() {
		String mailregex = "^[a-z0-9._]+@[a-z]+\\.[a-z]{2,3}$";
		String passwordregx = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}";
		String validation= "";

		if(email.matches(mailregex) && password.matches(passwordregx)) {
			validation += "User loged in successfully";
		}
		else if(!email.matches(mailregex) || !password.matches(passwordregx) ){
			validation += "Your username or password is incorrect";

		}
		return validation;
	}



	@Override
	public String toString() {
		return "Validation [email=" + email + ", password=" + password +"]";
	}



}
