package com.automation.metrocuadrado.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.metrocuadrado.ContactoPage;
import com.automation.metrocuadrado.DatosContactoPage;
import com.automation.metrocuadrado.HomePage;
import com.automation.utils.*;

public class HomeTest {
	
	WebDriver driver;
	HomePage homePage;
	DatosContactoPage datosContactoPage;
	ContactoPage contactoPage;
	UtilsFunctions utils;

	@Before
	public void openConnection () {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.metrocuadrado.com");
		homePage = PageFactory.initElements(driver, HomePage.class);
		datosContactoPage = DatosContactoPage.initElements(driver, DatosContactoPage.class);
		contactoPage = ContactoPage.initElements(driver, ContactoPage.class);
		utils = new UtilsFunctions(driver);
		
	}
	
	@Test
	public void seleccionar() throws InterruptedException, IOException {
		
		homePage.SeleccionarTipoServicio("Arriendo");
		homePage.SeleccionarOpcionTipoInmueble("Casas");
		homePage.buscar("Bogotá");
		datosContactoPage.SeleccionarPropiedad();
		contactoPage.DigitarDatos("Axel Bernal", "3144657020", "abernal@qvsion.com.co");
		utils.tomarPantalla();
		
	}
	
	@After
	public void closeConnection() {
		driver.quit();
		
	}

}
