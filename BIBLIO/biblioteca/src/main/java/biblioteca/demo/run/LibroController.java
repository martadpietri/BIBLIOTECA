package biblioteca.demo.run;

import java.sql.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class LibroController {

    private LibroModel model;
    private LibroView view;

    // Constructor
    public LibroController() {
        
    }

	public void setVistaModel(LibroView libroView, LibroModel libroModel) {
		// TODO Auto-generated method stub
		this.view = libroView;
        this.model = libroModel;
	}
	
	public LibroView getView() {
		return view;
	}

	public void setView(LibroView view) {
		this.view = view;
	}

	public LibroModel getModel() {
		return model;
	}

	public void setModel(LibroModel model) {
		this.model = model;
	}

	public void cargaDatosLibro(String text) {
		
		List<Object[]> lista = null; // Creo la lista vacia
		
		lista = this.model.cargaDatosLibro(text); // Se llena con los datos que coge el modelo hecho en LibroModel con la base de datos
		
		int i;
		
		for (i=0;i<lista.size();i++) {
			this.view.getModeloLista().addRow(lista.get(i)); // Aqui la va leyendo y la va seprando
		}
		
	}}