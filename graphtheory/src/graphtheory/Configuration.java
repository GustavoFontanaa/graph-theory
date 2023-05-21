package graphtheory;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Configuration {
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Configuração");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 290));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel pastaPanel = new JPanel();
        pastaPanel.setLayout(new BoxLayout(pastaPanel, BoxLayout.X_AXIS));
        pastaPanel.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 0));
        JLabel pastaLabel = new JLabel("Pasta:");
        pastaLabel.setPreferredSize(new Dimension(70, pastaLabel.getPreferredSize().height));
        JTextField pastaTextField = new JTextField(20);
        pastaTextField.setAlignmentY(Component.CENTER_ALIGNMENT);
        pastaPanel.add(pastaLabel);
        pastaPanel.add(Box.createHorizontalStrut(5));
        pastaPanel.add(pastaTextField);

        JPanel sucessoPanel = new JPanel();
        sucessoPanel.setLayout(new BoxLayout(sucessoPanel, BoxLayout.X_AXIS));
        sucessoPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 100));
        JLabel sucessoLabel = new JLabel("Sucesso:");
        sucessoLabel.setPreferredSize(new Dimension(70, sucessoLabel.getPreferredSize().height));
        JTextField sucessoTextField = new JTextField(10);
        sucessoTextField.setAlignmentY(Component.CENTER_ALIGNMENT);
        Component horizontalStrut = Box.createHorizontalStrut(5);
        sucessoPanel.add(horizontalStrut);
        sucessoPanel.add(sucessoLabel);
        sucessoPanel.add(Box.createHorizontalStrut(5));
        sucessoPanel.add(sucessoTextField);
        sucessoPanel.add(Box.createHorizontalGlue());

        JPanel erroPanel = new JPanel();
        erroPanel.setLayout(new BoxLayout(erroPanel, BoxLayout.X_AXIS));
        erroPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 100));
        JLabel erroLabel = new JLabel("Erro:");
        erroLabel.setPreferredSize(new Dimension(70, erroLabel.getPreferredSize().height));
        JTextField erroTextField = new JTextField(10);
        erroTextField.setAlignmentY(Component.CENTER_ALIGNMENT);
        Component horizontalStrut2 = Box.createHorizontalStrut(5);
        erroPanel.add(horizontalStrut2);
        erroPanel.add(erroLabel);
        erroPanel.add(Box.createHorizontalStrut(5));
        erroPanel.add(erroTextField);
        erroPanel.add(Box.createHorizontalGlue());

        JCheckBox rotaAutomaticaCheckBox = new JCheckBox("Rota Automática");
        rotaAutomaticaCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton salvarButton = new JButton("Salvar");
        salvarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        salvarButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, salvarButton.getPreferredSize().height));

        panel.add(Box.createVerticalStrut(10));

        panel.add(pastaPanel);

        panel.add(Box.createVerticalStrut(10));

        panel.add(sucessoPanel);

        panel.add(Box.createVerticalStrut(10));

        panel.add(erroPanel);

        panel.add(Box.createVerticalStrut(10));

        panel.add(rotaAutomaticaCheckBox);

        panel.add(Box.createVerticalStrut(10));

        panel.add(salvarButton);

        JPanel wrapperPanel = new JPanel();
        wrapperPanel.setLayout(new BoxLayout(wrapperPanel, BoxLayout.X_AXIS));
        wrapperPanel.add(Box.createHorizontalGlue());
        wrapperPanel.add(panel);
        wrapperPanel.add(Box.createHorizontalGlue());

        frame.getContentPane().add(wrapperPanel);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
