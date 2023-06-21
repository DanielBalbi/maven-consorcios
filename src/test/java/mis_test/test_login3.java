package mis_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class test_login3 {
	 WebDriver driver;  
	 funciones acciones = new funciones();  // link entre los dos archivos = instanciar
	 
	// Hooks Test 
  @BeforeTest
  public void antesTest() {
	  ////////////// acá estaba la conexión 
	  driver= acciones.conectarse_emaras();
	  acciones.maximizar();
  }
  
  @Test(dataProvider="datos_login")
  public void loguearse(String usuario_dp, String clave_dp) {
	  // Me logueo en el sistema
	  try {  // probar
	      driver.findElement(By.name(pantallas.login_usuario)).sendKeys(usuario_dp);      
	      driver.findElement(By.name(pantallas.login_clave)).sendKeys(clave_dp);
	      Thread.sleep(3000);
	  }
	  catch(Exception mensaje) {
		  acciones.cerrar();
		  System.out.println("El error es: "+ mensaje);
		  System.exit(1);  // si sale con un valor 0 = salida normal
		  					// con un valor 1 = salida por ejecución de error
	  }
  }
  
  @DataProvider(name="datos_login")
  public String[][] datos(){
	  String[][] misdatos = new String[2][2];
		  misdatos[0][0] ="prueba1";
		  misdatos[0][1] ="12345";
		  misdatos[1][0] ="prueba2";
		  misdatos[1][1] ="654321";	    
	return misdatos;  
  }
  

  @AfterTest
  public void despuesTest() {
	System.out.println("Termina el test de Emaras");
	// acciones.cerrar();
  }

}
