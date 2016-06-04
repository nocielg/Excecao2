
public class LoginException extends Exception {
	
	private String login;
	
	public LoginException(String message, String login) {
		super(message);
		this.login = login;
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

}
