import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Relogio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relogio frame = new Relogio();
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
	public Relogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\duard\\OneDrive\\Pictures\\calendario.jpeg"));
		lblNewLabel.setBounds(10, 11, 269, 189);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATA E HORA ATUAL");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBounds(0, 211, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblH = new JLabel("");
		lblH.setForeground(Color.RED);
		lblH.setBounds(127, 211, 132, 14);
		contentPane.add(lblH);
		
		JButton btnClik = new JButton("CLIQUE AQUI !!!");
		btnClik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lblH.setText(relogio.toString());
				
			}
		});
		btnClik.setForeground(Color.BLUE);
		btnClik.setBounds(0, 238, 113, 23);
		contentPane.add(btnClik);
	}
}
