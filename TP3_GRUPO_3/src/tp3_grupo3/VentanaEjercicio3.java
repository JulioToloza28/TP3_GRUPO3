package tp3_grupo3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Checkbox;

import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;

public class VentanaEjercicio3 extends JFrame 
{
	private JTextField txtCantHoras;
	public VentanaEjercicio3() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(350,15,500,500);
		setTitle("Seleccion Multiple");
		getContentPane().setLayout(null);
		
		JPanel PanelSistemaOperativo = new JPanel();
		PanelSistemaOperativo.setForeground(Color.BLACK);
		PanelSistemaOperativo.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelSistemaOperativo.setBounds(16, 25, 458, 75);
		getContentPane().add(PanelSistemaOperativo);
		
		JLabel lblNota1 = new JLabel("Elije un Sistema Operativo");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_PanelSistemaOperativo = new GroupLayout(PanelSistemaOperativo);
		gl_PanelSistemaOperativo.setHorizontalGroup(
			gl_PanelSistemaOperativo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_PanelSistemaOperativo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNota1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(rdbtnWindows)
					.addGap(18)
					.addComponent(rdbtnMac)
					.addGap(19)
					.addComponent(rdbtnLinux)
					.addGap(23))
		);
		gl_PanelSistemaOperativo.setVerticalGroup(
			gl_PanelSistemaOperativo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelSistemaOperativo.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_PanelSistemaOperativo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnLinux)
						.addComponent(rdbtnWindows)
						.addComponent(rdbtnMac))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		PanelSistemaOperativo.setLayout(gl_PanelSistemaOperativo);
		
		//PARA AGRUPAR LOS OPTION BUTTON 
		// Y SOLO PODAMOS ELEGIR UNO
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnLinux);
		grupo1.add(rdbtnWindows);
		grupo1.add(rdbtnMac);
		
		JPanel PanelEspecialidad = new JPanel();
		PanelEspecialidad.setBounds(16, 111, 458, 135);
		getContentPane().add(PanelEspecialidad);
		PanelEspecialidad.setBorder(new TitledBorder(new LineBorder(new Color(100, 149, 237)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelEspecialidad.setLayout(null);
		
		JLabel lblElijaUnaEspecialidad = new JLabel("Elije una Especialidad");
		lblElijaUnaEspecialidad.setBounds(21, 49, 121, 14);
		lblElijaUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		PanelEspecialidad.add(lblElijaUnaEspecialidad);
		
		JCheckBox ckProgramacion = new JCheckBox("Programacion");
		ckProgramacion.setBounds(228, 21, 105, 23);
		ckProgramacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		PanelEspecialidad.add(ckProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(228, 57, 121, 23);
		chckbxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 11));
		PanelEspecialidad.add(chckbxAdministracion);
		
		JCheckBox chckbxDisenoGrafico = new JCheckBox("Diseno Grafico");
		chckbxDisenoGrafico.setBounds(228, 94, 121, 23);
		chckbxDisenoGrafico.setFont(new Font("Tahoma", Font.BOLD, 11));
		PanelEspecialidad.add(chckbxDisenoGrafico);
		
		JCheckBox chckbxDisenioGrafico = new JCheckBox("Dise\u00F1o Grafico");
		chckbxDisenioGrafico.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDisenioGrafico.setBounds(228, 94, 121, 23);
		PanelEspecialidad.add(chckbxDisenioGrafico);
		setVisible(true);
		
		txtCantHoras = new JTextField();
		txtCantHoras.setBounds(260, 276, 102, 19);
		getContentPane().add(txtCantHoras);
		txtCantHoras.setColumns(10);
		
		JLabel lblCantHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantHoras.setBounds(26, 273, 224, 26);
		getContentPane().add(lblCantHoras);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String leyenda="";
				if(rdbtnLinux.isSelected()) 
				{
					leyenda=rdbtnLinux.getText();
				}
				
				if(rdbtnMac.isSelected()) 
				{
					leyenda = rdbtnMac.getText();
				}
				
				if(rdbtnWindows.isSelected()) 
				{
					leyenda = rdbtnWindows.getText();
				}
				
				if(ckProgramacion.isSelected())
				{
					leyenda = leyenda +" - "+ ckProgramacion.getText();
				}
				
				if(chckbxAdministracion.isSelected())
				{
					leyenda = leyenda +" - " +chckbxAdministracion.getText();
				}
				
				if(chckbxDisenoGrafico.isSelected())
				{
					leyenda = leyenda + " - " +chckbxDisenoGrafico.getText();
				}
				
				if(txtCantHoras.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de horas");
					txtCantHoras.requestFocus(); //PARA PONERLE EL FOCUS AL CONTROL
				}
				else {
					boolean resp = soloNumeros(txtCantHoras.getText());
					if(resp) {
						leyenda = leyenda + " - " +txtCantHoras.getText()+ " Hs";
						
						//PARA CREAR LA MODAL QUE MUESTRA LOS DATOS ELEGIDOS 
						//POR EL USUARIO
						JOptionPane.showMessageDialog(null, leyenda);
						
						//PARA INICIALIZAR LOS VALORES
						txtCantHoras.setText("");
						txtCantHoras.setBackground(Color.white);
						ckProgramacion.setSelected(false);
						chckbxAdministracion.setSelected(false);
						chckbxDisenoGrafico.setSelected(false);
						rdbtnLinux.setSelected(false);
						rdbtnMac.setSelected(false);
						rdbtnWindows.setSelected(false);
					}
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAceptar.setForeground(UIManager.getColor("CheckBox.shadow"));
		//btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAceptar.setBounds(293, 321, 141, 35);
		getContentPane().add(btnAceptar);
	}
	
	public void cambiarVisibilidad(boolean estado) 
	{
		setVisible(estado);
	}
	
	public boolean soloNumeros(String cadena) {
		  try 
		  {
			int num=Integer.parseInt(cadena);
			return true;
		  }
		  catch(NumberFormatException e) 
		  {
			JOptionPane.showMessageDialog(null, "Solo numeros","Atencion", JOptionPane.WARNING_MESSAGE);
			txtCantHoras.setText("");
			txtCantHoras.requestFocus();//PARA PONERLE EL FOCO AL CONTROL
			return false;
		  }
	}
}
