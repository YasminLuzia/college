package tagGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMorador extends JPanel {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTextField txtNumeroMatricula;
	private JTextField txtCep;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtApto;

	/**
	 * Create the panel.
	 */
	public TelaMorador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(20, 11, 46, 14);
		add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 36, 180, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf");
		lblNewLabel_1.setBounds(20, 67, 46, 14);
		add(lblNewLabel_1);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(20, 92, 100, 20);
		add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(20, 123, 60, 14);
		add(lblNewLabel_2);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(20, 148, 100, 20);
		add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Número da Matricula");
		lblNewLabel_3.setBounds(20, 179, 144, 14);
		add(lblNewLabel_3);
		
		txtNumeroMatricula = new JTextField();
		txtNumeroMatricula.setBounds(20, 210, 75, 20);
		add(txtNumeroMatricula);
		txtNumeroMatricula.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cep");
		lblNewLabel_4.setBounds(20, 241, 86, 14);
		add(lblNewLabel_4);
		
		txtCep = new JTextField();
		txtCep.setBounds(20, 266, 100, 20);
		add(txtCep);
		txtCep.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(250, 36, 180, 20);
		add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Estado");
		lblNewLabel_5.setBounds(250, 11, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade");
		lblNewLabel_6.setBounds(250, 67, 46, 14);
		add(lblNewLabel_6);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(250, 92, 180, 20);
		add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nome da rua");
		lblNewLabel_7.setBounds(250, 123, 86, 14);
		add(lblNewLabel_7);
		
		txtRua = new JTextField();
		txtRua.setBounds(250, 148, 180, 20);
		add(txtRua);
		txtRua.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Número");
		lblNewLabel_8.setBounds(250, 179, 46, 14);
		add(lblNewLabel_8);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(250, 210, 60, 20);
		add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("apto");
		lblNewLabel_9.setBounds(345, 179, 46, 14);
		add(lblNewLabel_9);
		
		txtApto = new JTextField();
		txtApto.setBounds(345, 210, 60, 20);
		add(txtApto);
		txtApto.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Endereco endereco = new Endereco(txtRua.getText(), txtNumero.getText(), txtApto.getText(), txtCidade.getText(), txtEstado.getText(), txtCep.getText());
				Morador morador = new Morador(txtNome.getText(), txtCpf.getText(), txtTelefone.getText(), endereco, Integer.parseInt(txtNumeroMatricula.getText()));
				morador.cadastrar();
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				Tela.telaInicio.setVisible(true);
				Tela.telaMorador.setVisible(false);
				
				txtRua.setText("");
				txtNumero.setText("");
				txtApto.setText("");
				txtCidade.setText("");
				txtEstado.setText("");
				txtCep.setText("");
				txtNome.setText("");
				txtCpf.setText("");
				txtTelefone.setText("");
				txtNumeroMatricula.setText("");
			}
		});
		btnCadastrar.setBounds(250, 255, 80, 25);
		add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Exluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Morador.excluir(txtCpf.getText());
								
				JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso!");
				Tela.telaInicio.setVisible(true);
				Tela.telaMorador.setVisible(false);
			}
		});
		btnExcluir.setBounds(351, 256, 80, 25);
		add(btnExcluir);

	}
}
