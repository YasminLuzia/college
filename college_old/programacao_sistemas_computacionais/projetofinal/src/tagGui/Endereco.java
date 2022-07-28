package tagGui;
import java.util.Random;
public class Endereco {
	
	private String rua;
	private String numero;
	private String apto;
	private String cidade;
	private String estado;
	private String cep;
	private String tag;
	
	public Endereco(String rua, String numero, String apto, String cidade, String estado, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.apto = apto;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.tag = Endereco.createTag();
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getApto() {
		return apto;
	}
	public void setApto(String apto) {
		this.apto = apto;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getTag() {
		return tag;
	}
	
	public static String createTag() {
		Random tag = new Random();
		return String.valueOf(tag.nextInt((100)+1));
	}

	
	

}
