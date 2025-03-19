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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		frmBiblioteca.setBounds(500, 200, 455, 301); // Para que cuando lo ejecuto se aplie en un tamaño predeterminado
		
		txtLibreria = new JTextField();
		txtLibreria = new JTextField();
		// Para que cuando clique encima para escribir el ISBN se borre el mensaje y salga solo lo que escribes
		txtLibreria.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								txtLibreria.setText("");
							}
						});
				
		/*txtLibreria.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                // Si el campo tiene el texto por defecto, lo borramos cuando obtiene el foco
                if (txtLibreria.getText().equals("<Introduzca el ISBN del libro>")) {
                	txtLibreria.setText("");
                	txtLibreria.setForeground(Color.BLACK); // Cambiar el color del texto cuando el usuario empieza a escribir
                }
            }

            public void focusLost(FocusEvent e) {
                // Si el campo está vacío, restauramos el texto por defecto
                if (txtLibreria.getText().isEmpty()) {
                	txtLibreria.setText("<Introduzca el ISBN del libro>");
                	txtLibreria.setForeground(Color.GRAY); // Cambiar el color del texto a gris cuando está vacío
                }
            }
        });*/
		
		txtLibreria.setBounds(7, 7, 350, 20);
		txtLibreria.setText("<Introduzca el ISBN del libro>");
		frmBiblioteca.getContentPane().add(txtLibreria);
		txtLibreria.setColumns(10);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AltaPrestamoView().frmBiblioteca.setVisible(true);
			}
		});
		btnAlta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlta.setForeground(SystemColor.textHighlight);
		btnAlta.setBounds(7, 34, 79, 23);
		frmBiblioteca.getContentPane().add(btnAlta);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBaja.setForeground(SystemColor.textHighlight);
		btnBaja.setBounds(81, 34, 79, 23);
		frmBiblioteca.getContentPane().add(btnBaja);
		
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
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setForeground(SystemColor.textHighlight);
		btnEnter.setBounds(355, 6, 79, 23);
		frmBiblioteca.getContentPane().add(btnEnter);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel.setBounds(381, 34, 43, 32);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
	}		
}