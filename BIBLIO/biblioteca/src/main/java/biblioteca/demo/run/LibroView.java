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
import java.awt.event.ActionEvent; //Hay que importarlo para que te deje vincular botones con vistas
import java.awt.event.ActionListener; //Hay que importarlo para que te deje vincular botones con vistas
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		frmBiblioteca.getContentPane().setBackground(new Color(255, 255, 255));
		frmBiblioteca.setBackground(new Color(255, 255, 255));
		frmBiblioteca.setTitle("LIBRO");
		frmBiblioteca.getContentPane().setLayout(null);
		frmBiblioteca.setBounds(500, 200, 455, 301); // Para que cuando lo ejecuto se aplie en un tamaño predeterminado
		
		txtLibreria = new JTextField();
		txtLibreria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLibreria.setText("");
			}
			
		});
		


		txtLibreria.setBounds(7, 7, 349, 20);
		txtLibreria.setText("<Introduzca el ISBN del libro>");
		frmBiblioteca.getContentPane().add(txtLibreria);
		txtLibreria.setColumns(10);
		
		JButton btnAnadir = new JButton("Añadir "); // Cambie a mano lo nombres de los botones y los incluí en la clase LibroView
		btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadir.addActionListener(new ActionListener() { // Al importa la librería se me activo solo, solo queda asociarlo a la vista
			public void actionPerformed(ActionEvent e) {
				new AñadirLibroView().frmBiblioteca.setVisible(true); // Abre la ventana AñadirLibroView
		        // frmBiblioteca.setVisible(false); Opcional: oculta la ventana BibliotecaView
			}
		});
		
		btnAnadir.setForeground(SystemColor.textHighlight);
		btnAnadir.setBounds(7, 34, 78, 23);
		frmBiblioteca.getContentPane().add(btnAnadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setForeground(SystemColor.textHighlight);
		btnEliminar.setBounds(81, 34, 89, 23);
		frmBiblioteca.getContentPane().add(btnEliminar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(7, 68, 420, 186);
		frmBiblioteca.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setForeground(SystemColor.textHighlight);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "T\u00CDTULO", "AUTOR", "EDICI\u00D3N", "CAT"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setForeground(SystemColor.textHighlight);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setBounds(356, 6, 78, 23);
		frmBiblioteca.getContentPane().add(btnEnter);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel.setBounds(381, 34, 43, 32);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
	}		
}
