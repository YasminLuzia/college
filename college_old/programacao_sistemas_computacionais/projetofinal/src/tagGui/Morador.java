package tagGui;

import java.sql.*;
import java.util.*;

public class Morador extends Pessoa {
	
	private Endereco endereco;
	private int numeroMatricula;
	
	public Morador (String nome, String cpf, String telefone, Endereco endereco, int numeroMatricula) {
		super(nome, cpf, telefone);
		this.endereco = endereco;
		this.numeroMatricula = numeroMatricula;
	}
	
	// Construtor para o método de edição
	public Morador(String nome, String telefone, Endereco endereco) {
		super(nome, telefone);
		this.endereco = endereco;
	}

	// Construtor para consulta de Convidado
	public Morador(String cpf,Endereco endereco, int numeroMatricula) {
		super(cpf);
		this.endereco = endereco;
		this.numeroMatricula = numeroMatricula;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	
	public void cadastrar() {
        String sql = "INSERT INTO pessoa (nome, cpf, telefone) VALUE "
                + "('" + this.getNome() + "',"
                + "'" + this.getCpf() + "',"
                + "'" + this.getTelefone() + "');";
        Conexao.executar(sql);
        sql = "INSERT INTO morador (numeroMatricula, rua, numero, apto, cidade, estado, cep, tag, Pessoa_cpf) VALUE "
                + "(" + this.getNumeroMatricula() + ","
                + "'" + this.getEndereco().getRua() + "',"
                + "'" + this.getEndereco().getNumero() + "',"
                + "'" + this.getEndereco().getApto() + "',"
                + "'" + this.getEndereco().getCidade() + "',"
                + "'" + this.getEndereco().getEstado() + "',"
                + "'" + this.getEndereco().getCep() + "',"
                + this.getEndereco().getTag() + ","
                + "'" + this.getCpf() + "');";
        Conexao.executar(sql);
    }
	
	 public static void excluir(String cpf) {
	        String sql = "DELETE FROM morador WHERE Pessoa_cpf = '" + cpf + "'";
	        Conexao.executar(sql);
	        sql = "DELETE FROM pessoa WHERE cpf = '" + cpf + "'";
	        Conexao.executar(sql);
	    }
/*	 
	 public void editar() {
	        String sql = "UPDATE pessoa SET"
	                + " nome = '" + this.getNome() + "',"
	                + " telefone = '" + this.getTelefone() + "'"
	                + " WHERE cpf = '" + this.getCpf() + "'";
	        Conexao.conexaoBD(sql);
	        sql = "UPDATE morador SET"
	                + " rua = '" + this.getEndereco().getRua() + "',"
	                + " numero = '" + this.getEndereco().getNumero() + "',"
	                + " apto = '" + this.getEndereco().getApto() + "',"
	                + " cidade = '" + this.getEndereco().getCidade() + "',"
	                + " estado = '" + this.getEndereco().getEstado() + "',"
	                + " cep = '" + this.getEndereco().getCep() + "',"
	                + " WHERE Pessoa_cpf = '" + this.getCpf() + "'";
	        Conexao.conexaoBD(sql);
	    }
*/

	public static ArrayList<Morador> getMoradores() {
		ArrayList<Morador> lista = new ArrayList<>();

		String sql = "SELECT numeroMatricula, nome, cpf, telefone, rua, numero, apto, cidade, estado, cep, tag FROM pessoa JOIN morador WHERE Pessoa_cpf = cpf;";
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
					morador.setNumeroMatricula(rs.getInt(1));
					lista.add(morador);
				}
			} catch (Exception e) {

			}
		}

		return lista;
	}

	@Override
	public String toString() {
		return "\n### Morador ###" +
				"\nMatricula: " + this.getNumeroMatricula() +
				super.toString() +
				"\nRua: " + this.getEndereco().getRua() +
				"\nNumero: " + this.getEndereco().getNumero() +
				"\nAPTO: " + this.getEndereco().getApto() +
				"\nCidade: " + this.getEndereco().getCidade() +
				"\nEstado: " + this.getEndereco().getEstado() +
				"\nCEP: " + this.getEndereco().getCep() +
				"\nTag: " + this.getEndereco().getTag();
	}
}
