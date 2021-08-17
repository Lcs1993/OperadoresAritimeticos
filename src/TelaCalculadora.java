import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora {

	private JFrame frame;
	private JPanel painel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora window = new TelaCalculadora();
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
	public TelaCalculadora() {
		initialize();
		painel.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Super Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(134, 37, 144, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe um valor");
		lblNewLabel_1.setBounds(21, 83, 111, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, -50, 50, 1));
		spinner.setBounds(134, 80, 33, 20);
		frame.getContentPane().add(spinner);
		
		JButton btnNewButton = new JButton("Calcular");
		
		btnNewButton.setBounds(290, 79, 123, 57);
		frame.getContentPane().add(btnNewButton);
		
		painel= new JPanel();
		painel.setBounds(10, 136, 194, 103);
		frame.getContentPane().add(painel);
		painel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Resto da divisao por 2");
		lblNewLabel_2.setBounds(0, 11, 139, 14);
		painel.add(lblNewLabel_2);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setBounds(138, 11, 46, 14);
		painel.add(lblResto);
		lblResto.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_3 = new JLabel("Elevado ao cubo");
		lblNewLabel_3.setBounds(10, 36, 111, 14);
		painel.add(lblNewLabel_3);
		
		JLabel lblAocubo = new JLabel("0");
		lblAocubo.setBounds(138, 36, 46, 14);
		painel.add(lblAocubo);
		lblAocubo.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_4 = new JLabel("Raiz quadrada");
		lblNewLabel_4.setBounds(10, 50, 101, 14);
		painel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Raiz cubica");
		lblNewLabel_5.setBounds(10, 61, 81, 14);
		painel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Valor absoluto");
		lblNewLabel_6.setBounds(11, 75, 100, 14);
		painel.add(lblNewLabel_6);
		
		JLabel lblRaizQuadrada = new JLabel("0");
		lblRaizQuadrada.setBounds(138, 50, 46, 14);
		painel.add(lblRaizQuadrada);
		lblRaizQuadrada.setForeground(Color.BLUE);
		
		JLabel lblRaizCubica = new JLabel("0");
		lblRaizCubica.setBounds(138, 61, 46, 14);
		painel.add(lblRaizCubica);
		lblRaizCubica.setForeground(Color.BLUE);
		
		JLabel lblValorAbsoluto = new JLabel("0");
		lblValorAbsoluto.setBounds(138, 75, 46, 14);
		painel.add(lblValorAbsoluto);
		lblValorAbsoluto.setForeground(Color.BLUE);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				painel.setVisible(true);
				int valor=Integer.parseInt(spinner.getValue().toString());
				
				//resto da divisao
				int restoDivisao=valor%2;
				lblResto.setText(Integer.toString(restoDivisao));
				
				//elevado ao cubo
				int cubo=(int) Math.pow(valor, 3);
				lblAocubo.setText(Integer.toString(cubo));
				
				//raiz quadrada
				double raizQuadrada=Math.sqrt(valor);
				lblRaizQuadrada.setText(String.format("%.2f", raizQuadrada));
				
				//raiz cubica
				double raizCubica=Math.cbrt(valor);
				lblRaizCubica.setText(String.format("%.2f", raizCubica));
				
				// valor absoluto
				int valorAbsoluto=(int)Math.abs(valor);
				lblValorAbsoluto.setText(Integer.toString(valorAbsoluto));
			}
		});
	}
}
