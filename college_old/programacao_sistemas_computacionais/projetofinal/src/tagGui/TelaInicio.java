package tagGui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaInicio() {
		setLayout(null);
		
		JButton btnMorador = new JButton("Morador");
		btnMorador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Registrar no banco
				
				Tela.telaInicio.setVisible(false);
				Tela.telaMorador.setVisible(true);
			}
		});
		btnMorador.setFont(new Font("Serif", Font.BOLD, 18));
		btnMorador.setBounds(240, 200, 140, 70);
		add(btnMorador);
		
		JButton btnConvidado = new JButton("Convidado");
		btnConvidado.setFont(new Font("Serif", Font.BOLD, 18));
		btnConvidado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela.telaInicio.setVisible(false);
				Tela.telaConvidado.setVisible(true);
				
			}
		});
		btnConvidado.setBounds(80, 200, 140, 70);
		add(btnConvidado);
		
		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 70));
		lblNewLabel.setBounds(80, 50, 300, 100);
		add(lblNewLabel);

	}
}
