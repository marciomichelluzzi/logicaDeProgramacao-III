package OrientacaoAObjetos;

/**
 *
 * @author Marcio Michelluzzi
 */

//Classe que representa uma pessoa
public class Pessoa {

    //Atributos de uma pessoa, necessários para a resolução do problema
    public float peso;
    public float altura;

    //Construtor
    Pessoa() {

    }
    
    //Ação que a pessoa pode executar
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }

}
