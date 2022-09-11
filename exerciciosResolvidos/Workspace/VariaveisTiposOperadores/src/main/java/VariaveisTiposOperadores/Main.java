package VariaveisTiposOperadores;

import java.util.Date;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {

        // TIPOS DE VARIÁVEIS
        //======================================================================
        /*
            As váriaveis podem ser divididas em dois tipos: Variaveis primitivas e não primitivas (referência)
            
            Variáveis primitivas são aquelas que foram criadas com a linguagem 
            de programação e servem para armazenar valores simples, como por 
            exemplo um número, um valor lógico ou até mesmo um caractere.
        
            Já as variáveis não primitivas (referência) são aquelas que foram 
            criadas com o aprimoramento da linguagem. Elas servem para armazenar 
            valores mais complexos.
         */
        
        
        //Exemplos de tipos de variáveis primitivas
        byte idade;
        short pontosAcumulados;
        int quantidadeUsuarios;
        float cotacaoDolar;
        double consumoMedio;
        boolean estaLogado;
        char genero;
        
        
        /*  
            Tipos, tamanhos e valores default das variáveis primitivas:
        
            Tipo 	Tamanho (bits) 	Faixa                                                           Valor Padrão
            byte 	8               -128 a 127                                                      0
            short 	16              -32.768 a 32.767                                                0
            int 	32              -231 a 231 – 1                                                  0
            long 	64              -263 a 263 -1                                                   0L
            float 	32              IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38 	0.0f
            double 	64              IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308   0.0d
        */
        
        
        //Exemplos de tipos variáries não primitivas
        String nome;
        Date dataNascimento;
        
        
        /*
            Note que nas variáveis primitivas o tipo inicia com uma letra minúscula,
            já nas variáveis não primitivas inicia com uma letra maiuscula
        */
        //======================================================================
        
        
        //OPERADORES
        //======================================================================
        /*
            Java conta com 5 operadores aritméticos:
        
            Soma            (+)
            Subtração       (-)
            Multiplicação   (*)
            Divisão         (/)
            Resto           (%)
        */
        
        
        int pontosEquipeA = 10;
        int pontosEquipeB = 20;
        
        //Exemplo de utilização do operador da ADIÇÃO
        int totalSoma = pontosEquipeA + pontosEquipeB;
        //Exemplo de utilização do operador da SUBTRAÇÃO
        int totalSubtracao = pontosEquipeA - pontosEquipeB;
        //Exemplo de utilização do operador da MULTIPLICAÇÃO
        int totalMultiplicacao = pontosEquipeA * pontosEquipeB;
        //Exemplo de utilização do operador da DIVISÃO
        int totalDivisao = pontosEquipeA / pontosEquipeB;
        //Exemplo de utilização do operador de RESTO  
        int totalResto = pontosEquipeA % pontosEquipeB;
        //======================================================================
    }

}
