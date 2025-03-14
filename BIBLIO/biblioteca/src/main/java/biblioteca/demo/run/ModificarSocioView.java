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
import java.awt.event.FocusAdapter; //FocusAdapter es una clase abstracta que implementa la interfaz FocusListener pero con 
									//implementaciones vacías de los métodos. En lugar de tener que implementar todos los métodos 
									//de la interfaz FocusListener, puedes extender FocusAdapter y sobrescribir solo los métodos que necesitas

import java.awt.event.FocusEvent; // FocusEvent se utiliza en la programación de interfaces gráficas para capturar y gestionar situaciones en 
								  // las que un componente de la interfaz (como un JTextField, JButton, JTextArea, etc.) obtiene o pierde el enfoque.
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ModificarSocioView {
	protected JFrame frmBiblioteca;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblIntroduceTtulo;
	private JLabel lblIntroduceAutor;
	private JLabel lblIntroduceEdicin;
	private JLabel lblIntroduceCategora;
	private JLabel lblNewLabel;
	
	public ModificarSocioView() {
		initialize();
	}
	
	private void initialize() { //para que te inicialicen los atributos
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setBackground(new Color(255, 255, 255));
		frmBiblioteca.setTitle("MODIFICAR SOCIO");
		frmBiblioteca.getContentPane().setLayout(null);
		frmBiblioteca.setBounds(500, 200, 455, 301); // Para que cuando lo ejecuto se aplie en un tamaño predeterminado
		
		textField = new JTextField();
		// Añadir un FocusListener para manejar el texto de marcador de posición
		// utilizar un FocusListener que detecte cuando el campo de texto recibe el foco, eliminando el texto por defecto cuando el usuario empieza a escribir
		textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                // Si el campo tiene el texto por defecto, lo borramos cuando obtiene el foco
                if (textField.getText().equals("               <DNI/cod.>")) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK); // Cambiar el color del texto cuando el usuario empieza a escribir
                }
            }

            public void focusLost(FocusEvent e) {
                // Si el campo está vacío, restauramos el texto por defecto
                if (textField.getText().isEmpty()) {
                    textField.setText("               <DNI/cod.>");
                    textField.setForeground(Color.GRAY); // Cambiar el color del texto a gris cuando está vacío
                }
            }
        });
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setText("               <DNI/cod.>");
		textField.setBackground(SystemColor.activeCaption);
		textField.setBounds(71, 27, 150, 20);
		frmBiblioteca.getContentPane().add(textField);
		textField.setColumns(10);
		 
        
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setColumns(10);
		textField_1.setBounds(143, 69, 130, 20);
		frmBiblioteca.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setColumns(10);
		textField_2.setBounds(143, 112, 130, 20);
		frmBiblioteca.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setColumns(10);
		textField_3.setBounds(184, 156, 89, 20);
		frmBiblioteca.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.inactiveCaptionBorder);
		textField_4.setColumns(10);
		textField_4.setBounds(143, 202, 130, 20);
		frmBiblioteca.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(323, 56, 101, 23);
		frmBiblioteca.getContentPane().add(btnNewButton);
		
		JButton btnRestaurar = new JButton("Restaurar");
		btnRestaurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		lblIntroduceTtulo = new JLabel("Introduce nombre:");
		lblIntroduceTtulo.setBounds(24, 69, 130, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceTtulo);
		
		lblIntroduceAutor = new JLabel("Trabajador (S/N):");
		lblIntroduceAutor.setBounds(24, 112, 130, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceAutor);
		
		lblIntroduceEdicin = new JLabel("Fecha de nacimiento (DOB):");
		lblIntroduceEdicin.setBounds(24, 156, 172, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceEdicin);
		
		lblIntroduceCategora = new JLabel("Más información:");
		lblIntroduceCategora.setBounds(24, 202, 130, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceCategora);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel.setBounds(373, 216, 51, 34);
		frmBiblioteca.getContentPane().add(lblNewLabel);
	}
}