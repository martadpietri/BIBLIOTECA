package biblioteca.demo.run;

import java.time.LocalDate;

public class Prestamo {
	private int numSocio;
	private int ISBN;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	/*que este privado significa que los atributos solo se pueden usar
	 desde la misma clase*/
	
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	public int getISBN() {
		return ISBN;
	}
	public void setLibro(int ISBN) {
		this.ISBN = ISBN;
	}
	
	public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    // Creacion de método que verifica si el socio tiene la edad para sacar la categoria que tenga el libro
    public boolean puedeSacarLibroPorCategoria(String numSocio, String ISBN) {
        // Consultar la categoría del socio
        String categoriaSocio = obtenerCategoriaSocio(numSocio);
        
        // Consultar la categoría del libro
        String categoriaLibro = obtenerCategoriaLibro(ISBN);
        
        // Verificar que el socio y el libro sean de la misma categoría
        if (categoriaSocio.equals("Menos 14") && categoriaLibro.equals("Menos 14")) {
            return true; // Puede sacar el libro
        } else if (categoriaSocio.equals("Más 14")) {
            return true; // Puede sacar el libro
        }
        return false; // No puede sacar el libro porque las categorías no coinciden
    }

    // Métodos de consulta (a implementar según tu base de datos)
    private String obtenerCategoriaLibro(String ISBN) {
        // Lógica para obtener la categoría del libro desde la base de datos
        // Aquí puedes hacer una consulta a la base de datos para obtener la categoría del libro
        return "Menos 14"; // Simulación para el ejemplo
    }

    private String obtenerCategoriaSocio(String numSocio) {
        // Lógica para obtener la categoría del socio desde la base de datos
        // Aquí puedes hacer una consulta a la base de datos para obtener la categoría del socio
        // Por ejemplo, si el socio tiene menos de 14 años, retorna "Menos 14"
        return "Menos 14"; // Simulación para el ejemplo
    }
	
}
