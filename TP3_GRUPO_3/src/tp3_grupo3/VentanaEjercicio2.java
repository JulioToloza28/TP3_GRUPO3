package tp3_grupo3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentanaEjercicio2 extends JFrame 
{
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	public VentanaEjercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(350,15,500,500);
		setTitle("Promedio");
		getContentPane().setLayout(null);
		
		JPanel PanelNotas1 = new JPanel();
		PanelNotas1.setForeground(Color.BLACK);
		PanelNotas1.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237)), "Notas del estudiante:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelNotas1.setBounds(16, 21, 282, 229);
		getContentPane().add(PanelNotas1);
		PanelNotas1.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		//lblNota1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota1.setBounds(21, 41, 59, 26);
		PanelNotas1.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		//lblNota2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota2.setBounds(21, 82, 59, 26);
		PanelNotas1.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		//lblNota3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota3.setBounds(21, 123, 59, 26);
		PanelNotas1.add(lblNota3);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(76, 48, 165, 19);
		PanelNotas1.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(76, 89, 166, 19);
		PanelNotas1.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(76, 129, 166, 19);
		PanelNotas1.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblTps = new JLabel("TPS");
		//lblTps.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTps.setBounds(21, 170, 34, 26);
		PanelNotas1.add(lblTps);
		
		JComboBox cmbTps = new JComboBox();
		cmbTps.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		//cmbTps.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbTps.setBounds(76, 173, 165, 21);
		PanelNotas1.add(cmbTps);
		
		JPanel PanelNotas2 = new JPanel();
		PanelNotas2.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237)), "Notas del estudiante:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelNotas2.setBounds(16, 252, 282, 197);
		getContentPane().add(PanelNotas2);
		PanelNotas2.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio: ");
		//lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPromedio.setBounds(19, 48, 67, 26);
		PanelNotas2.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		//lblCondicion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCondicion.setBounds(19, 122, 67, 26);
		PanelNotas2.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(105, 52, 156, 20);
		PanelNotas2.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(105, 124, 156, 20);
		PanelNotas2.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(UIManager.getColor("CheckBox.shadow"));
		//btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCalcular.setBounds(310, 72, 141, 35);
		getContentPane().add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setForeground(UIManager.getColor("CheckBox.shadow"));
		//btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNuevo.setBounds(310, 128, 141, 35);
		getContentPane().add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(UIManager.getColor("CheckBox.shadow"));
		//btnSalir.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSalir.setBounds(310, 184, 141, 35);
		getContentPane().add(btnSalir);
		setVisible(true);
	}
	
	public void cambiarVisibilidad(boolean estado) 
	{
		setVisible(estado);
	}
}
