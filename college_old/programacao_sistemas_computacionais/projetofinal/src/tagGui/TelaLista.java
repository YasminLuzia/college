package tagGui;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JLabel;

public class TelaLista extends JPanel {

	public ArrayList<Morador> listaMoradores = Morador.getMoradores();
	private ArrayList<Convidado> listaConvidados = Convidado.getConvidados();

	/**
	 * Create the panel.
	 */
	public TelaLista() {
		setLayout(null);
		

		JPanel lblNewJPanel = new JPanel(
			for (Morador m: listaMoradores) {
				System.out.println(m.toString());
			}

			for (Convidado c: listaConvidados) {
				System.out.println(c.toString());
			}

		);

		

		JLabel lblNewLabel = new JLabel(


		);
		lblNewLabel.setBounds(20, 11, 46, 14);
		add(lblNewLabel);

	}
}
