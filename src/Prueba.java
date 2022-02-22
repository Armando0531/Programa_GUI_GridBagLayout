import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame{

	public VentanaInicio() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana principal");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		

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
