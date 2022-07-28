import javax.swing.JOptionPane;

public class Veiculo {
    private int id;
    protected String marca;
    public int ano;

    public Veiculo() {
    }

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O veículo acelerou!");
        JOptionPane.showMessageDialog(null, "O veículo " + this.marca + " acelerou!");
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId() {
        this.id = (int) (Math.random()*1000);
    }

}