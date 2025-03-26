package biblioteca.demo.run;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int edicion;
	private String categoriaLibro;
	/*que este privado significa que los atributos solo se pueden usar
	 desde la misma clase*/
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
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
	
	public String getCategoriaLibro() {
		return categoriaLibro;
	/*Get es para presentar el dato.*/
	}

	public void setCategoriaLibro(String categoriaLibro) {
		this.categoriaLibro = categoriaLibro;
		/*set es para introducir el dato*/
	}


}
