import java.sql.*;
import java.util.*;

public class Convidado extends Pessoa {

	private Morador morador;
	private int tagConvidado;

	public Convidado(String nome, String cpf, String telefone, Morador morador) {
		super(nome, cpf, telefone);
		this.morador = morador;
		this.tagConvidado = createTagConvidado();
	}

	public Convidado(String nome, String telefone, Morador morador) {
		super(nome, telefone);
		this.morador = morador;
		this.tagConvidado = createTagConvidado();
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

	public int getTagConvidado() {
		return tagConvidado;
	}

	public int createTagConvidado() {
		Random tag = new Random();
		return tag.nextInt((50) + 1) + morador.getEndereco().getTag();
	}

	// CRUD
	public void cadastrar() {
		String sql = "INSERT INTO pessoa (nome, cpf, telefone) VALUE "
				+ "('" + this.getNome() + "',"
				+ "'" + this.getCpf() + "',"
				+ "'" + this.getTelefone() + "');";
		Conexao.executar(sql);
		sql = "INSERT INTO convidado (tagConvidado, Morador_numeroMatricula, Pessoa_cpf) VALUE "
				+ "(" + this.getTagConvidado() + ", "
				+ this.getMorador().getNumeroMatricula() + ", "
				+ this.getCpf() + ");";
		Conexao.executar(sql);
	}

	public static void excluir(String cpf) {
		String sql = "DELETE FROM convidado WHERE Pessoa_cpf = '" + cpf + "'";
		Conexao.executar(sql);
		sql = "DELETE FROM pessoa WHERE cpf = '" + cpf + "'";
		Conexao.executar(sql);
	}

	public void editar() {
		String sql = "UPDATE pessoa SET"
				+ " nome = '" + this.getNome() + "',"
				+ " telefone = '" + this.getTelefone() + "'"
				+ " WHERE cpf = '" + this.getCpf() + "'";
		Conexao.executar(sql);
		sql = "UPDATE convidado SET"
				+ " Morador_numeroMatricula = '" + this.getMorador().getNumeroMatricula() + "'"
				+ " WHERE Pessoa_cpf = '" + this.getCpf() + "'";
		Conexao.executar(sql);
	}

	public static ArrayList<Convidado> getConvidados() {
		ArrayList<Convidado> lista = new ArrayList<>();

		String sql = "SELECT * FROM pessoa INNER JOIN convidado ON (Pessoa_cpf = cpf) INNER JOIN morador ON (Morador_numeroMatricula = numeroMatricula);";
		ResultSet rs = Conexao.consultar(sql);

		if (rs != null) {
			try {
				while (rs.next()) {
					String cpfMorador = rs.getString(15);
					String rua = rs.getString(8);
					String numero = rs.getString(9);
					String apto = rs.getString(10);
					String cidade = rs.getString(11);
					String estado = rs.getString(12);
					String cep = rs.getString(13);
					int numeroMatricula = rs.getInt(7);
					String nomeConvidado = rs.getString(1);
					String cpfConvidado = rs.getString(2);
					String telefoneConvidado = rs.getString(3);

					Endereco endereco = new Endereco(rua, numero, apto, cidade, estado, cep);
					Morador morador = new Morador(cpfMorador, endereco, numeroMatricula);
					Convidado convidado = new Convidado(nomeConvidado, cpfConvidado, telefoneConvidado, morador);

					convidado.setCpf(rs.getString(2));
					lista.add(convidado);
				}
			} catch (Exception e) {

			}
		}

		return lista;
	}

	@Override
	public String toString() {
		return "\n### Convidado ### "
			+ super.toString() 
			+ "\nNumero de matricula do respons??vel: " + this.getMorador().getNumeroMatricula()
			+ "\nTag do convidado: " + this.getTagConvidado();
	}
}