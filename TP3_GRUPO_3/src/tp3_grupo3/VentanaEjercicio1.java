package tp3_grupo3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;

public class VentanaEjercicio1 extends JFrame{

	public VentanaEjercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(375,40,500,500);
		setTitle("Contacto");
		setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(50,50,92,26);
		getContentPane().add(lblNombre);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(152,50,202,26);
		getContentPane().add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(50,100,92,26);
		getContentPane().add(lblApellido);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setBounds(152,100,202,26);
		getContentPane().add(txtApellido);

		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(50,150,92,26);
		getContentPane().add(lblTelefono);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setBounds(152,150,202,26);
		getContentPane().add(txtTelefono);
				
		JLabel lblFechaNac = new JLabel("Fecha Nac.:");
		lblFechaNac.setBounds(50,200,100,26);
		getContentPane().add(lblFechaNac);
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		JFormattedTextField txtFechaNac = new JFormattedTextField(format);
		txtFechaNac.setBounds(152, 202, 202, 23);
		getContentPane().add(txtFechaNac);
		
		JLabel lblFechaNacAclaracion = new JLabel("(dd/mm/aaaa)");
		lblFechaNacAclaracion.setBounds(364, 206, 120, 14);
		getContentPane().add(lblFechaNacAclaracion);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(265, 262, 89, 23);
		getContentPane().add(btnMostrar);
		
		JLabel lblDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblDatosIngresados.setBounds(30, 314, 170, 14);
		getContentPane().add(lblDatosIngresados);
		
		JLabel lblMostrarDatos1 = new JLabel("");
		lblMostrarDatos1.setBounds(205, 314, 269, 14);
		getContentPane().add(lblMostrarDatos1);
		
		JLabel lblMostrarDatos2 = new JLabel("");
		lblMostrarDatos2.setBounds(205, 340, 269, 14);
		getContentPane().add(lblMostrarDatos2);
		
		JLabel lblMostrarDatos3 = new JLabel("");
		lblMostrarDatos3.setBounds(205, 365, 269, 14);
		getContentPane().add(lblMostrarDatos3);
		
		JLabel lblMostrarDatos4 = new JLabel("");
		lblMostrarDatos4.setBounds(205, 390, 269, 14);
		getContentPane().add(lblMostrarDatos4);

		txtTelefono.addKeyListener(new KeyAdapter()
		{
		   public void keyTyped(KeyEvent e)
		   {
		      char caracter = e.getKeyChar();
		      if(((caracter < '0') ||
		         (caracter > '9')) &&
		         (caracter != '\b' /*BACK_SPACE*/))
		      {
		         e.consume();  // ignora el evento de teclado
		      }
		   }
		});
		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				boolean incompleto=false;
				
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
					incompleto=true;
				}else {
					txtNombre.setBackground(Color.WHITE);
				}
									
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.RED);
					incompleto=true;
				}else {
					txtApellido.setBackground(Color.WHITE);
				}
				
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
					incompleto=true;
				}else {
					txtTelefono.setBackground(Color.WHITE);
				}
				
				if(txtFechaNac.getText().isEmpty()) {
					txtFechaNac.setBackground(Color.RED);
					incompleto=true;
				}else {
					txtFechaNac.setBackground(Color.WHITE);
				}
				
				if(incompleto==false) {
					lblMostrarDatos1.setText("Nombre: "+txtNombre.getText());
					lblMostrarDatos2.setText("Apellido: "+txtApellido.getText());
					lblMostrarDatos3.setText("Telefono: "+txtTelefono.getText());
					lblMostrarDatos4.setText("Fecha Nac.: "+txtFechaNac.getText());
					
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFechaNac.setText("");
				}else {
					lblMostrarDatos1.setText("");
					lblMostrarDatos2.setText("");
					lblMostrarDatos3.setText("");
					lblMostrarDatos4.setText("");
				}
			}
		});
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(estado);
	}
}
