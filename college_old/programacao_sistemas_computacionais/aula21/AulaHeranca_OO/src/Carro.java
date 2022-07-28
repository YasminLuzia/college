import javax.swing.JOptionPane;

public class Carro extends Veiculo {
    public int qtdPortas;
    private double tamPortaMalas;

    public Carro() {

    }

    public Carro(String marca, int ano, int tamPortaMalas) {
        super(marca, ano);
        this.tamPortaMalas = tamPortaMalas;
    }

    public Carro(String marca, int ano, int qtdPortas, double tamPortaMalas) {
        super(marca, ano);
        this.qtdPortas = qtdPortas;
        this.tamPortaMalas = tamPortaMalas;
    }

    /**
     * @return double return the tamPortaMalas
     */
    public double getTamPortaMalas() {
        return tamPortaMalas;
    }

    /**
     * @param tamPortaMalas the tamPortaMalas to set
     */
    public void setTamPortaMalas(double tamPortaMalas) {
        if(tamPortaMalas>0){
            this.tamPortaMalas = tamPortaMalas;
        }
        
    }

    public void imprimir() {
        String texto = "Marca: " + this.marca;
        texto+= "\nPortas: " + this.qtdPortas;
        texto+= "\nTamanho do porta-malas: " + this.tamPortaMalas;
        texto+= "\nAno: " + this.ano;
        texto+= "\nId: " + this.getId();
        JOptionPane.showMessageDialog(null, texto);
    }

}