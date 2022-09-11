package EstruturasDeSelecao;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {
    
    public static void main(String[] args) {
       
        //ESTRUTURAS DE SELEÇÃO
        //======================================================================
        /*
            Como você já deve ter visto, estruturas de seleção servem para
            fazer desvios pelo código, fazendo com que trechos de código sejam
            executados ou ignorados durante a a execução dependendo de uma 
            condição previamente definida.
            Em Java existem duas estruturas de seleção:
            
            1 - if (Correspondente ao "se" no portugol)
            2 - switch (Correspondente ao "caso" no portugol)
        
            Em ambas estruturas é possivel utilizar os operadores relacionais e
            lógicos
        
            Os operadores relacionais existentes na linguagem são:
            1 - Maior           (>) 
            2 - Maior ou igual  (>=)
            3 - Menor           (<)
            4 - Menor ou igual  (<=) 
            5 - Diferente       (!=)
            6 - Igual           (==)
        
            Os operadores lógicos existentes na linguagem são:
            1 - Operador E      (&&)
            2 - Operador OU     (||)
            3 - Operador NÃO    (!)
        
            Precedência dos Operadores:
            Ordem 	Tipo de Operador 	Precedência
            1           Pós Fixo                expr++   expr–
            2           Pré fixo e Unário       ++expr   –expr   +expr   -expr   !
            3           Multiplicativo          *    /    %
            4           Aditivo                 +    –
            5           Relacional              >    >=    <=    <
            6           Igualdade               ==    !=
            7           AND Lógico              &&
            8           OR Lógico               ||
            9           Atribuição              =   +=   -=   *=   /=   %=
         */
        //======================================================================
        // ESTRUTURA IF
        //======================================================================
        /*
            A estrutura if pode ser montada de forma simples ou aninhada.
         */
        //Exemplo de estrutura simples
        int media = 7;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Aprovado");
        }

        //Exemplo de estrututa aninhada
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            if (media >= 5) {
                System.out.println("Em recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
        //======================================================================

        // ESTRUTURA SWITCH
        //======================================================================
        /* 
            A estrutura de seleção switch testa o valor contido em uma variável 
            e o compara com os valores fornecidos em cada caso, representados pela
            palavra reservada case. Podemos ter quantos casos forem necessários
            na estrutura, e quando um dos valores corresponder ao da variável de
            teste, todo o código que está dentro daquele bloco do caso será 
            executado.
        
            A váriavel que será utilizada no controle da estrutura pode ser dos
            tipos primitivos como: int, char, byte e também do tipo String (
            não são permitidos tipos como float, double pois estes trabalham
            com números com casas decimais)
        
         */
        int codigoProduto = 1;
        switch (codigoProduto) {
            case 1:
                System.out.println("Produto 1");
                break;

            case 2:
                System.out.println("Produto 2");
                break;

            case 3:
                System.out.println("Produto 3");
                break;

            default:

        }
    }
    
}
