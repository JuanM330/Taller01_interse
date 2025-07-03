package Modelo;

/**
 *
 * @author Juan
 */
public class TestCasting {

    public static void main(String[] args) {
        Mascota m = new Gato("Michi");

        // ¿Qué pasa aquí?
        Perro p = (Perro) m;  // Esto lanza ClassCastException
        p.ladrar();

        //creo que esto pasa porque es imposible convertir un gato en un perro que esto no se puede hacer ni casteando
        // se me ocurre hacer un tipo de validacion utilizando el instaceof
        //if (m instanceof Perro perro) {
        //    perro.ladrar();
        //} else {
        //    System.out.println("No es un perro.");
        // }
    }

}
