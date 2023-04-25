package Servicio;

import Entidad.anio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class anioServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    anio a = new anio();

    public int corroboraranio() {
        int anio;
        do {
            try {
                System.out.println("Ingrese el año ");
                a.setAnio(leer.nextInt());
                if (a.getAnio() < 1900 || a.getAnio() > 2023) {
                    System.out.println("Ingrese una fecha válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo números, no se pueden poner letras");
                leer.nextLine();
            };
        } while (a.getAnio() < 1900 || a.getAnio() > 2023);
        anio = a.getAnio();
        return anio;
    }

    public boolean bisiesto(int anio) {
        boolean bis = false;
        try {
            if ((a.getAnio() % 4 == 0 && a.getAnio() % 100 != 0) || (a.getAnio() % 100 == 0 && a.getAnio() % 400 == 0)) {
                System.out.println("El año " + a.getAnio() + " es bisiesto");
                bis = true;
            } else {
                System.out.println("El año " + a.getAnio() + " no es bisiesto. No pudiste haber nacido ese día.");
                bis = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo números, no se pueden poner letras");
            leer.nextLine();
        }
        return bis;
    }

}
