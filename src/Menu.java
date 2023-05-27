import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {

	private JMenuBar menuBar;
	private JMenu systemMenu;
	private JMenu routeMenu;
	private JMenuItem systemExitItem;
	private JMenuItem systemConfigItem;
	private JMenuItem routeVisibleItem;
	private JFrame frame;

	public Menu() {
		createMenu();
	}

	private void createMenu() {
		menuBar = new JMenuBar();

		systemMenu = new JMenu("Sistema");
		systemConfigItem = new JMenuItem("Configuração");
		systemConfigItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Configuration().setVisible(true);
			}
		});
		systemExitItem = new JMenuItem("Sair");
		systemExitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				System.out.println("Saiu do sistema!");
			}
		});

		systemMenu.add(systemConfigItem);
		systemMenu.addSeparator();
		systemMenu.add(systemExitItem);

		routeMenu = new JMenu("Rota");
		routeVisibleItem = new JMenuItem("Menor caminho");
		routeVisibleItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchVisible().setVisible(true);
			}
		});
		routeMenu.add(routeVisibleItem);

		menuBar.add(systemMenu);
		menuBar.add(routeMenu);

		frame = new JFrame("Sistema de Rota");
		frame.setSize(1000, 600);
		frame.setJMenuBar(menuBar);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}