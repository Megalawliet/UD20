package buttons;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Button extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Button frame = new Button();
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
	public Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		this.setTitle("Ejercicio 2: tocando dos botones");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");
		boton1.setBounds(125, 250, 80, 40);
		getContentPane().add(boton1);
		setSize(500, 500);

		boton2.setBounds(250, 250, 80, 40);
		getContentPane().add(boton2);
		setSize(500, 500);
		getContentPane().setLayout(null);

		JLabel texto1 = new JLabel();
		texto1.setBounds(103, 227, 450, 13);
		getContentPane().add(texto1);

		

		ActionListener click1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {// Definim la funció que farà que amb el mateix label de text,
														// surti un text o altre
				// Implementem la infeterface actionListener a través d'un event de la classe
				// ActionEvent
				texto1.setText("Has pulsado: Botón 1");
			}
		};

		ActionListener click2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto1.setText("Has pulsado: Botón 2");
			}
		};

		// li pasem l'objecte click
		boton1.addActionListener(click1);
		boton2.addActionListener(click2);

	}
}
