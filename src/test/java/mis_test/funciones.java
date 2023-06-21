package mis_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class funciones {
	 WebDriver mi_conexion;  
	 
	 public void conectarse_chrome() {
		 	ChromeOptions nuevoargumento = new ChromeOptions();
		    nuevoargumento.addArguments(datos.options_chrome);
		    mi_conexion = new ChromeDriver(nuevoargumento);
	 }
	
	// void = no devuelve ningún valor
	public WebDriver conectarse_emaras() {
		conectarse_chrome();
	    mi_conexion.get(datos.web_emaras);	
	    return mi_conexion;
	}
	// Conectarse con el sitio web de duda.co que es el generador de páginas web
	public WebDriver conectarse_duda() {
		// este método se encuentra en este archivo y se utiliza para configurar chrome antes de la 
		// conexión.
		conectarse_chrome();
	    mi_conexion.get(datos.web_duda);	
	    return mi_conexion;
	}
	
	public void cerrar() {
		//mi_conexion.close();
		mi_conexion.quit();
	}
	
	public void maximizar() {
		//driver.manage().window().maximize();
		mi_conexion.manage().window().fullscreen();
	}
	
	
}
