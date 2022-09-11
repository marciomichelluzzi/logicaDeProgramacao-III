package OrientacaoAObjetos;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {
        
        //ORIENTAÇÃO A OBJETOS
        //======================================================================
        /*
            A programação orientada a objetos é um paradigma de programação
            criado na decada de 60 a partir da linguagem de programação 
            SmallTalk e que se difundiu amplamente nos dias atuais.
        
            A POO (Programação Orientada a Objetos) foi criada para tentar 
            aproximar o mundo real do mundo virtual: a idéia fundamental é 
            tentar simular o mundo real dentro do computador. Para isso, nada 
            mais natural do que utilizar Objetos, afinal, nosso mundo é composto
            de objetos.
        
            Na POO o programador é responsável por moldar o mundo dos objetos, 
            e explicar para estes objetos como eles devem interagir entre si. 
            
            Cada objeto possui suas próprias informações (atributos) e podem
            realizar um conjunto de ações pré definidos(métodos). A interação
            entre objeto acontece exatamente quando um objeto "solicita" que 
            o outro objeto execute uma de suas ações(métodos).
            
            Para ser criado o objeto precisa de um "molde" e esse molde é a 
            Classe, nela serão descritas quais informações o objeto poderá  
            armazenar e quais ações ele poderá executar com as suas informações
        
            Os 4 conceitos básicos da orientação a objetos são:
            1 - Classe (Consiste na definição da entidade do mundo real, o molde)
            2 - Objeto (Consiste no resultado criado a partir do molde)
            3 - Atributo (Consiste nos informações que aquele objeto poderá conter)
            4 - Métodos (Consiste nas ações que aquele objeto poderá realiziar)
        */
        
        /*
            Vamos imaginar o desenvolcimento de uma aplicação que calcule o IMC
            de uma pessoa.
       
            Para resolver esse problema de forma orientada a objeto, é
            necessário refletir sobre qual entidade do mundo real eu quero 
            respresentar dentro do meu algoritmo, nesse exemplo a pessoa. 
            
            Após identificada da(s)entidade(s) do mundo real que eu vou modelar 
            dentro do meu algoritmo é necessário identificar quais informações 
            dessa entidade são relevante para a resolução do meu problema, 
            nesse caso, peso e altura da pessoa.
            
            Note que uma pessoa tem muitas outras informações alem dessas, porém
            para a resolução desse problema apenas essas informações são
            necessárias. 
        
            Além de identificar quais informações da entidade
            são pertinentes, é necessário identificar o que essa entidade poderá
            fazer, nesse caso a pessoa calculará seu próprio IMC.
        
            Vamos a solução desse problema:
            1 - De uma olhada na classe pessoa que pertence a esse projeto
            2 - Abaixo é criada uma pessoa e definida as informações de peso e
                altura dessa pessoa
            3 - É solicitado que a pessoa faça o calculo do seu IMC
        */
        
        //Criação do objeto
        Pessoa objetoPessoa = new Pessoa();
        
        //Mudando as informações do objeto
        objetoPessoa.peso = 67.3f;
        objetoPessoa.altura = 1.67f;
        
        //Solicitando que a pessoa calcule seu IMC
        float imcPessoa = objetoPessoa.calcularIMC();
              
        System.out.println("O IMC da pessoa é: " + imcPessoa);
        
        /*
            Links de leituras:
        
            * https://www.devmedia.com.br/os-4-pilares-da-programacao-orientada-a-objetos/9264
        */
        //======================================================================
    }
    
}
