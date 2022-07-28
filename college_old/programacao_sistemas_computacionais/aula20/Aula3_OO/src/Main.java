package src;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Flavio", 40, "flavio@fadergs.com", 3500.00, "12313");
        System.out.println("Nome do prof: " + prof.getNome());
        Aluno alu = new Aluno("Yasmin", 20, "yasmin@gmail.com", "123123");
        alu.dados();
    }
}
