import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame{
	
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();

	public VentanaInicio() {

		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana principal");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel label1=new JLabel("The Classic Form includes all visible fields for");
		llenado(GridBagConstraints.HORIZONTAL, 0,0, 1, 3, label1);
		
		JLabel label2=new JLabel("this list");
		llenado(GridBagConstraints.HORIZONTAL, 0, 1, 1, 1, label2);
		
		JLabel label3=new JLabel("incluide the folowing");
		llenado(GridBagConstraints.HORIZONTAL, 0,4, 1, 2, label3);
		
		JCheckBox check1=new JCheckBox("a title you form");
		llenado(GridBagConstraints.HORIZONTAL, 0, 5, 1, 2, check1);
		
		JLabel label4=new JLabel("FORM OPTIONS");
		llenado(GridBagConstraints.HORIZONTAL, 0, 3, 1, 1, label4);
		
		JTextField caja1=new JTextField("Suscribe to our mailing list",20);
		llenado(GridBagConstraints.HORIZONTAL, 0,6,1, 3, caja1);

	}
	
	public void llenado(int rellenado,int x, int y,int altura,int largo,Component componente) {
		gbc.gridx= x;
		gbc.gridy=y;
		gbc.gridheight=altura;
		gbc.gridwidth=largo;
		gbc.fill=rellenado;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
}

public class Prueba {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}

}
