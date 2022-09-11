package Heranca;

import java.util.Date;

/**
 *
 * @author Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor("Marcio", new Date(), "12321123", 1000.0d);
        v.setTotalPecasVendidas(75);
        System.out.println(v.mostrarDados());
        
        Motorista m = new Motorista("Pedro", new Date(), "12321123", 1000.0d);
        System.out.println(m.mostrarDados());
        
    }
    
}
