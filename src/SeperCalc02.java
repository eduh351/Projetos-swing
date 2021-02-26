import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SeperCalc02 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeperCalc02 window = new SeperCalc02();
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
	public SeperCalc02() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 266, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DIGITE UM NUMERO");
		lblNewLabel.setBounds(10, 11, 119, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner txtNum = 
				new JSpinner();
		txtNum.setBounds(172, 8, 64, 20);
		frame.getContentPane().add(txtNum);
		
		JPanel panCalc = new JPanel();
		panCalc.setBounds(10, 136, 251, 114);
		frame.getContentPane().add(panCalc);
		panCalc.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("RESTO DA DIVIS\u00C3O / 2");
		lblNewLabel_1.setBounds(10, 11, 131, 14);
		panCalc.add(lblNewLabel_1);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setForeground(Color.RED);
		lblResto.setBounds(170, 11, 71, 14);
		panCalc.add(lblResto);
		
		JLabel lblNewLabel_2 = new JLabel("ELEVADO AO CUBO");
		lblNewLabel_2.setBounds(10, 40, 119, 14);
		panCalc.add(lblNewLabel_2);
		
		JLabel lblCubo = new JLabel("0");
		lblCubo.setForeground(Color.RED);
		lblCubo.setBounds(170, 40, 71, 14);
		panCalc.add(lblCubo);
		
		JLabel lblNewLabel_3 = new JLabel("RAIZ QUADRADA");
		lblNewLabel_3.setBounds(10, 65, 119, 14);
		panCalc.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RAIZ CUBICA");
		lblNewLabel_4.setBounds(10, 89, 119, 14);
		panCalc.add(lblNewLabel_4);
		
		JLabel lblRq = new JLabel("0");
		lblRq.setForeground(Color.RED);
		lblRq.setBounds(170, 65, 71, 14);
		panCalc.add(lblRq);
		
		JLabel lblRc = new JLabel("0");
		lblRc.setForeground(Color.RED);
		lblRc.setBounds(170, 89, 71, 14);
		panCalc.add(lblRc);
		
		JButton btnCalc = new JButton("CALCULAR");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());
				panCalc.setVisible(true);
				
				// resto da divisão
				int resto = num %2;
				lblResto.setText(Integer.toString(resto));
				
				//elevado ao cubo
				double cubo = Math.pow(num, 3);
				lblCubo.setText(Double.toString(cubo));
				
				//raiz quadrada
				double raizQ = Math.sqrt(num);
				lblRq.setText(String.format("%.2f",raizQ));
				
				//raiz cubica
				double riazC = Math.cbrt(num);
				lblRc.setText(String.format("%.4f",riazC));
				
				
			}
		});
		btnCalc.setBounds(10, 40, 119, 23);
		frame.getContentPane().add(btnCalc);
		
		panCalc.setVisible(false);
	}

}
