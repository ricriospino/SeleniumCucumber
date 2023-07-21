package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class ComicsPage extends BasePageElement {
	
	@FindBy()
	
	private String TituloEsperado = "THE LITTLE TESTER COMICS SERIES";
	private By tituloComics =  By.id("comp-lc61aui31");
	
	public String getTituloEsperado() {
		return TituloEsperado;
	}
	public By getTituloComics() {
		return tituloComics;
	}
	
	public ComicsPage(WebDriver driver) {
		super(driver);
		
	}
	
	

}
