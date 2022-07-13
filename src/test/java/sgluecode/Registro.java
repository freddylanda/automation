package sgluecode;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registro extends Base{

	@Given("^Click en el link Sing Up$")
	public void clickEnElLinkSingUp() throws Throwable {				
		WebElement singUplocator = driver.findElement(homePage.getSingUpLinkLocator());
		singUplocator.click();
		Thread.sleep(2000);
	}

	@When("^El Usuario Captura Username, Password y da Click en el boton Sing Up$")
	public void elUsuarioCapturaUsernamePasswordYDaClickEnElBotonSingUp() throws Throwable {
		//agregar espera explicita, validar que el botón existe.				
		WebElement singUpButton = driver.findElement(homePage.getSingUpButton());
		
		Assert.assertTrue("No se muestra la ventana de registro",singUpButton.isDisplayed());
		Assert.assertEquals(homePage.getSingUpTitleButton(), singUpButton.getText());
		
		if(singUpButton.isDisplayed()) {
			driver.findElement(homePage.getUsername()).sendKeys("USER_TEST");
			driver.findElement(homePage.getPassword()).sendKeys("PASSWORD");
			singUpButton.click();
			
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
			alerta.accept();
		}
		
	}

	@Then("^Usuario registrado correctamente$")
	public void usuarioRegistradoCorrectamente() throws Throwable { 	
		Assert.assertEquals(homePage.getTitleHomePage(), driver.getTitle());
	}
}
