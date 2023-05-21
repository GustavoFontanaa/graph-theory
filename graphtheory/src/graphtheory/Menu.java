package graphtheory;

import javax.swing.*;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane desktopPane;

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);

		desktopPane = new JDesktopPane();
		add(desktopPane);

		SeekPath seekPath = new SeekPath();
		desktopPane.add(seekPath);
		seekPath.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Menu app = new Menu();
			app.setVisible(true);
		});
	}
}
