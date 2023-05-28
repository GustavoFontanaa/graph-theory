import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);

		JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
		JLabel rotulo = new JLabel("Menu");
		rotulo.setHorizontalAlignment(SwingConstants.CENTER);
		rotulo.setFont(new Font("Arial", Font.BOLD, 24));

		JButton botaoConfig = new JButton("Configuração");
		botaoConfig.setFont(new Font("Arial", Font.PLAIN, 14));
		botaoConfig.setBackground(new Color(51, 153, 255));
		botaoConfig.setForeground(Color.WHITE);
		botaoConfig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Configuration().setVisible(true);
			}
		});

		JButton botaoSair = new JButton("Sair");
		botaoSair.setFont(new Font("Arial", Font.PLAIN, 14));
		botaoSair.setBackground(new Color(255, 51, 51));
		botaoSair.setForeground(Color.WHITE);
		botaoSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JButton botaoRota = new JButton("Rota");
		botaoRota.setFont(new Font("Arial", Font.PLAIN, 14));
		botaoRota.setBackground(new Color(0, 204, 102));
		botaoRota.setForeground(Color.WHITE);
		botaoRota.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchVisible().setVisible(true);
			}
		});

		JPanel painelBotoes = new JPanel(new GridLayout(3, 1, 0, 10));
		painelBotoes.add(botaoConfig);
		painelBotoes.add(botaoSair);
		painelBotoes.add(botaoRota);

		painelPrincipal.add(rotulo, BorderLayout.CENTER);
		painelPrincipal.add(painelBotoes, BorderLayout.EAST);

		setContentPane(painelPrincipal);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Menu tela = new Menu();
			tela.setVisible(true);
		});
	}
}
