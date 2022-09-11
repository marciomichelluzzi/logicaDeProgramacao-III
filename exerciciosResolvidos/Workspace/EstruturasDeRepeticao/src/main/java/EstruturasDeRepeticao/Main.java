package EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {

        //ESTRUTURAS DE REPETIÇÃO
        //======================================================================
        /*
            Como você já deve ter visto, estruturas de repetição servem para
            fazer com que um trecho de código deseja executado de forma repetida,
            podendo essa repetição ter um número conhecido ou não de vezes.
            Em Java existem duas estruturas de repetição:
            
            1 - while (Correspondente ao "enquanto" no portugol)
            2 - for (Correspondente ao "para" no portugol)
        
            Em ambas estruturas é preciso definir uma condição de parada para
            garantir que não haja um loop infinito. Os oepradores possíveis de
            serem utilizados são os operadores relacionais e lógicos
        
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
        // ESTRUTURA WHILE
        //======================================================================
        /*
            A estrutura while é utilizada quando a quantidade de repetições
            necessárias não for preciamente conhecida. Ex: quando você quer 
            repetir algumas instruções N vezes.
         */
        //Exemplo de estrutura simples
        boolean desejaRepetir = true;

        Scanner leitor = new Scanner(System.in);

        String nome;
        byte idade;

        while (desejaRepetir = true) {
            System.out.println("Digite o nome do usuário");
            nome = leitor.nextLine();

            System.out.println("Digite a idade do usuário");
            idade = leitor.nextByte();

            System.out.println(nome + " têm " + idade + " anos!");

            desejaRepetir = leitor.nextBoolean();
        }

        //======================================================================
        // ESTRUTURA FOR
        //======================================================================
        /* 
            A estrutura de repetição for é indicada para as situações onde
            previamente se sabe quantas repetições serão necessárias. 
        
            Essa estrutura é composta por 3 partes:
            1 - Criação da variável de controle da estrutura
            2 - Condição de parada
            3 - Incremento
        
            Cada uma dessas partes é separada por um ";"
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é: " + i);
        }

        /*
            Algumas coisas que você deve tormar cuidado quando trabalha com
            estruturas de repetição é em garantir que a condição de parada
            em algum momento seja atentida caso contrário sua estrutura de
            repetição ficará em um loop infinito
        
            Outra coisa que você não deve fazer é criar variáveis dentro de uma
            estrutura de repetição. Caso você faça isso, a cada repetição da 
            estrutura seu algoritmo estará alocando memória do computador e 
            isso fará com que sua aplicação tenha um alto consumo de memória.
            Caso você precise ler valores dentro da estrutura, crie as variáveis
            de leitura fora da estrutura repetição 
         */
    }
}
