package src;

public class Aluno extends Pessoa{
    private String registroAcademico;

    public Aluno(String nome, int idade, String email, String registroAcademico) {
        super(nome, idade, email);
        this.registroAcademico = registroAcademico;
    }

    /**
     * @return String return the registroAcademico
     */
    public String getRegistroAcademico() {
        return registroAcademico;
    }

    /**
     * @param registroAcademico the registroAcademico to set
     */
    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public void dados() {
        super.dados();
        System.out.println("RA: " + this.registroAcademico);
    }
}