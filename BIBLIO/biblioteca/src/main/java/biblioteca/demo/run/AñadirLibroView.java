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
import java.awt.SystemColor;
import javax.swing.Box;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AñadirLibroView {
	protected JFrame frmBiblioteca;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JLabel lblIntroduceTtulo;
	private JLabel lblIntroduceAutor;
	private JLabel lblIntroduceEdicin;
	private JLabel lblIntroduceCategora;
	private JLabel lblNewLabel_1;
	
	public AñadirLibroView() {
		initialize();
	}
	
	private void initialize() { //para que te inicialicen los atributos
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setBackground(new Color(255, 255, 255));
		frmBiblioteca.setTitle("AÑADIR LIBRO");
		frmBiblioteca.getContentPane().setLayout(null);
		frmBiblioteca.setBounds(500, 200, 466, 293); // Para que cuando lo ejecuto se aplie en un tamaño predeterminado
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(123, 28, 150, 20);
		frmBiblioteca.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setColumns(10);
		textField_1.setBounds(123, 69, 144, 20);
		frmBiblioteca.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setColumns(10);
		textField_2.setBounds(123, 112, 150, 20);
		frmBiblioteca.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setColumns(10);
		textField_3.setBounds(123, 156, 150, 20);
		frmBiblioteca.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.inactiveCaptionBorder);
		textField_4.setColumns(10);
		textField_4.setBounds(184, 202, 89, 20);
		frmBiblioteca.getContentPane().add(textField_4);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAñadir.setForeground(SystemColor.textHighlight);
		btnAñadir.setBounds(323, 56, 101, 23);
		frmBiblioteca.getContentPane().add(btnAñadir);                                                  
		
		
		JButton btnRestaurar = new JButton("Restaurar");
		btnRestaurar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				// Recorra cada JTextField y lo vacia a traves del método setText("")
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
			}
		});
		btnRestaurar.setForeground(SystemColor.textHighlight);
		btnRestaurar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRestaurar.setBounds(323, 91, 101, 23);
		frmBiblioteca.getContentPane().add(btnRestaurar);
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.setForeground(SystemColor.textHighlight);
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrar.setBounds(328, 155, 89, 23);
		frmBiblioteca.getContentPane().add(btnCerrar);
		btnCerrar.addActionListener(new ActionListener() { // Tengo que activar el botón
            public void actionPerformed(ActionEvent e) {
                frmBiblioteca.dispose(); // El método para que se cierre la ventana
            }
        });
        frmBiblioteca.getContentPane().add(btnCerrar);
		
		lblNewLabel = new JLabel("Introduce ISBN:");
		lblNewLabel.setBounds(24, 28, 104, 20);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
		lblIntroduceTtulo = new JLabel("Introduce título:");
		lblIntroduceTtulo.setBounds(24, 69, 104, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceTtulo);
		
		lblIntroduceAutor = new JLabel("Introduce autor:");
		lblIntroduceAutor.setBounds(24, 112, 104, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceAutor);
		
		lblIntroduceEdicin = new JLabel("Introduce edición:");
		lblIntroduceEdicin.setBounds(24, 156, 104, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceEdicin);
		
		lblIntroduceCategora = new JLabel("Introduce categoría (±14):");
		lblIntroduceCategora.setBounds(24, 202, 150, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceCategora);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel_1.setBounds(373, 216, 51, 34);
		frmBiblioteca.getContentPane().add(lblNewLabel_1);
	}
}