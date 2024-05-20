package resources;

//created to provide test data and assertion stmts
public class testData {

	// Valid registration data-

	public static String firstname = "rahul";
	public static String lastname = "rahul";
	public static String telephome = "9889567089";
	public static String password = "test";

	public static String registrationSuccessfulTextExpected = "Your Account Has Been Created!";
	public static String emailAlreadyRegisteredErrorExpected = "Warning: E-Mail Address is already registered!";

	// for blank fields

	public static String firstnameExpected = "First Name must be between 1 and 32 characters!";
	public static String lastnameExpected = "Last Name must be between 1 and 32 characters!";
	public static String emailaddressExpected = "E-Mail Address does not appear to be valid!";
	public static String telephonenumberExpected = "Telephone must be between 3 and 32 characters!";
	public static String passwordisExpected = "Password must be between 4 and 20 characters!";
	public static String privacyPolicyisExpected = "Warning: You must agree to the Privacy Policy!";

	// login succesful
	public static String loginSuccesfulexpected = "My Account";
	// assertion to check error on blank email during login
	public static String blankEmailDuringLoginErrorExpected = "Warning: No match for E-Mail Address and/or Password.";

}
