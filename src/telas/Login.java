package telas;

import java.awt.EventQueue;
import Usuario.Usuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;


import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoUsuarioLogin;
	private JPasswordField senhaUsuario;
	private Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
        usuario = new Usuario("admin", "admin852", true);        

		
		JLabel lblNewLabel = new JLabel("P");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(255, 102, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setBounds(238, 55, 46, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagens/film (2).png")));
		lblNewLabel_1.setBounds(275, 63, 38, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setForeground(new Color(255, 102, 0));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_2.setBounds(312, 55, 51, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CINE");
		lblNewLabel_3.setForeground(new Color(255, 102, 0));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_3.setBounds(262, 104, 133, 66);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("usuário");
		lblNewLabel_4.setIcon(new ImageIcon(Login.class.getResource("/imagens/user 24px.png")));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_4.setBounds(262, 181, 87, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("senha");
		lblNewLabel_5.setIcon(new ImageIcon(Login.class.getResource("/imagens/cadeado24px.png")));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_5.setBounds(263, 262, 87, 24);
		contentPane.add(lblNewLabel_5);
		
		campoUsuarioLogin = new JTextField();
		campoUsuarioLogin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					 senhaUsuario.requestFocusInWindow();
	                }
			}
		});
		campoUsuarioLogin.setColumns(10);
		campoUsuarioLogin.setBounds(224, 216, 162, 20);
		contentPane.add(campoUsuarioLogin);
		
		senhaUsuario = new JPasswordField();
		senhaUsuario.setBounds(224, 297, 162, 20);
		contentPane.add(senhaUsuario);
		
		JToggleButton MostrarSenha = new JToggleButton("");
		MostrarSenha.setFocusPainted(false);
		MostrarSenha.setContentAreaFilled(false);
		MostrarSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (MostrarSenha.isSelected()) {
					MostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aberto.png")));
					senhaUsuario.setEchoChar((char) 0);
				} else {
					MostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechado.png")));
					senhaUsuario.setEchoChar('*');
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				MostrarSenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				MostrarSenha.setCursor(Cursor.getDefaultCursor());
			}
		});
		MostrarSenha.setIcon(new ImageIcon(Login.class.getResource("/imagens/fechado.png")));
		MostrarSenha.setBorder(null);
		MostrarSenha.setBackground(Color.BLACK);
		MostrarSenha.setBounds(387, 297, 38, 23);
		contentPane.add(MostrarSenha);
		
		JButton botaoLogin = new JButton("ENTRAR");
		botaoLogin.setFocusPainted(false);
		botaoLogin.setContentAreaFilled(false);
		botaoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = campoUsuarioLogin.getText();
		        String senha = new String(senhaUsuario.getPassword());
		        if (usuario != null && usuario.verificarLogin(username, senha)) {
		        	 if (usuario.isAdmin()) {
		                 AdminPrincipal telaAdmin = new AdminPrincipal();
		                 telaAdmin.setVisible(true);
		             } else {
		                 Principal telaUsuario = new Principal();
		                 telaUsuario.setVisible(true);
		             }
		        }
		        else {
	            JOptionPane.showMessageDialog(Login.this, "Nome de usuário e/ou senha incorretos.");
	        }
		}
		});
		botaoLogin.setFont(new Font("Dialog", Font.BOLD, 12));
		botaoLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoLogin.setForeground(Color.WHITE);
				botaoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login-square-branco.png")));
				botaoLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoLogin.setForeground(new Color(255, 134, 0));
				botaoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login-square-arrow-button-outline.png")));
				botaoLogin.setCursor(Cursor.getDefaultCursor());
			}
		});
		botaoLogin.setIcon(new ImageIcon(Login.class.getResource("/imagens/login-square-arrow-button-outline.png")));
		botaoLogin.setForeground(new Color(255, 102, 51));
		botaoLogin.setBorder(null);
		botaoLogin.setBackground(new Color(0, 51, 102));
		botaoLogin.setBounds(260, 338, 103, 35);
		contentPane.add(botaoLogin);
		
		JLabel lblNewLabel_6 = new JLabel("Não possui conta?");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(210, 384, 133, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton botaoCadastro = new JButton("Cadastre-se");
		botaoCadastro.setFocusPainted(false);
		botaoCadastro.setContentAreaFilled(false);
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro tela = new Cadastro();
				tela.setVisible(true);
				
			}
		});
		botaoCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoCadastro.setForeground(Color.WHITE);
				botaoCadastro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoCadastro.setForeground(new Color(255, 134, 0));
				botaoCadastro.setCursor(Cursor.getDefaultCursor());
			}

		});
		botaoCadastro.setForeground(new Color(255, 102, 0));
		botaoCadastro.setFont(new Font("Dialog", Font.PLAIN, 12));
		botaoCadastro.setBorder(null);
		botaoCadastro.setBackground(new Color(0, 51, 102));
		botaoCadastro.setBounds(310, 380, 85, 23);
		contentPane.add(botaoCadastro);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(Login.class.getResource("/imagens/fundo-917-481.png")));
		fundo.setBounds(0, 0, 900, 443);
		contentPane.add(fundo);

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
