package graphtheory;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class SeekPath {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable tblDados;

	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeekPath window = new SeekPath();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SeekPath() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Processar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(475, 391, 99, 30);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(366, 392, 99, 29);
		frame.getContentPane().add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(60, 11, 272, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setBounds(12, 18, 53, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_1_1 = new JButton("Salvar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(342, 10, 99, 30);
		frame.getContentPane().add(btnNewButton_1_1);

		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setBounds(12, 69, 53, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Código");
		lblNewLabel_2.setBounds(12, 100, 53, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("KM");
		lblNewLabel_3.setBounds(29, 131, 36, 14);
		frame.getContentPane().add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(60, 66, 68, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(60, 97, 68, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(60, 128, 68, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(224, 66, 108, 20);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(224, 97, 108, 20);
		frame.getContentPane().add(textField_5);

		JLabel lblNewLabel_1_1 = new JLabel("Cidade");
		lblNewLabel_1_1.setBounds(176, 69, 53, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Cidade");
		lblNewLabel_1_1_1.setBounds(176, 100, 53, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("(ORIGEM)");
		lblNewLabel_1_1_2.setBounds(342, 69, 60, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("(DESTINO)");
		lblNewLabel_1_1_2_1.setBounds(342, 100, 60, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);

		JButton btnNewButton_1_1_1 = new JButton("+");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tblDados.getModel();
				model.addRow(new Object[]{"", "", "", "", ""});
			}
		});
		btnNewButton_1_1_1.setBounds(527, 125, 47, 26);
		frame.getContentPane().add(btnNewButton_1_1_1);

		JScrollPane jScrollPane1 = new JScrollPane();
		jScrollPane1.setBounds(12, 163, 562, 213);
		frame.getContentPane().add(jScrollPane1);

		tblDados = new JTable();
		tblDados.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] {
						"Código Origem",
						"Cidade Origem",
						"Código Destino",
						"Cidade Destino",
						"Distância"
				}
				) {
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] {
					false,
					false,
					false,
					false,
					false
			};
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tblDados);
	}
}
