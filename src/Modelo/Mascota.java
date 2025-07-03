package Modelo;

/**
 *
 * @author Juan
 */
public class Mascota {
// esta clase es la clase padre que va extender de sus subclases , que lleva sus constructores y sus metodos

    private String nombrePrivado = "Privado";
    protected String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;

    }

    public Mascota() {
        this.nombre = "martin";//  cree un  nuevo constructor ya que tenia un error que me decia que no estaba recibiendo un string 
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    String nombreDefault = "Default";
    protected String nombreProtegido = "Protegido";
    public String nombrePublico = "Público";

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    void metodoDefault() {
        System.out.println("Método default");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    public void metodoPublico() {
        System.out.println("Método público");
    }

}
