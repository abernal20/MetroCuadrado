package com.automation.metrocuadrado;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageFactory {
	
	@FindBy(id = "home-desktop-mtiponegocio")
	WebElement SlctTipoServicio;
	
	@FindBy(id = "campo-selector-multiple")
	WebElement SlctTipoInmueble;
	
	@FindBy(xpath = "//div[@id = 'campo-selector-multiple']/*[@id=\"selector-multiple\"]/div/label")
	List<WebElement> ListOptionSlctTipoInmueble;
	
	@FindBy(id = "home-desktop-location")
	WebElement TxtLocalizacion;
	
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	WebElement OptionLocalizacion;
	
	@FindBy(id = "btn_submit_search_home")
	WebElement BtnBuscar;
	
	public void SeleccionarTipoServicio(String opcion){			
		Select SlctTipoServicios = new Select(SlctTipoServicio);
		SlctTipoServicios.selectByVisibleText(opcion);
		
	}
	
	public void SeleccionarOpcionTipoInmueble(String OpcionTipoInmueble){	
		SlctTipoInmueble.click();
		for(WebElement tipoInmueble : ListOptionSlctTipoInmueble) {
			System.out.println(tipoInmueble.getText());
			if(tipoInmueble.getText().equals(OpcionTipoInmueble)) {
				tipoInmueble.click();
				break;
				
			}
		}
	}
	
	public void buscar(String localizacion) throws InterruptedException {
		TxtLocalizacion.sendKeys(localizacion);				
		OptionLocalizacion.click();		
		Thread.sleep (200);
		BtnBuscar.click();		
	}
	
	
}
