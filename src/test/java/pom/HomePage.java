package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePageElement {
	

	private String tituloEsperado = "imalittletester";
	
	private By titulo = By.cssSelector("span[style*='font-family:playfair display']");
	private By titleComics = By.id("comp-iiyocj9v5label");
	
	
	public String getTituloEsperado() {
		return tituloEsperado;
	}
	
	public By getTitulo() {
		return titulo;
	}

	public By getTitleComics() {
		return titleComics;
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
	
}
