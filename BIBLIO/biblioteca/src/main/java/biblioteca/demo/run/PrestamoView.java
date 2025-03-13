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
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PrestamoView {
	protected JFrame frmBiblioteca;
	private JTextField txtIntroduzcaElIsbn;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField txtLibreria;
	private JTable table_1;
	
	public PrestamoView() { // El constructor (se suele llamar igual que en la clase y tiene que ser publico), lo que hace es crear un objeto de una clase
		initialize();
	}
	private void initialize() { //para que te inicialicen los atributos
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setBackground(new Color(255, 255, 255));
		frmBiblioteca.setTitle("PRÉSTAMO");
		frmBiblioteca.getContentPane().setLayout(null);
		
		txtLibreria = new JTextField();
		txtLibreria.setBounds(7, 7, 350, 20);
		txtLibreria.setText("<Introduzca el ISBN del libro>");
		frmBiblioteca.getContentPane().add(txtLibreria);
		txtLibreria.setColumns(10);
		
		JButton btnNewButton = new JButton("Alta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(7, 34, 79, 23);
		frmBiblioteca.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Baja");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(81, 34, 79, 23);
		frmBiblioteca.getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(7, 64, 420, 190);
		frmBiblioteca.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "SOCIO", "FECHA PRES", "FECHA DEV"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_2 = new JButton("ENTER");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(SystemColor.textHighlight);
		btnNewButton_2.setBounds(355, 6, 79, 23);
		frmBiblioteca.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel.setBounds(381, 34, 43, 32);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
	}		
}