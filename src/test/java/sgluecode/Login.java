package sgluecode;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Base {

	@Given("^Click en el Link Log In Usuario$")
	public void clickEnElLinkLogInUsuario() throws Throwable {
		WebElement logInLinkLocator = driver.findElement(loginPage.getLogInLinkLocator());
		logInLinkLocator.click();
		Thread.sleep(2000);
	}

	@When("^El usuario captura credenciales validas username, password y da click en el boton login$")
	public void elUsuarioCapturaCredencialesValidasUsernamePasswordYDaClickEnElBotonLogin() throws Throwable {
		WebElement logInButton = driver.findElement(loginPage.getLogInButton());

		Assert.assertTrue("No se muestra la ventana de log in", logInButton.isDisplayed());
		Assert.assertEquals(loginPage.getLogInTitleButton(), logInButton.getText());

		if (logInButton.isDisplayed()) {
			driver.findElement(loginPage.getUsername()).sendKeys("USER_TEST");
			driver.findElement(loginPage.getPassword()).sendKeys("PASSWORD");
			logInButton.click();
		}
	}

	@And("^Usuario loguado correctamente$")
	public void usuarioLoguadoCorrectamente() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(loginPage.getNameOfUser()).isDisplayed());
	}
	
	@And("^Seleccionar la opcion Laptops$")
	public void seleccionarLaOpcionLaptops() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Laptops")));
		element.click();		
	}
	
	@And("^Seleccionar el primer resultado de la lista$")
	public void seleccionarElPrimerResultadoDeLaLista() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement laptopVaio = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Sony vaio i5")));
		laptopVaio.click(); 
	}
	
	@And("^En la nueva ventana dar click en agregar al carrito$")
	public void enLaNuevaVentanaDarClickEnAgregarAlCarrito() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Add to cart")));
		addToCart.click();
		
		Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
		alerta.accept();
	}
	
	@And("^Ingresar a el Link Cart para validar$")
	public void ingresarAElLinkCartParaValidar() throws Throwable {		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toCartLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Cart")));
		toCartLink.click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("totalp")).isDisplayed());
	}
		
	@Then("^Click en el link Log out$")
	public void clickEnElLinkLogOut() throws Throwable {
		WebElement logOutLinkLocator = driver.findElement(loginPage.getLogOut());
		if (logOutLinkLocator.isDisplayed()) {
			logOutLinkLocator.click();
		}
		Thread.sleep(2000);
	}
}
