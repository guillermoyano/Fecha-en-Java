package Servicio;

import Entidad.mes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    mes m = new mes();

    public int ingresarMes() {

        do {
            try {
                System.out.println("Ingrese el mes");
                m.setMes(leer.nextInt());
                if (m.getMes() > 12 || m.getMes() < 1) {
                    System.out.println("Mes erróneo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo números, no se pueden poner letras");
                leer.nextLine();
            }
        } while (m.getMes() <= 0 || m.getMes() >= 13);

        int mes = m.getMes();
        return mes;
    }
//        int dia = dss.ingresarDia();
//        int mes = 0;
//        int anio = 0;
//        
//        do {
//            try {
//
//                if (!(dia == 31 || dia == 29)) {
//                    System.out.println("Ingrese el mes");
//                    m.setMes(leer.nextInt());
//                    mes=m.getMes();
//                    anio=ass.corroboraranio();
//                    break;
//                }
//
//                System.out.println("Ingrese el mes");
//                m.setMes(leer.nextInt());
//                mes=m.getMes();
//                if ((dia == 31 && m.getMes() == 1) || (dia == 31 && m.getMes() == 3) || (dia == 31 && m.getMes() == 5) || (dia == 31 && m.getMes() == 7) || (dia == 31 && m.getMes() == 8) || (dia == 31 && m.getMes() == 10) || (dia == 31 && m.getMes() == 12)) {
//                    anio=ass.corroboraranio();
//                    break;
//                } else {
//                    System.out.println("Ese mes no tiene 31 días");
//                    System.out.println("Querés ingresar nuevamente el mes o el día");
//                    System.out.println("Ingresa (1) para día ó (2) para mes");
//                    int opcion = leer.nextInt();
//                    switch (opcion) {
//                        case 1:
//                            dia = dss.ingresarDia();
//                            anio=ass.corroboraranio();
//                            break;
//                        case 2:
//                            m.setMes(leer.nextInt());
//                            mes=m.getMes();
//                            anio=ass.corroboraranio();
//                            break;
//                        default:
//                    }
//                }
//
//                if (dia == 29 && m.getMes() == 2) {
//                    anio=ass.corroboraranio();
//                    if (ass.bisiesto(anio)){
//                        System.out.println("Ese año, febrero no tuvo 29 días");
//                        System.out.println("Querés ingresar nuevamente el mes o el día");
//                        System.out.println("Ingresa (1) para día ó (2) para mes");
//                        int opcion = leer.nextInt();
//                        
//                        switch (opcion) {
//                            case 1:
//                                dia = dss.ingresarDia();
//                                break;
//                            case 2:
//                                m.setMes(leer.nextInt());
//                                break;
//                            default:
//                        }
//                    } else {
//                        int opcion = leer.nextInt();
//                        switch (opcion) {
//                            case 1:
//                                dia = dss.ingresarDia();
//                                break;
//                            case 2:
//                                m.setMes(leer.nextInt());
//                                break;
//                            case 3:
//                                a.setAnio(leer.nextInt());
//                            default:
//                        }
//                    }
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Solo números, no se pueden poner letras");
//                leer.nextLine();
//            }
//        } while (m.getMes() < 1 || m.getMes() > 12);
//
//        System.out.println("");
//        System.out.println("Dia " + dia + " mes " + mes + " año "+ anio);
//
//    }

}
