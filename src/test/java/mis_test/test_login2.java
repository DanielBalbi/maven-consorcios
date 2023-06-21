package mis_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test_login2 {
	WebDriver driver;  
	funciones acciones = new funciones(); // link con el archivo metodos
	
  @Test
  public void login_2() {
	  driver = acciones.conectarse_duda();
	  acciones.maximizar();
	  acciones.cerrar();
  }
}
