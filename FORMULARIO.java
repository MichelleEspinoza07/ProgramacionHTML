package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FORMULARIO extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FORMULARIO frame = new FORMULARIO();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FORMULARIO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setBounds(99, 93, 46, 14);
		contentPane.add(lblNewLabel);
		
		nombre = new JTextField();
		nombre.setBounds(155, 90, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(99, 124, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		apellido = new JTextField();
		apellido.setBounds(155, 121, 86, 20);
		contentPane.add(apellido);
		apellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Rango");
		lblNewLabel_2.setBounds(99, 164, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FORMULARIO");
		lblNewLabel_3.setBounds(195, 11, 86, 20);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Ingresar ");
		btnNewButton.setBounds(155, 218, 86, 23);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(261, 90, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(261, 121, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Demostrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(272, 218, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox rango = new JComboBox();
		rango.setBounds(155, 160, 86, 22);
		contentPane.add(rango);
	}
}
