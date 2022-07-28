import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        // Objeto 1
        System.out.println("Informe o nome: ");
        String nome = read.nextLine();
        p1.setNome(nome);

        System.out.println("Informe a idade: ");
        p1.setIdade(read.nextInt());

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        // Objeto 2
        System.out.println("Informe o nome 2: ");
        read.nextLine();
        String nome2 = read.nextLine();
        Pessoa p2 = new Pessoa(nome2);
        System.out.println("Nome pessoa 2: " + p2.getNome());

        

    }
}
