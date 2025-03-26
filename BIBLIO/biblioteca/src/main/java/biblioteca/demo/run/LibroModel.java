package biblioteca.demo.run;

import java.util.List;

import biblioteca.demo.util.Database;

public class LibroModel {
	
	Database db = new Database(); // Siempre tiene que estar llamada la base de datos en el modelo

	

	public List<Object[]> cargaDatosLibro(String text) { // Lo creo de tipo lista de objetos para q
		
		List<Object[]> lista = null;  // Creo una lista para ir rellenando los campos con los datos
		
		String sql = "SELECT * FROM LIBRO WHERE ISBN=?"; // Lo llamo sql por facilidad, y "SELECT * FROM LIBRO WHERE ISBN=?" la comprobacion donde '?' es la variable
		lista = db.executeQueryArray(sql, text); // Aquí conjo de la base de datos el array
		
		return lista; // Devuelvo la lista
		
	}

}