package Servicio;

import java.util.Scanner;

public class FechaServicio {

    diaServicio d = new diaServicio();
    mesServicio m = new mesServicio();
    anioServicio a = new anioServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void FerificarFecha() {
        boolean mesm = false;
        boolean bis = true;
        int mes;
        int anio;

        int dia = d.ingresarDia();
        do {
            mes = m.ingresarMes();
            if (dia == 31) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    anio = a.corroboraranio();
                    System.out.println(+dia + "/" + mes + "/" + anio);
                    mesm = true;
                    break;
                } else {
                    System.out.println("Ese mes no tiene 31 dias...");
                    System.out.println("Desea cambiar el dia (1) o el mes (2)");
                    int opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            do {
                                dia = d.ingresarDia();
                                if (dia == 31) {
                                    System.out.println("Mamerto otra vez con el 31");
                                }
                            } while (dia == 31);
                            break;
                        case 2:
                            mesm = false;
                            break;
                        default:
                            System.out.println("Mete bien el dedo");
                    }

                }
            }
            if (dia == 30) {
                if (mes != 2) {
                    anio = a.corroboraranio();
                    System.out.println(+dia + "/" + mes + "/" + anio);
                    mesm = true;
                } else {
                    System.out.println("Ese mes no tiene esos dias...");
                    mesm = false;
                }
            }
            if (dia < 29) {
                anio = a.corroboraranio();
                System.out.println(+dia + "/" + mes + "/" + anio);
                mesm = true;
            }
            if (dia == 29 && mes == 2) {
                do {
                    anio = a.corroboraranio();
                    bis = a.bisiesto(anio);
                    if (bis) {
                        System.out.println(+dia + "/" + mes + "/" + anio);
                        mesm = true;
                        break;
                    } else {
                        System.out.println("Desea cambiar el dia (1) o el mes (2) o el año (3)");
                        int opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                do {
                                    dia = d.ingresarDia();
                                    if (dia > 28) {
                                        System.out.println("Mamerto no puede ser mayor a 28...");
                                    } else {
                                        System.out.println(+dia + "/" + mes + "/" + anio);
                                        mesm = true;
                                        bis = true;
                                        break;
                                    }
                                } while (dia > 28);
                                break;
                            case 2:
                                do{
                                mes = m.ingresarMes();
                                if(mes == 2){
                                    System.out.println("Papastruglia otra vez con el mes 2...");
                                }else{
                                    System.out.println(+dia + "/" + mes + "/" + anio);
                                        mesm = true;
                                        bis = true;
                                        break;
                                }
                                }while(mes == 2);
                                //mesm = false;
                                break;
                            case 3:
                                do {
                                    anio = a.corroboraranio();
                                    bis = a.bisiesto(anio);
                                    if (bis) {
                                        System.out.println(+dia + "/" + mes + "/" + anio);
                                        mesm = true;
                                        break;
                                    } else {
                                        System.out.println("Mamerto, otra vez con un año no bisiesto...");
                                    }
                                } while (bis == false);
                                break;
                            default:
                                System.out.println("Mete bien el dedo");
                        }

                    }

                } while (bis == false);
            }
        } while (mesm == false);

    }

}
