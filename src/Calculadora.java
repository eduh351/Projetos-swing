import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN3;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(21, 35, 60, 20);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN3 = new JTextField();
		txtN3.setBounds(91, 35, 20, 20);
		frame.getContentPane().add(txtN3);
		txtN3.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(121, 35, 60, 20);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setBounds(253, 35, 46, 20);
		frame.getContentPane().add(lblRes);
		
		JButton btnClic = new JButton("=");
		btnClic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				String n3 = txtN3.getText();
				if (n3.equals("+")) {
					int s = n1 + n2;
					lblRes.setText(Integer.toString((int) s));
					}
				if (n3.equals("-")) {
					int s = n1 - n2;
					lblRes.setText(Integer.toString((int) s));
				    }
				if (n3.equals("*")) {
					int s = n1 * n2;
					lblRes.setText(Integer.toString((int) s));
				    }
				if (n3.equals("/")) {
					int s = n1 / n2;
					lblRes.setText(Integer.toString((int) s));
				}
			}
		});
		btnClic.setBounds(197, 34, 46, 23);
		frame.getContentPane().add(btnClic);
	}
}
