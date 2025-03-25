package biblioteca.demo.util;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent; //Hay que importarlo para que te deje vincular botones con vistas
import java.awt.event.ActionListener; //Hay que importarlo para que te deje vincular botones con vistas

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
		private JLabel lblNewLabel_2;
		private JButton btnEnter;
		
		public SwingMain() {
			initialize();
		}
		private void initialize() { //para que te inicialicen los atributos
			frmBiblioteca = new JFrame();
			frmBiblioteca.setTitle("BIBLIOTECA MUNICIPAL");
			frmBiblioteca.getContentPane().setBackground(Color.WHITE);
			frmBiblioteca.setBackground(new Color(255, 255, 255));
			frmBiblioteca.getContentPane().setLayout(null);
			frmBiblioteca.setBounds(500, 200, 442, 290); // Para que cuando lo ejecuto se aplie en un tamaño predeterminado
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\ovd.png"));
			lblNewLabel.setBounds(10, 11, 369, 76);
			frmBiblioteca.getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					textField .setText("");
				}
				
			});
			textField.setBackground(new Color(236, 245, 255));
			textField.setForeground(Color.GRAY);
			textField.setText("                      <usuario>");
			textField.setBounds(47, 174, 186, 20);
			frmBiblioteca.getContentPane().add(textField);
			textField.setColumns(10);
			
			passwordField = new JPasswordField();
			// Añadir un FocusListener para manejar el texto de marcador de posición
			// utilizar un FocusListener que detecte cuando el campo de texto recibe el foco, eliminando el texto por defecto cuando el usuario empieza a escribir
			passwordField.addFocusListener(new FocusAdapter() {
	            public void focusGained(FocusEvent e) {
	                // Si el campo tiene el texto por defecto, lo borramos cuando obtiene el foco
	                if (passwordField.getText().equals("*******************")) {
	                	passwordField.setText("");
	                	passwordField.setForeground(Color.BLACK); // Cambiar el color del texto cuando el usuario empieza a escribir
	                }
	            }

	            public void focusLost(FocusEvent e) {
	                // Si el campo está vacío, restauramos el texto por defecto
	                if (passwordField.getText().isEmpty()) {
	                	passwordField.setText("*******************");
	                	passwordField.setForeground(Color.GRAY); // Cambiar el color del texto a gris cuando está vacío
	                }
	            }
	        });
			passwordField.setBackground(new Color(236, 245, 255));
			passwordField.setForeground(Color.GRAY);
			passwordField.setText("*******************");
			passwordField.setEchoChar('*');
			passwordField.setToolTipText("");
			passwordField.setBounds(47, 205, 186, 20);
			frmBiblioteca.getContentPane().add(passwordField);
			
			JButton btnEnter = new JButton("ENTER");
			btnEnter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BibliotecaController controller = new BibliotecaController();
					controller.setVistaModel(new BibliotecaView(controller), new BibliotecaModel());
				}
			});
			btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnEnter.setForeground(SystemColor.textHighlight);
			btnEnter.setBounds(300, 186, 79, 23);
			frmBiblioteca.getContentPane().add(btnEnter);
			
			lblNewLabel_2 = new JLabel(" VERIFICACIÓN DE USUARIO");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setForeground(new Color(2, 74, 155));
			lblNewLabel_2.setBounds(112, 108, 215, 20);
			frmBiblioteca.getContentPane().add(lblNewLabel_2);
			
			//LO QUE HAY QUE AÑADIR EN EL EXAMEN
			Database db=new Database(); //Creo la base de datos de prueba
			db.createDatabase(false); // Le paso el valor falso porque considero que no esta creada aun
			db.loadDatabase(); // Cargo datos de prueba
			
		}
		 // Para que la ventana se abra correctamente al ejecutar el programa, se necesita añadir un método main() en la clase SwingMain
	    public static void main(String[] args) {
	        // Usar EventQueue para asegurar que la interfaz gráfica se ejecute en el hilo adecuado
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    SwingMain window = new SwingMain();
	                    window.frmBiblioteca.setVisible(true); // Hacer visible la ventana
	                } catch (Exception e) {
	                    e.printStackTrace(); // Si ocurre algún error, se imprime en la consola
	                }
	            }
	        });
	    }
}
