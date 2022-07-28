package src;

public class Professor extends Pessoa{
    private double salario;
    private String registroFuncional;

    public Professor(String nome, int idade, String email, double salario, String registroFuncional) {
        super(nome, idade, email);
        this.salario = salario;
        this.registroFuncional = registroFuncional;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return String return the registroFuncional
     */
    public String getRegistroFuncional() {
        return registroFuncional;
    }

    /**
     * @param registroFuncional the registroFuncional to set
     */
    public void setRegistroFuncional(String registroFuncional) {
        this.registroFuncional = registroFuncional;
    }

    public void dados() {
        super.dados();
        System.out.println("Salario: " + this.salario);
        System.out.println("RF: " + this.registroFuncional);
    }

}