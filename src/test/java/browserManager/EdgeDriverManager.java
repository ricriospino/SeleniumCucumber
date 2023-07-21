package browserManager;

import org.openqa.selenium.edge.EdgeDriver;


public class EdgeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		
		
		System.setProperty("webdriver.edge.driver","D:\\CursoJava\\workspace_seleniumUdemy\\CucumberSelenium\\src\\test\\java\\resurces\\msedgedriver.exe");	
		driver = new EdgeDriver();
	}

}
