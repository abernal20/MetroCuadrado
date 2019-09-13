package com.automation.metrocuadrado;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactoPage extends PageFactory{
	
	@FindBy(id="comment")
	WebElement TxtComentario;

	@FindBy (id = "contact_name_email")
	WebElement TxtNombre;
	
	@FindBy(id="contact_phone_email")
	WebElement TxtTelefono;
	
	@FindBy(id="contact_email_email")
	WebElement TxtCorreo;
	
	
	public void DigitarDatos(String nombre, String telefono, String correo) throws InterruptedException {
		Thread.sleep(500);
		TxtNombre.sendKeys(nombre);
		
		Thread.sleep(500);		
		TxtTelefono.sendKeys(telefono);
		
		Thread.sleep(500);
		TxtCorreo.sendKeys(correo);
		
	}
	
}
