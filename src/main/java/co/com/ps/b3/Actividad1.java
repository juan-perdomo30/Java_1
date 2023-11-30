package co.com.ps.b3;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {

            // Tipos primitivos
            int entero = 1000000000;
            long largo = 1000000000L;
            float flotante = 3.14f;
            double decimal = 3.14159265359;
            char caracter = 'A';
            byte byteValor = 127;
            short corto = 32000;
            boolean booleano = true;

            // Wrappers (clases que envuelven tipos primitivos)
            Integer enteroWrapper = Integer.valueOf(20);
            Long largoWrapper = Long.valueOf(2000000000L);
            Float flotanteWrapper = Float.valueOf(6.28f);
            Double decimalWrapper = Double.valueOf(2.71828);
            Character caracterWrapper = Character.valueOf('B');
            Byte byteWrapper = Byte.valueOf((byte) 100);
            Short cortoWrapper = Short.valueOf((short) 15000);
            Boolean booleanoWrapper = Boolean.valueOf(false);

            // Imprimir valores
            System.out.println("Tipos primitivos:");
            System.out.println("Entero: " + entero);
            System.out.println("Largo: " + largo);
            System.out.println("Flotante: " + flotante);
            System.out.println("Decimal: " + decimal);
            System.out.println("Caracter: " + caracter);
            System.out.println("Byte: " + byteValor);
            System.out.println("Corto: " + corto);
            System.out.println("Booleano: " + booleano);

            System.out.println("\nWrappers:");
            System.out.println("Entero Wrapper: " + enteroWrapper);
            System.out.println("Largo Wrapper: " + largoWrapper);
            System.out.println("Flotante Wrapper: " + flotanteWrapper);
            System.out.println("Decimal Wrapper: " + decimalWrapper);
            System.out.println("Caracter Wrapper: " + caracterWrapper);
            System.out.println("Byte Wrapper: " + byteWrapper);
            System.out.println("Corto Wrapper: " + cortoWrapper);
            System.out.println("Booleano Wrapper: " + booleanoWrapper);

            Date fechaActual = new Date();
            System.out.println("Fecha actual: " + fechaActual);

            // Pedir al usuario una fecha en formato dd-MM-yyyy
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una fecha (dd-MM-yyyy): ");
            String inputFecha = scanner.nextLine();

            // Convertir la cadena de entrada a un objeto Date
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            try {
                    Date fechaIngresada = formato.parse(inputFecha);
                    System.out.println("Fecha ingresada: " + fechaIngresada);
            } catch (java.text.ParseException e) {
                    System.out.println("Formato de fecha incorrecto. Use el formato dd-MM-yyyy.");
            }

            Date fecha = new Date();
            BigDecimal moneda = new BigDecimal(10);

            BigDecimal numero1 = new BigDecimal("10.5");
            BigDecimal numero2 = new BigDecimal("5.2");

            // Suma
            BigDecimal suma = numero1.add(numero2);
            System.out.println("Suma: " + suma);

            // Resta
            BigDecimal resta = numero1.subtract(numero2);
            System.out.println("Resta: " + resta);

            // Multiplicación
            BigDecimal multiplicacion = numero1.multiply(numero2);
            System.out.println("Multiplicación: " + multiplicacion);

            // División
            BigDecimal division = numero1.divide(numero2, 2, BigDecimal.ROUND_HALF_UP);
            System.out.println("División: " + division);
    }
}
