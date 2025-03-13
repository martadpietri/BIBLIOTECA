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

import net.miginfocom.swing.MigLayout;
import javax.swing.JPasswordField;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;

public class BibliotecaView {
	protected JFrame frmBiblioteca;
	private JTextField txtIntroduzcaElIsbn;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnPrstamo;
	private JButton btnSocio;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public BibliotecaView() { // El constructor (se suele llamar igual que en la clase y tiene que ser publico), lo que hace es crear un objeto de una clase
		initialize();
	}
	private void initialize() { //para que te inicialicen los atributos
		frmBiblioteca = new JFrame();
		frmBiblioteca.setTitle("BIBLIOTECA MUNICIPAL");
		frmBiblioteca.getContentPane().setBackground(Color.WHITE);
		frmBiblioteca.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("LIBRO");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(65, 53, 101, 23);
		frmBiblioteca.getContentPane().add(btnNewButton);
		//Para asociar lo botones
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Abre la vista LibroView al hacer clic en el botón
		        new LibroView().frmBiblioteca.setVisible(true); // Abre la ventana LibroView
		        frmBiblioteca.setVisible(false); // Opcional: oculta la ventana BibliotecaView
		    }
		});
		
		btnPrstamo = new JButton("PRÉSTAMO");
		btnPrstamo.setForeground(SystemColor.textHighlight);
		btnPrstamo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPrstamo.setBounds(65, 98, 101, 23);
		frmBiblioteca.getContentPane().add(btnPrstamo);
		
		btnSocio = new JButton("SOCIO");
		btnSocio.setForeground(SystemColor.textHighlight);
		btnSocio.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSocio.setBounds(65, 143, 101, 23);
		frmBiblioteca.getContentPane().add(btnSocio);
		
		lblNewLabel = new JLabel("GESTIÓN DE LA BIBLIOTECA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(0, 58, 117));
		lblNewLabel.setBounds(55, 0, 212, 43);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo peque.png"));
		lblNewLabel_1.setBounds(240, 123, 64, 43);
		frmBiblioteca.getContentPane().add(lblNewLabel_1);
		frmBiblioteca.setBackground(new Color(255, 255, 255));
		
	}
	//Hay que crear el main para que despues deje vincular botones
	public static void main(String[] args) {
        // Crea una instancia de la clase BibliotecaView
        BibliotecaView window = new BibliotecaView();
        // Haz visible la ventana principal
        window.frmBiblioteca.setVisible(true);
    }
}
