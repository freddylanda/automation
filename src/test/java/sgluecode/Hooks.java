package sgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import runner.browsermanager.DriverManager;
import runner.browsermanager.DriverManagerFactory;
import runner.browsermanager.DriverType;

public class Hooks {
	
	private static WebDriver driver;
	private static int numberCase = 0;
	private DriverManager driverManager;
	
	@Before
	public void setUp() {
		numberCase++;
		
		System.out.println("========================Inicio escenario: "+numberCase);
//		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
//		driver = new ChromeDriver();
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		System.out.println("========================Fin escenario: "+numberCase);
		driverManager.quitDriver();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	

}
