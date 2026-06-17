package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Usuario.Filme;

public class AdminPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Filme filme;
	private JLabel lbImagem;
	private JPanel painelFilmes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPrincipal frame = new AdminPrincipal();
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
	public AdminPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton addFilmes = new JButton("Adicionar");
		addFilmes.setContentAreaFilled(false);
		addFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelFilmes.setVisible(true);
			}
		});
		addFilmes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				addFilmes.setForeground(Color.WHITE);
				addFilmes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				addFilmes.setForeground(Color.BLACK);
				addFilmes.setCursor(Cursor.getDefaultCursor());

			}
		});
				
				JButton excluir = new JButton(" Excluir");
				excluir.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						excluir.setForeground(Color.WHITE);
						excluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						excluir.setForeground(Color.BLACK);
						excluir.setCursor(Cursor.getDefaultCursor());
					}
				});
				excluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				
						painelFilmes = new JPanel();
						painelFilmes.setVisible(false);
						
						JButton relatorio = new JButton("Relatório");
						relatorio.setForeground(Color.BLACK);
						relatorio.setFont(new Font("Dialog", Font.BOLD, 14));
						relatorio.setFocusPainted(false);
						relatorio.setContentAreaFilled(false);
						relatorio.setBorderPainted(false);
						relatorio.setBounds(32, 284, 127, 33);
						contentPane.add(relatorio);
						painelFilmes.setBounds(246, 0, 966, 651);
						contentPane.add(painelFilmes);
						painelFilmes.setLayout(null);
						
								JButton botaoAddImagem = new JButton("Imagem");
								botaoAddImagem.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseEntered(MouseEvent e) {
										botaoAddImagem.setForeground(Color.BLACK);
										botaoAddImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar (1).png")));
										botaoAddImagem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									}
									@Override
									public void mouseExited(MouseEvent e) {
										botaoAddImagem.setForeground(Color.WHITE);
										botaoAddImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar_branco.png")));
										botaoAddImagem.setCursor(Cursor.getDefaultCursor());
										
									}
								});
								botaoAddImagem.setForeground(new Color(255, 255, 255));
								botaoAddImagem.setFont(new Font("Caladea", Font.BOLD, 14));
								botaoAddImagem.setFocusPainted(false);
								botaoAddImagem.setContentAreaFilled(false);
								botaoAddImagem.setBorderPainted(false);
								botaoAddImagem.setIcon(new ImageIcon(AdminPrincipal.class.getResource("/imagens/adicionar_branco.png")));
								botaoAddImagem.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										JFileChooser escolheImagem = new JFileChooser();
										escolheImagem.setDialogTitle("Procurar Imagem");
										escolheImagem.setFileSelectionMode(JFileChooser.FILES_ONLY);
										FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem","jpg","png");
										escolheImagem.setFileFilter(filter);
										int retorno = escolheImagem.showOpenDialog(botaoAddImagem);
										
										if(retorno == JFileChooser.APPROVE_OPTION) {
											
											File file = escolheImagem.getSelectedFile();
											file.getPath();
											lbImagem.setIcon(new ImageIcon(file.getPath()));
										
											
										}
										

									}
								});
								botaoAddImagem.setBounds(58, 190, 133, 32);
								painelFilmes.add(botaoAddImagem);
								
								lbImagem = new JLabel("");
								lbImagem.setForeground(new Color(255, 255, 255));
								lbImagem.setBounds(66, 46, 114, 138);
								painelFilmes.add(lbImagem);
								
										JLabel lblNewLabel_1 = new JLabel("");
										lblNewLabel_1.setIcon(new ImageIcon(AdminPrincipal.class.getResource("/imagens/lblfilme-671-484.png")));
										lblNewLabel_1.setBounds(0, 0, 671, 480);
										painelFilmes.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(AdminPrincipal.class.getResource("/imagens/user (1).png")));
				lblNewLabel_2.setBounds(77, 104, 37, 54);
				contentPane.add(lblNewLabel_2);
				excluir.setForeground(new Color(0, 0, 0));
				excluir.setContentAreaFilled(false);
				excluir.setFont(new Font("Dialog", Font.BOLD, 14));
				excluir.setFocusPainted(false);
				excluir.setBorderPainted(false);
				excluir.setBounds(32, 252, 127, 33);
				contentPane.add(excluir);
		addFilmes.setFocusPainted(false);
		addFilmes.setForeground(new Color(0, 0, 0));
		addFilmes.setBorderPainted(false);
		addFilmes.setBackground(new Color(255, 255, 255));
		addFilmes.setFont(new Font("Artifakt Element Black", Font.BOLD, 14));
		addFilmes.setBounds(33, 185, 126, 35);
		contentPane.add(addFilmes);

		JButton editar = new JButton(" Editar");
		editar.setContentAreaFilled(false);
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				editar.setForeground(Color.WHITE);
				editar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				editar.setForeground(Color.BLACK);
				editar.setCursor(Cursor.getDefaultCursor());

			}
		});
		editar.setForeground(new Color(0, 0, 0));
		editar.setFont(new Font("Artifakt Element Black", Font.BOLD, 14));
		editar.setFocusPainted(false);
		editar.setBorderPainted(false);
		editar.setBounds(32, 220, 126, 35);
		contentPane.add(editar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AdminPrincipal.class.getResource("/imagens/Bem vindo Administrador!.png")));
		lblNewLabel.setBounds(0, 0, 917, 481);
		contentPane.add(lblNewLabel);
	}
}
