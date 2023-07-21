package browserManager;


public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverType type) {
		
		DriverManager driverManager= null;
		
		switch (type) {
		
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		case EDGE:
			driverManager = new EdgeDriverManager();
			break;
		default:
				System.out.println("Invalid browser selected");
			break;
		}
		
		return driverManager;
	}

}
