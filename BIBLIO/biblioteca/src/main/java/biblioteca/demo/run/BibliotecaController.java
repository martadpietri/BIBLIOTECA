package biblioteca.demo.run;

public class BibliotecaController {
	private BibliotecaModel model;
	private BibliotecaView view;
	private BibliotecaController controller;

	
	//El controlador tendrá una vista y un modelo que se inicializarán cuando se instancie un objeto de la
	// clase. La vista y el modelo se crearán cuando se inicialice el controlador.
	public void setVistaModel (BibliotecaView v, BibliotecaModel m) {
		this.model = m;
		this.view = v;
		// no hay inicializacion especifica del modelo, solo de la vista
		this.view.getFrame().setVisible(true);
		
	}
}

