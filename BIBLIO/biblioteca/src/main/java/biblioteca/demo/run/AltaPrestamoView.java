package biblioteca.demo.run;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.Box;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AltaPrestamoView {
	protected JFrame frmBiblioteca;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public AltaPrestamoView() {
		initialize();
	}
	
	private void initialize() { //para que te inicialicen los atributos
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setBackground(new Color(255, 255, 255));
		frmBiblioteca.setTitle("AÑADIR PRÉSTAMO");
		frmBiblioteca.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce ISBN:");
		lblNewLabel.setBounds(24, 28, 104, 20);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
		JLabel lblIntroduceIsbn = new JLabel("Introduce socio:");
		lblIntroduceIsbn.setBounds(24, 69, 104, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceIsbn);
		
		JLabel lblIntroduceFechaPrstamo = new JLabel("Introduce fecha préstamo:");
		lblIntroduceFechaPrstamo.setBounds(24, 112, 134, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceFechaPrstamo);
		
		JLabel lblIntroduceFechaDevolucin = new JLabel("Introduce fecha devolución:");
		lblIntroduceFechaDevolucin.setBounds(24, 156, 144, 20);
		frmBiblioteca.getContentPane().add(lblIntroduceFechaDevolucin);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(132, 28, 139, 20);
		frmBiblioteca.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setColumns(10);
		textField_1.setBounds(132, 69, 139, 20);
		frmBiblioteca.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setColumns(10);
		textField_2.setBounds(168, 112, 103, 20);
		frmBiblioteca.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setColumns(10);
		textField_3.setBounds(168, 156, 103, 20);
		frmBiblioteca.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(323, 56, 101, 23);
		frmBiblioteca.getContentPane().add(btnNewButton);
		
		JButton btnRestaurar = new JButton("Restaurar");
		btnRestaurar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRestaurar.setForeground(SystemColor.textHighlight);
		btnRestaurar.setBounds(323, 91, 101, 23);
		frmBiblioteca.getContentPane().add(btnRestaurar);
		
		JButton btnNewButton_1 = new JButton("CERRAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(328, 155, 89, 23);
		frmBiblioteca.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mañana\\Desktop\\logo pequeñin.png"));
		lblNewLabel_1.setBounds(373, 216, 51, 34);
		frmBiblioteca.getContentPane().add(lblNewLabel_1);
		
	}
}