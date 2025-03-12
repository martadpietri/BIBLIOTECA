package biblioteca.demo.run;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private int edicion;
	/*que este privado significa que los atributos solo se pueden usar
	 desde la misma clase*/
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public String getAutor() {
		return autor;
	/*Get es para presentar el dato.*/
	}

	public void setAutor(String autor) {
		this.autor = autor;
		/*set es para introducir el dato*/
	}

	
	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}


}
