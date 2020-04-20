package tp3_grupo3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		btnEjer1.addActionListener(new eventoBoton1());
		getContentPane().add(btnEjer1);
		
		
		// boton de ejercicio2
		btnEjer2=new JButton();
		btnEjer2.setText("Ejercicio 2");
		btnEjer2.setBounds(180, 200, 140, 30);
		btnEjer2.addActionListener(new eventoBoton2());
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

	class eventoBoton1 implements ActionListener
	{
		public eventoBoton1() {}
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			VentanaEjercicio1 ejerc1 = new VentanaEjercicio1();
			ejerc1.cambiarVisibilidad(true);
		}
	}
	
	class eventoBoton2 implements ActionListener
	{
		public eventoBoton2() {}
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			VentanaEjercicio2 ejerc2 = new VentanaEjercicio2();
			ejerc2.cambiarVisibilidad(true);
		}
		
	}
