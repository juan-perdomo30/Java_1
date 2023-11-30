package co.com.ps.b4;

public class Actividad2 {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Firulais";
        mascota1.edad = 2;
        mascota1.tipoAnimal = "Perro";
        mascota1.colorAnimal = "blanco";
        mascota1.raza = "Fresh puddle";
        mascota1.vacunada = true;

        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Luna";
        mascota2.edad = 3;
        mascota2.tipoAnimal = "Gato";
        mascota2.colorAnimal = "Blanco, cafe y miel";
        mascota2.raza = "Criollo";
        mascota2.vacunada = true;

        System.out.println(mascota1.nombre);
        System.out.println(mascota1.edad);
        System.out.println(mascota1.tipoAnimal);
        System.out.println(mascota1.colorAnimal);
        System.out.println(mascota1.raza);
        System.out.println(mascota1.vacunada);

        System.out.println(mascota2.nombre);
        System.out.println(mascota2.edad);
        System.out.println(mascota2.tipoAnimal);
        System.out.println(mascota2.colorAnimal);
        System.out.println(mascota2.raza);
        System.out.println(mascota2.vacunada);

        System.out.println(mascota1.nombre);
        mascota1.comer();
        System.out.println(mascota2.nombre);
        mascota2.jugar();

        System.out.println(mascota1.nombre);
        mascota1.pasear();
        System.out.println(mascota2.nombre);
        mascota2.dormir();

    }
}
