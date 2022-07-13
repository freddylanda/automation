package sgluecode;

import org.openqa.selenium.WebDriver;

import pom.HomePage;
import pom.LoginPage;

public class Base {
	
	protected WebDriver driver = Hooks.getDriver();
	protected HomePage homePage = new HomePage();
	protected LoginPage loginPage = new LoginPage();

}
