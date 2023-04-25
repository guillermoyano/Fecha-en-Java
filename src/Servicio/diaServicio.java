package Servicio;


import Entidad.dia;
import java.util.InputMismatchException;
import java.util.Scanner;

public class diaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    dia d = new dia();
    
    public int ingresarDia(){

        do{
        try {
            
            System.out.println("Ingrese el día");
            d.setDia(leer.nextInt());
            if(d.getDia()>31 || d.getDia()<1) {
                System.out.println("Día erróneo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo números, no se pueden poner letras");
            leer.nextLine();
        } 
        }while(d.getDia()<=0 || d.getDia()>=32);
        
        int dia = d.getDia();
       return dia;
    }
    
//     public int ingresarDiaFebrero(){
//        
//        try {
//            do{
//            System.out.println("Ingrese el día");
//            d.setDia(leer.nextInt());
//            }while(d.dia()<=0 || d.dia()>=29);
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            
//        }
//         return d.dia();
//    }
//     
//      public int ingresarDiaMayoJunioSeptiembreNoviembre(){
//        
//        try {
//            do{
//            System.out.println("Ingrese el día");
//            d.setDia(leer.nextInt());
//            }while(d.dia()<=0 || d.dia()>=31);
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            
//        }
//         return d.dia();
//    }
}
