package Modelo;

/**
 *
 * @author Juan
 */
public class ClinicaVeterinaria {

    //La clase ClinicaVeterinaria simula una clínica que recibe una mascota y, dependiendo de su tipo (Perro o Gato), ejecuta una acción específica (ladrar o maullar).
    public void recibirMascota(Mascota m) {
        System.out.println("Recibiendo a: " + m.nombre);
        m.saludar();

        if (m instanceof Perro perro) {//Si es un Perro, llama a ladrar().
//Si es un Gato, llama a maullar().
//Si no es ninguno, imprime que no reconoce el tipo.
            perro.ladrar();
        } else if (m instanceof Gato gato) {
            gato.maullar();
        } else {
            System.out.println("Tipo de mascota no reconocido.");
        }
    }
}
