package Modelo;

import Modelo.Mascota;

/**
 *
 * @author Juan
 */
public class Main {
// esta clase es la de prueba la cual vamos a runiar para ver si esta todo correcto

    public static void main(String[] args) {
        ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}
