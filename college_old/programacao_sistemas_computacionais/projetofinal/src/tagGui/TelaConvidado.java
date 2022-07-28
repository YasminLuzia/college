package tagGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class TelaConvidado extends JPanel {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTextField txtCpfMorador;

	/**
	 * Create the panel.
	 */
	public TelaConvidado() {
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
		txtCpf.setBounds(20, 92, 110, 20);
		add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(20, 123, 89, 14);
		add(lblNewLabel_2);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(20, 148, 110, 20);
		add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String sql = "select * from pessoa join morador on (pessoa.cpf=morador.Pessoa_cpf) where morador.Pessoa_cpf like '"+txtCpfMorador.getText()+"';";
				String sql = "select * from pessoa join morador on (cpf=Pessoa_cpf) where morador.Pessoa_cpf like '"+txtCpfMorador.getText()+"';";
				ResultSet rs = Conexao.consultar(sql);

				if (rs != null) {
					try {
						while (rs.next()) {
							String nome = rs.getString("nome");
							String cpf = rs.getString("cpf");
							String telefone = rs.getString("telefone");
							String rua = rs.getString("rua");
							String numero = rs.getString("numero");
							String apto = rs.getString("apto");
							String cidade = rs.getString("cidade");
							String estado = rs.getString("estado");
							String cep = rs.getString("cep");
							int numeroMatricula = rs.getInt("numeroMatricula");

							Endereco endereco = new Endereco(rua, numero, apto, cidade, estado, cep);
							Morador morador = new Morador(nome, cpf, telefone, endereco, numeroMatricula);

							System.out.println(morador.getNome());
							System.out.println(txtNome.getText());
							
							Convidado convidado = new Convidado(txtNome.getText(), txtCpf.getText(), txtTelefone.getText(), morador);
							convidado.cadastrar();
						}
					} catch (Exception erro) {
						System.out.println("Deu ruim Tela.Convidado");

					}
				}
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				Tela.telaInicio.setVisible(true);
				Tela.telaConvidado.setVisible(false);
				
				txtNome.setText("");
				txtCpf.setText("");
				txtTelefone.setText("");
				txtCpfMorador.setText("");
			}
		});
		btnCadastrar.setBounds(250, 255, 125, 25);
		add(btnCadastrar);
		
		JLabel lblNewLabel_4 = new JLabel("Cpf do Morador");
		lblNewLabel_4.setBounds(250, 11, 110, 14);
		add(lblNewLabel_4);
		
		txtCpfMorador = new JTextField();
		txtCpfMorador.setBounds(250, 36, 110, 20);
		add(txtCpfMorador);
		txtCpfMorador.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Convidado.excluir(txtCpf.getText());
			
			JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso!");
			Tela.telaInicio.setVisible(true);
			Tela.telaConvidado.setVisible(false);
			}
		});
		btnExcluir.setBounds(20, 256, 125, 25);
		add(btnExcluir);

	}
}
