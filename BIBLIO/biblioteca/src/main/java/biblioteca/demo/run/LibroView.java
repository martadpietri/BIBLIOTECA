package biblioteca.demo.run;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class LibroView {
	protected JFrame frmBiblioteca;
	private JTextField txtIntroduzcaElIsbn;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField txtLibreria;
	private JTable table_1;
	
	public LibroView() { // El constructor (se suele llamar igual que en la clase y tiene que ser publico), lo que hace es crear un objeto de una clase
		initialize();
	}
	private void initialize() { //para que te inicialicen los atributos
		frmBiblioteca = new JFrame();
		frmBiblioteca.setTitle("LIBRO");
		//frmBiblioteca.setBounds(0, 0, 496, 496);
		frmBiblioteca.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][grow][][][][]"));
		
		txtLibreria = new JTextField();
		txtLibreria.setText("Introduzca el ISBN del libro");
		frmBiblioteca.getContentPane().add(txtLibreria, "cell 0 0,growx");
		txtLibreria.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir ");
		frmBiblioteca.getContentPane().add(btnNewButton, "flowx,cell 0 1");
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		frmBiblioteca.getContentPane().add(btnNewButton_1, "cell 0 1");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		frmBiblioteca.getContentPane().add(scrollPane_1, "cell 0 2 1 5,grow");
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "T\u00CDTULO", "AUTOR", "EDICI\u00D3N"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
	}		
}
