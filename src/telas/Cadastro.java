package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("P");
		lblNewLabel.setBounds(211, 11, 39, 77);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(255, 102, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("P");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setForeground(new Color(255, 102, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_1.setBounds(282, 11, 38, 66);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Cadastro.class.getResource("/imagens/film (2).png")));
		lblNewLabel_2.setBounds(245, 25, 39, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CINE");
		lblNewLabel_3.setForeground(new Color(255, 102, 0));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_3.setBounds(245, 61, 124, 66);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nome");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(155, 156, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(155, 177, 141, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CPF");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(366, 156, 39, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(367, 177, 141, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(155, 226, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 246, 141, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton botaoRealizaCadastro = new JButton("CADASTRAR");
		botaoRealizaCadastro.setFocusPainted(false);
		botaoRealizaCadastro.setContentAreaFilled(false);
		botaoRealizaCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoRealizaCadastro.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoRealizaCadastro.setForeground(Color.WHITE);
				botaoRealizaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login-square-branco.png")));
				botaoRealizaCadastro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoRealizaCadastro.setForeground(new Color(255, 134, 0));
				botaoRealizaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login-square-arrow-button-outline.png")));
				botaoRealizaCadastro.setCursor(Cursor.getDefaultCursor());
			}
		});
		botaoRealizaCadastro.setIcon(new ImageIcon(Cadastro.class.getResource("/imagens/login-square-arrow-button-outline.png")));
		botaoRealizaCadastro.setForeground(new Color(255, 102, 0));
		botaoRealizaCadastro.setFont(new Font("Dialog", Font.BOLD, 12));
		botaoRealizaCadastro.setBorder(null);
		botaoRealizaCadastro.setBackground(Color.BLACK);
		botaoRealizaCadastro.setBounds(276, 380, 119, 35);
		contentPane.add(botaoRealizaCadastro);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(367, 246, 141, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_7 = new JLabel("Senha");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(366, 226, 62, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(155, 312, 141, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Usuario");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(155, 292, 68, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel fundoCadastro = new JLabel("New label");
		fundoCadastro.setIcon(new ImageIcon(Cadastro.class.getResource("/imagens/fundo-917-481.png")));
		fundoCadastro.setBounds(0, 0, 917, 481);
		contentPane.add(fundoCadastro);
		
		JLabel label = new JLabel("New label");
		label.setBounds(687, 336, 46, 14);
		contentPane.add(label);
	}
}
