package mis_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class test_login {
	 WebDriver driver;  
  // perro sultan = new perro("caniche");
	 funciones acciones = new funciones();  // link entre los dos archivos = instanciar
	 
	// Hooks Test 
  @BeforeTest
  public void antesTest() {
	  ////////////// acá estaba la conexión 
	  driver= acciones.conectarse_emaras();
	  acciones.maximizar();
  }
  
  @Test
  public void loguearse() throws InterruptedException {

	  // Me logueo en el sistema
	      driver.findElement(By.name(pantallas.login_usuario)).sendKeys(datos.usuario);      
	      driver.findElement(By.name(pantallas.login_clave)).sendKeys(datos.clave);
	      driver.findElement(By.id(pantallas.login_boton)).click();
	   // Selecciono un consorcio
	      driver.findElement(By.cssSelector(pantallas.Ingreso_Consorcio)).click();  
	   // Una vez dentro de la pantalla de ingreso selecciono
	   // el menu "Usuarios"
	      driver.findElement(By.cssSelector(pantallas.Menu_Usuarios)).click();  
	      Thread.sleep(250);
	      driver.findElement(By.cssSelector(pantallas.Menu_datosadministracion)).click();
	      driver.findElement(By.name(pantallas.adm_domicilio)).clear();
	      driver.findElement(By.name(pantallas.adm_domicilio)).sendKeys("San Juan 9090");
	      driver.findElement(By.cssSelector(pantallas.adm_botonguardar)).click();
	      Thread.sleep(1250);      
	      driver.findElement(By.cssSelector(pantallas.cerrarsesion)).click();
  }

  @AfterTest
  public void despuesTest() {
	  System.out.println("Termina el test de Emaras");
	 acciones.cerrar();
  }

}
