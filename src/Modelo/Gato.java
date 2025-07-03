package Modelo;

/**
 *
 * @author Juan
 */
public class Gato extends Mascota {
// extiende de su clase padre

    public Gato(String nombre) {//De esta manera, Gato no necesita declarar su propio campo nombre, porque lo hereda de Mascota.
        super(nombre);
    }

    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
