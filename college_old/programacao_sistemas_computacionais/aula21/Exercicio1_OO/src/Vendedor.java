public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    /**
     * @return double return the valorVendas
     */
    public double getValorVendas() {
        return valorVendas;
    }

    /**
     * @param valorVendas the valorVendas to set
     */
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    /**
     * @return int return the qntVendas
     */
    public int getQntVendas() {
        return qntVendas;
    }

    /**
     * @param qntVendas the qntVendas to set
     */
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

}