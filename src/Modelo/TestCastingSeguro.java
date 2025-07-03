package Modelo;

/**
 *
 * @author Juan
 */
public class TestCastingSeguro {

    public static void main(String[] args) {
        Mascota m = new Gato("Michi");

        if (m instanceof Perro) {// esta es la solucion al problema que explique anterior
            Perro p = (Perro) m;
            p.ladrar();
        } else {
            System.out.println("No es un perro, no se puede ladrar.");
        }
    }
}
