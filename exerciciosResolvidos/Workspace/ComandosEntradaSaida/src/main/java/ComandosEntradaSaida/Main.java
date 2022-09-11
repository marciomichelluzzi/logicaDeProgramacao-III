package ComandosEntradaSaida;

//1 - Importar o pacote java.util
import java.util.Scanner;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {
    public static void main(String[] args) {
        
        //COMANDOS DE ENTRADA
        //======================================================================
        /*
            Uma das possibilidades de entrada e saída de dados em Java é a 
            utilização da classe Scanner.
        
            Passos para a utilização do Scanner:
            
            1 - Importar o pacote java.util
            2 - Instanciar e criar um objeto Scanner
            3 - Ler valores através do teclado
        */
       
        //2 - Instanciar e criar um objeto Scanner
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        float f = leitor.nextFloat();
        double d = leitor.nextDouble();
        String s = leitor.next(); //Lê apenas uma palavra, não é permitido o uso do caractere espaço
        String ss = leitor.nextLine(); //Leitura de texto com mais de uma palavra
        
        /*
            Como o método next retorna um texto precisamos pegar o caractere da
            primeira posição da palavra para isso usamos o método charAt() na
            posição zero
        */
        char c = leitor.next().charAt(0);
        //======================================================================
        
        //COMANDOS DE SAÍDA
        //======================================================================
        /*
            Existem algumas opções de comandos de saída utilizando a classe 
            System. São elas: 
            
            1 - print() - Imprime o valor de uma variável
            2 - printf() - Imprime o valor de uma variável conforme uma formatação especificada
            3 - println() - Imprime o valorm de uma variável e pula uma linha
        */
        
        String texto = "Esse texto será impresso no console";
        String outroTexto = "Esse texto também será impresso no console";
        System.out.println(texto);
        System.out.print(outroTexto);
        //======================================================================
    }
    
}
