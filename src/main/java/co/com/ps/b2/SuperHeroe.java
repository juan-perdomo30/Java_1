package co.com.ps.b2;

class Superheroe {

    // Atributos de la clase Superheroe
    private String nombre;
    private String poder;
    private int edad;

    // Constructor principal
    public Superheroe(String nombre, String poder, int edad) {
        this.nombre = nombre;
        this.poder = poder;
        this.edad = edad;
    }

    // Métodos de la clase Superheroe
    public void volar() {
        System.out.println(nombre + " está volando alto en el cielo.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Poder: " + poder);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        // Crear un objeto Superheroe utilizando el constructor
        Superheroe ironMan = new Superheroe("Iron Man // Tony Stark", "Tecnología avanzada, millonario, filantropo", 42);

        // Acceder a métodos y atributos del objeto
        ironMan.mostrarInformacion();
        ironMan.volar();
    }
}