package Modelo;

/**
 *
 * @author Juan
 */
public class Perro extends Mascota {
// extiende de mascota que es la clase padre 

    public Perro(String nombre) {//De esta manera, Perro no necesita declarar su propio campo nombre, porque lo hereda de Mascota.
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

}
