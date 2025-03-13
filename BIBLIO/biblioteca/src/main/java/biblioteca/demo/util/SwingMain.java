package biblioteca.demo.util;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import biblioteca.demo.run.*;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
/*public class SwingMain {

	private JFrame frmBibliotecaMunicipal;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					SwingMain window = new SwingMain();
					window.frmBibliotecaMunicipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	} */


	public class SwingMain {
		protected JFrame frmBiblioteca;
		private JTextField txtIntroduzcaElIsbn;
		private JScrollPane scrollPane;
		private JTable table;
		private JTextField textField;
		private JPasswordField passwordField;
		private JLabel lblNewLabel_1;
		private JLabel lblNewLabel_2;
		
		public SwingMain() {
			initialize();
		}
		private void initialize() { //para que te inicialicen los atributos
			frmBiblioteca = new JFrame();
			frmBiblioteca.setTitle("BIBLIOTECA MUNICIPAL");
			frmBiblioteca.getContentPane().setBackground(Color.WHITE);
			frmBiblioteca.setBackground(new Color(255, 255, 255));
			frmBiblioteca.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\ovd.png"));
			lblNewLabel.setBounds(10, 11, 369, 76);
			frmBiblioteca.getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBackground(new Color(236, 245, 255));
			textField.setForeground(Color.GRAY);
			textField.setText("    <usuario>");
			textField.setBounds(47, 174, 86, 20);
			frmBiblioteca.getContentPane().add(textField);
			textField.setColumns(10);
			
			passwordField = new JPasswordField();
			passwordField.setBackground(new Color(236, 245, 255));
			passwordField.setForeground(Color.GRAY);
			passwordField.setText("**********");
			passwordField.setEchoChar('*');
			passwordField.setToolTipText("");
			passwordField.setBounds(47, 205, 129, 20);
			frmBiblioteca.getContentPane().add(passwordField);
			
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\biblio2.PNG"));
			lblNewLabel_1.setBounds(297, 152, 99, 87);
			frmBiblioteca.getContentPane().add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel(" VERIFICACIÓN DE USUARIO");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setForeground(new Color(2, 74, 155));
			lblNewLabel_2.setBounds(112, 108, 215, 20);
			frmBiblioteca.getContentPane().add(lblNewLabel_2);
			
		}
	
	
}
