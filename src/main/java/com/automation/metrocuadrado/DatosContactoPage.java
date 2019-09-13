package com.automation.metrocuadrado;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatosContactoPage extends PageFactory {

	@FindBy(xpath="//*[@id=\"contactbuttonwrapper-765-1526\"]/a")
	WebElement LinkPropiedad;
	
	
	
	public void SeleccionarPropiedad() throws InterruptedException {
		Thread.sleep(200);
		
		LinkPropiedad.click();
		
	}
}
