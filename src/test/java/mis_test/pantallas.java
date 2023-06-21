package mis_test;

public class pantallas {
	// selectores de los elementos (cuadros de texto, botones etc.) 
	// pantalla login de emaras.com.ar
		public static String login_usuario = "usuario";
		public static String login_clave = "clave";
		public static String login_boton = "btnIngresar";
	// selector del 3er Consorcio pantalla de ingreso
		public static String Ingreso_Consorcio = "#tableData > tbody > tr:nth-child(3) > td.evenselected > p > a > font";	
	// seleccionar la opción usuarios del menu	
		public static String Menu_Usuarios ="#tp_menu > ul > li:nth-child(8) > a > font";

		public static String Menu_datosadministracion = "#tp_menu > ul > li:nth-child(8) > ul > li:nth-child(6) > font > a";

		// Pantalla de los datos de la Administración
		public static String adm_domicilio = "domicilio";
		public static String adm_botonguardar = "body > form > div:nth-child(4) > table > tbody > tr > td:nth-child(2) > input[type=button]";
		// Encabezado de pantalla
		public static String cerrarsesion = "td > font > a > font";		
		

}
