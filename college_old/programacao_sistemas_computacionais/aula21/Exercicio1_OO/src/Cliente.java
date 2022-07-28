public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    /**
     * @return double return the valorDivida
     */
    public double getValorDivida() {
        return valorDivida;
    }

    /**
     * @param valorDivida the valorDivida to set
     */
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    /**
     * @return int return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}