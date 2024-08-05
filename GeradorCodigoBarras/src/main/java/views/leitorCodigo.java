package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.awt.event.ActionEvent;

import codeBar.LerCodeBar;
import codeBar.barCode;

public class leitorCodigo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtImagem;
	private JTextField txtResultado;
	private BufferedImage buffImage = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leitorCodigo frame = new leitorCodigo();
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
	public leitorCodigo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblImagem = new JLabel("Imagem");
		lblImagem.setBounds(185, 12, 70, 15);
		contentPane.add(lblImagem);

		txtImagem = new JTextField();
		txtImagem.setBounds(64, 39, 299, 33);
		contentPane.add(txtImagem);
		txtImagem.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(174, 93, 93, 15);
		contentPane.add(lblResultado);

		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(64, 120, 299, 33);
		contentPane.add(txtResultado);

		JButton btnSelecionarImagem = new JButton("Selecionar Imagem");
		btnSelecionarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fChooser = new JFileChooser();
				fChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

				if (fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File fImage = fChooser.getSelectedFile();
					try {
						BufferedImage buffImage = ImageIO.read(fImage);
						txtImagem.setText(fImage.getName());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnSelecionarImagem.setBounds(123, 169, 191, 25);
		contentPane.add(btnSelecionarImagem);

		JButton btnProcessar = new JButton("Processar");
		btnProcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LerCodeBar.lerCodigo();
			}
		});
		btnProcessar.setBounds(123, 218, 191, 25);
		contentPane.add(btnProcessar);
	}
}