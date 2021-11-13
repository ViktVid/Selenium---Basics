package seleniumOsnove;

public class SadPathForgotPassword extends HappyPathForgotPassword {

	public SadPathForgotPassword(String username, String password) {

		username = "SmithTom";
		password = "SuperStupidPassword";
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

	public static void setUsername(String string) {

	}

	public static void setPassword(String string) {

	}

}
