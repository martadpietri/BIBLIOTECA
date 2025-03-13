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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

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
		
		txtLibreria = new JTextField();
		txtLibreria.setBounds(7, 7, 349, 20);
		txtLibreria.setText("<Introduzca el ISBN del libro>");
		frmBiblioteca.getContentPane().add(txtLibreria);
		txtLibreria.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(7, 34, 78, 23);
		frmBiblioteca.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(81, 34, 78, 23);
		frmBiblioteca.getContentPane().add(btnNewButton_1);
		
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
		
		JButton btnNewButton_2 = new JButton("ENTER");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(SystemColor.textHighlight);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(356, 6, 78, 23);
		frmBiblioteca.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel.setBounds(381, 34, 43, 32);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
	}		
}
