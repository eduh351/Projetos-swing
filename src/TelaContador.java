import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContador frame = new TelaContador();
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
	public TelaContador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBounds(10, 0, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setBounds(10, 43, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblInicio = new JLabel("0\t\t");
		lblInicio.setBounds(256, 0, 46, 14);
		contentPane.add(lblInicio);

		JLabel lblFim = new JLabel("6");
		lblFim.setBounds(256, 43, 46, 14);
		contentPane.add(lblFim);

		JLabel lblPasso = new JLabel("1");
		lblPasso.setBounds(256, 68, 46, 14);
		contentPane.add(lblPasso);

		JSlider slFim = new JSlider();
		slFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int f = slFim.getValue();
				lblFim.setText(Integer.toString(f));
			}
		});
		slFim.setValue(0);
		slFim.setMinimum(6);
		slFim.setMaximum(20);
		slFim.setBounds(46, 36, 200, 26);
		contentPane.add(slFim);

		JSlider slPasso = new JSlider();
		slPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int p = slPasso.getValue();
				lblPasso.setText(Integer.toString(p));
			}
		});
		slPasso.setValue(1);
		slPasso.setMinimum(1);
		slPasso.setMaximum(4);
		slPasso.setBounds(46, 68, 200, 26);
		contentPane.add(slPasso);

		JList lista = new JList();
		lista.setModel(new AbstractListModel() {
			String[] values = new String[] {};

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista.setBounds(398, 97, -50, 122);
		contentPane.add(lista);

		JSlider slInicio = new JSlider();
		slInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i = slInicio.getValue();
				lblInicio.setText(Integer.toString(i));

			}
		});

		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = slInicio.getValue();
				int f = slFim.getValue();
				int p = slPasso.getValue();

				for (int c = i; c <= f; c += p) {

				}

			}

		});
		btnCalc.setBounds(46, 109, 89, 23);
		contentPane.add(btnCalc);

	}
}
