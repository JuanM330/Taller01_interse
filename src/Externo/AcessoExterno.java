
package Externo;
import Modelo.Mascota;
     
/**
 *
 * @author Juan
 */
public class AcessoExterno {
    public static void main(String[] args) {
        Mascota m = new Mascota();

        // System.out.println(m.nombrePrivado);   // Error
        // System.out.println(m.nombreDefault);   // Error
        // System.out.println(m.nombreProtegido); // Error
        System.out.println(m.nombrePublico);      // OK

        m.metodoPublico(); // OK
    }
}
