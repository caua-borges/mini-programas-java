package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewP frame = new viewP();
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
	public viewP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnLerCdigo = new JButton("Ler código");
		btnLerCdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leitorCodigo frame = new leitorCodigo();
				frame.setVisible(true);
			}
		});
		btnLerCdigo.setBounds(132, 23, 117, 25);
		contentPane.add(btnLerCdigo);

		JButton btnGeradorDeCdigo = new JButton("Gerador De Código");
		btnGeradorDeCdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerarCodeBar barra = new GerarCodeBar();
				barra.setVisible(true);
			}
		});
		btnGeradorDeCdigo.setBounds(80, 85, 225, 25);
		contentPane.add(btnGeradorDeCdigo);
	}

}
