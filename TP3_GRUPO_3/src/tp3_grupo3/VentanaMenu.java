package tp3_grupo3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VentanaMenu extends JFrame{
	
	private JButton btnEjer1;
	private JButton btnEjer2;
	private JButton btnEjer3;
	
	public VentanaMenu() 
	{
		//Ventana Principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(350,15,500,500);
		setTitle("Menu Principal");
		setVisible(true);
		setLayout(null);
		
		JLabel lblGrupo = new JLabel("GRUPO Nro:3");
		lblGrupo.setBounds(215, 21, 92, 26);
		getContentPane().add(lblGrupo);
		
		// boton de ejercicio1
		btnEjer1=new JButton();
		btnEjer1.setText("Ejercicio 1");
		btnEjer1.setBounds(180, 100, 140, 30);
		getContentPane().add(btnEjer1);
		
		// boton de ejercicio2
		btnEjer2=new JButton();
		btnEjer2.setText("Ejercicio 2");
		btnEjer2.setBounds(180, 200, 140, 30);
		getContentPane().add(btnEjer2);

		// boton de ejercicio3
		btnEjer3=new JButton();
		btnEjer3.setText("Ejercicio 3");
		btnEjer3.setBounds(180, 300, 140, 30);
		getContentPane().add(btnEjer3);
			
	}
	public void cambiarVisibilidad(boolean estado) {
		setVisible(estado);
	}

}
