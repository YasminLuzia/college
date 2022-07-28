import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
    }

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
        aumento();
        System.out.println("Novo Salário: " + this.salario);
    }

    public void cadastrar() {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        this.nome = read.nextLine();
        System.out.println("Informe a idade: ");
        this.idade = read.nextInt();
        System.out.println("Informe o salário: ");
        this.salario = read.nextFloat();
        System.out.println(" ### Dados inseridos!###");

    }

    private void aumento() {
        this.salario = this.salario * 1.1;
    }

}