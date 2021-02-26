import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Fatorial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial frame = new Fatorial();
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
	public Fatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 226, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(0, 11, 43, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblRes = new JLabel("");
		lblRes.setBounds(159, 11, 51, 20);
		contentPane.add(lblRes);
		
		JButton btnFat = new JButton("Fatorial = ");
		btnFat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN1.getText().toString());
				int f = 1;
				int c = n;
				while(c >= 1) {
					f*=c;
					c--;
					
				}
				lblRes.setText(Integer.toString(f));
			}
		});
		btnFat.setBounds(48, 10, 89, 23);
		contentPane.add(btnFat);
	}

}
