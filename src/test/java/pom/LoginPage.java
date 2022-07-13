package pom;

import org.openqa.selenium.By;

public class LoginPage {

	private By nameOfUser = By.id("nameofuser"); 
	private By logInLinkLocator = By.id("login2");
	private By logInButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");								       
	private String logInTitleButton = "Log in";
	private By username = By.id("loginusername");
	private By password = By.id("loginpassword");
	private By logOut = By.id("logout2");
	
	public By getNameOfUser() {
		return nameOfUser;
	}
	public By getLogInLinkLocator() {
		return logInLinkLocator;
	}
	public By getLogInButton() {
		return logInButton;
	}
	public String getLogInTitleButton() {
		return logInTitleButton;
	}
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getLogOut() {
		return logOut;
	}
	
	
}
