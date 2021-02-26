import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Votacao {

	private JFrame frame;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Votacao window = new Votacao();
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
	public Votacao() {
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
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(45, 45, 126, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(45, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_2.setBounds(45, 221, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setBounds(257, 162, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblSit = new JLabel("<vazio>");
		lblSit.setBounds(257, 221, 126, 14);
		frame.getContentPane().add(lblSit);
		
		txtAno = new JTextField();
		txtAno.setBounds(217, 42, 86, 20);
		frame.getContentPane().add(txtAno);
		txtAno.setColumns(10);
		
		JButton btnCalc = new JButton("Calcular Idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2021 - ano;
				lblIdade.setText(Integer.toString(idade));
				if(idade < 16) {
					String sit = "Idade Inferior";
					lblSit.setText(sit);
					}
				if((idade >= 18 && idade < 70 ) ) {
					String sit = "Voto Obrigatório";
					lblSit.setText(sit);
				}
				if((idade>= 16 && idade < 18) || (idade > 70)) {
					String sit = "Voto Opcional";
					lblSit.setText(sit);
				}
					}
				
				
			
		});
		btnCalc.setBounds(45, 97, 126, 23);
		frame.getContentPane().add(btnCalc);
	}

}
