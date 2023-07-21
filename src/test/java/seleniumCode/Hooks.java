package seleniumCode;

import org.openqa.selenium.WebDriver;

import browserManager.DriverManager;
import browserManager.DriverManagerFactory;
import browserManager.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	private static WebDriver driver;
	private DriverManager driverManager;
	
	// variable statica
	private static int numberofCase = 0;
	
	@Before
	public void Abrir() {
		
		numberofCase++;
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME); // aqui se manda que driver quiere utilizar
		driver = driverManager.getDriver();
		
		System.out.println("Se esta ejecutando el escenario nro: " + numberofCase);
		driver.get("https://www.imalittletester.com/");
		driver.manage().window().maximize();
	}
	
	
	@After
	public void Cerrar() {
		
		System.out.println("El escenario nro : " + numberofCase + " se ejecuto correctamente y se cerro.");
		driverManager.quitDriver();
		
	}


	public static WebDriver getDriver() {	
		return driver;
	}


}
