package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import Logika.BMIKalkulator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JBMIKalkulator extends JFrame {

	private JPanel contentPane;
	private JTextField txtTezina;
	private JTextField txtVisina;
	private JLabel bmi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBMIKalkulator frame = new JBMIKalkulator();
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
	public JBMIKalkulator() {
		setResizable(false);
		setTitle("BMI Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVasaTezina = new JLabel("Vasa tezina:");
		lblVasaTezina.setBounds(78, 51, 80, 16);
		contentPane.add(lblVasaTezina);
		
		txtTezina = new JTextField();
		txtTezina.setBounds(170, 48, 116, 22);
		contentPane.add(txtTezina);
		txtTezina.setColumns(10);
		
		JLabel lblKg = new JLabel("kg.");
		lblKg.setBounds(298, 51, 31, 16);
		contentPane.add(lblKg);
		
		JLabel lblVasaVisina = new JLabel("Vasa visina:");
		lblVasaVisina.setBounds(78, 93, 80, 16);
		contentPane.add(lblVasaVisina);
		
		txtVisina = new JTextField();
		txtVisina.setBounds(170, 90, 116, 22);
		contentPane.add(txtVisina);
		txtVisina.setColumns(10);
		
		JLabel lblCm = new JLabel("cm.");
		lblCm.setBounds(298, 93, 31, 16);
		contentPane.add(lblCm);
		
		JButton btnIzracunaj = new JButton("Izracunaj");
		btnIzracunaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double tezina = Double.parseDouble(txtTezina.getText());
				double visina = Double.parseDouble(txtVisina.getText());
				bmi.setText(new BMIKalkulator().ispisi(new BMIKalkulator().bmi(tezina, visina)));
			}
		});
		btnIzracunaj.setBounds(146, 142, 97, 25);
		contentPane.add(btnIzracunaj);
		
		JLabel lblBmi = new JLabel("");
		lblBmi.setBounds(61, 191, 288, 16);
		contentPane.add(lblBmi);
		bmi = lblBmi;
	}
}
