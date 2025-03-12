package biblioteca.demo.run;

public class Prestamo {
	private int socio;
	private int libro;
	private int fechaPrestamo;
	private int fechaDevolucion;
	/*que este privado significa que los atributos solo se pueden usar
	 desde la misma clase*/
	
	public int getSocio() {
		return socio;
	}
	public void setSocio(int socio) {
		this.socio = socio;
	}
	
	public int getLibro() {
		return libro;
	}
	public void setLibro(int libro) {
		this.libro = libro;
	}
	
	public int getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(int fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
		
	}
	public int getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(int fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
}