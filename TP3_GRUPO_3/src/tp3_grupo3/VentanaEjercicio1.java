package tp3_grupo3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaEjercicio1 extends JFrame{

	public VentanaEjercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(375,40,500,500);
		setTitle("Ejercicio 1");
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

		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(50,150,92,26);
		getContentPane().add(lblTelefono);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setBounds(152,150,202,26);
		getContentPane().add(txtTelefono);

		
		JLabel lblFechaNac = new JLabel("Fecha Nac.:");
		lblFechaNac.setBounds(50,200,100,26);
		getContentPane().add(lblFechaNac);
		
		JTextField txtFechaNac = new JTextField();
		txtFechaNac.setBounds(152,200,202,26);
		getContentPane().add(txtFechaNac);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(265, 262, 89, 23);
		getContentPane().add(btnMostrar);
		
		JLabel lblDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblDatosIngresados.setBounds(30, 314, 170, 14);
		getContentPane().add(lblDatosIngresados);
		
		JLabel lblMostrarDatos = new JLabel("");
		lblMostrarDatos.setBounds(205, 314, 269, 14);
		getContentPane().add(lblMostrarDatos);

	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(estado);
	}
}
