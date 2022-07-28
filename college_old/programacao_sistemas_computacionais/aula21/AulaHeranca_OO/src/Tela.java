public class Tela {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.qtdPortas = 4;
        c1.setTamPortaMalas(200);
        c1.ano = 2010;
        c1.setId();

        c1.acelerar();
        c1.imprimir();

        Carro c2 = new Carro("Ferrari", 2022, 100);
        c2.imprimir();
    }
}
