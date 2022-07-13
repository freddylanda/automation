package pom;

import org.openqa.selenium.By;

public class HomePage {
	
	private String titleHomePage = "STORE"; 
	private By singUpLinkLocator = By.id("signin2");
	private By singUpButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	private String singUpTitleButton = "Sign up";
	private By username = By.id("sign-username");
	private By password = By.id("sign-password");
	
	public String getTitleHomePage() {
		return titleHomePage;
	}
	
	public By getSingUpLinkLocator() {
		return singUpLinkLocator;
	}

	public By getSingUpButton() {
		return singUpButton;
	}

	public String getSingUpTitleButton() {
		return singUpTitleButton;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}


	
}
