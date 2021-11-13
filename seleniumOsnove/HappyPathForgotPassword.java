package seleniumOsnove;

public class HappyPathForgotPassword {

	protected static String username;
	protected static String password;

	public HappyPathForgotPassword(String username, String password) {
		HappyPathForgotPassword.username = "tomsmith";
		this.password = "SuperSecretPassword!";
	}

	public HappyPathForgotPassword() {
		super();
		
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}

	public void stampanje() {
		switch (username) {
		case "tomsmith":
			System.out.println("PASSWORD: " + password);
			break;
		default:
			System.out.println("Pogresan USERNAME!");
			break;
		}
		switch (password) {
		case "SuperSecretPassword!":
			System.out.println("Uspesno ste ulogovani.");

			break;
		default:
			System.out.println("Pogresan PASSWORD!");
		
		}
	}
}
