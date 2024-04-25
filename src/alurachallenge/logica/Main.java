package alurachallenge.logica;
import alurachallenge.logica.formulario.Formulario;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formulario form = new Formulario();
        
        System.out.print(form.validarConversion(monedas.DOLAR.getValue(), monedas.DOLAR.getValue()));
    }
    
}
