import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Morador> listaMoradores = new ArrayList<>();
		ArrayList<Convidado> listaConvidados = new ArrayList<>();

		// Cadastra morador
		// Endereco endereco = new Endereco("Rua das Laranjas", "123", "N/A", "POA", "RS", "12354398");
		// Morador morador = new Morador("Yasmin", "12345678912", "123456789",
		// endereco, 666);
		// morador.cadastrar();

		//  Cadastra convidado
		// Convidado convidado = new Convidado("Joao", "12332112398", "999998989", morador);
		// convidado.cadastrar();

		// Exclui morador
		// listaMoradores = Morador.getMoradores();
		// for (Morador m: listaMoradores) {
		// 	System.out.println(m.toString());
		// }
		// Morador.excluir( "12345678912" );

		// Exclui convidado
		// Convidado.excluir("12332112398");

		// Altera morador
		// listaMoradores = Morador.getMoradores();
		// for (Morador m: listaMoradores) {
		// 	System.out.println(m.toString());
		// }
		// String cpfDigitado = "12312312398";
		// System.out.println("Digite o cpf do morador que será editado: ");
		// Endereco endereco = new Endereco("Rua tal", "321", "400", "POA", "RS", "98906394");
		// Morador morador = new Morador("Claudia", "989899999", endereco);
		// morador.setCpf(cpfDigitado);
		// morador.editar();

		// Altera convidado
		// String cpfDigitado = "12332112398";
		// System.out.println("Digite o cpf do convidado que será editado: ");
		// Endereco endereco = new Endereco("Rua tal", "321", "400", "POA", "RS", "98906394");
		// Morador morador = new Morador("Claudia", "989899999", endereco);
		// Convidado convidado = new Convidado("Joao", "999998989", morador);
		// convidado.setCpf(cpfDigitado);
		// convidado.editar();

		// Lista moradores
		listaMoradores = Morador.getMoradores();
		for (Morador m: listaMoradores) {
			System.out.println(m.toString());
		}

		// Lista convidados
		listaConvidados = Convidado.getConvidados();
		for (Convidado c: listaConvidados) {
			System.out.println(c.toString());
		}

		// System.out.println("Fim");
	}

}
