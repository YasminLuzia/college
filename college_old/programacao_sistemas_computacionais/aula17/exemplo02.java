public class exemplo02 {
    public static double aoQuadrado( double valor ){
        double result = valor * valor;
        return result;
    }
    
    // Funções que NÃO recebem parâmetro e retornam um valor
    public static double getPi(){
        return 3.14;
    }
    
    public static boolean adaltoTemFilhos(){
        return false;
    }

    // Função que NÃO recebe parâmetro e  NÃO retorna nada
    public static void imprimirPI( ){
        System.out.println( "Valor do PI: " + getPi() );
    }
     
    // Funções que recebem parâmetros e  NÃO retornam nada
    public static void imprimirAreaDoCirculo( double raio ){
        double area = getPi() * ( raio * raio );
        System.out.println( "Área do Círculo com raio " + raio + " é: " + area );
    }
    
    public static void imprimirMeusDados( String nome, int idade, double altura, boolean temFilhos ){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("altura: " + altura);
        if( temFilhos  ){
            System.out.println("Tem filhos? Sim");
        }else{
            System.out.println("Tem filhos? Não");
        }
        
    }
}
