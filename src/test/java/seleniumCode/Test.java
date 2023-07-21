package seleniumCode;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test extends TestBase {
	
	// no hay localizadores 
	
	@Given("^El usuario se encuentra en la pagina Home de imalittletester\\.com$")
	public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester_com() throws Throwable {

		WebElement tituloPricipal = driver.findElement( homePage.getTitulo());
		System.out.println(homePage.getTitulo());		
		//test
		Assert.assertEquals(homePage.getTituloEsperado(),tituloPricipal.getText());
		
		
	}

	@When("^Hace click sobre el boton The little tester comics$")
	public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
	    
	    WebElement titleComics = driver.findElement((By) homePage.getTitleComics());
	    titleComics.click();
		
	}

	@Then("^Se debe redirigir a la pantalla Comics$")
	public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {

		WebElement tituloComics =  driver.findElement(comicsPage.getTituloComics());
	
		//test
	    Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", tituloComics.isDisplayed());
	    Assert.assertEquals(comicsPage.getTituloEsperado(), tituloComics.getText());
	}

}
