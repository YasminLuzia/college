package tagGui;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String telefone;
	
	
	public Pessoa(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	// Construtor para o metódo de edição (herdado pelo construtor de Morador)
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
    }

	// Construtor para a consulta de Morador para Convidado
    public Pessoa(String cpf) {
		this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome +
		 "\nCPF: " + cpf + 
		 "\nTelefone: " + telefone;
	}
}
