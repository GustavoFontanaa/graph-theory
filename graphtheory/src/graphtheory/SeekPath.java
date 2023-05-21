package graphtheory;

import javax.swing.JInternalFrame;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SeekPath extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JButton btnSalvar;
	private JButton btnProcessar;
	private JScrollPane jScrollPane1;
	private JTable tblDados;

	public SeekPath() {
		initComponents();
	}

	private void initComponents() {
		jScrollPane1 = new JScrollPane();
		tblDados = new JTable();
		btnSalvar = new JButton();
		btnProcessar = new JButton();

		setTitle("Dijsktra - Busca pelo melhor caminho");

		tblDados.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] {
						"Código Origem",
						"Cidade Origem",
						"Código Destino",
						"Cidade Destino",
						"Distância",
				}
				) {
			private static final long serialVersionUID = 1L;

			boolean[] canEdit = new boolean[] {
					false,
					false,
					false,
					false,
					false,
					false,
			};

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		jScrollPane1.setViewportView(tblDados);

		btnSalvar.setText("SALVAR");
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				listar();
			}
		});

		btnProcessar.setText("PROCESSAR");
		btnProcessar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFecharActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnProcessar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btnSalvar)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnProcessar)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		pack();
	}

	private void listar() {
		List<Object> listaDados = getListaDados();

		if (listaDados != null) {
			DefaultTableModel tabela = (DefaultTableModel) tblDados.getModel();
			tabela.setRowCount(0);

			for (int i = 0; i < listaDados.size(); i++) {
				Object[] dados = {
						"Código Origem " + i,
						"Cidade Origem " + i,
						"Código Destino " + i,
						"Cidade Destino " + i,
						"Distância " + i,
				};
				tabela.addRow(dados);
			}
		}
	}

	private List<Object> getListaDados() {
		return null;
	}

	private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}
}
