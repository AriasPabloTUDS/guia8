/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades 
con los atributos capacidadMáxima (la cantidad máxima de café que puede contener 
la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase 
CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado 
en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package guia.pkg8.eje.pkg2;

import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class GUIA8EJE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        
        System.out.println("Ingrese la cantidad actual de café: ");
        double cafeActual = leer.nextDouble();
        cs.agregarCafe(cafeActual);
        int opc;
        do {   
            
            System.out.println("______Menú______");
            System.out.println("1_ Cuanto café queda");
            System.out.println("2_ Llenar Cafetera");
            System.out.println("3_ Servir taza");
            System.out.println("4_ vaciar cafetera");
            System.out.println("5_ Agregar Cafe");
            System.out.println("6_ Salir");
            System.out.println("");
            opc = leer.nextInt();
            switch(opc){
                case 1:System.out.println("Queda : "+cs.cf.getCantidadActual());
                    break;
                case 2:cs.llenarCafetera();
                    break;
                case 3:System.out.println("Ingrese el tamaño de la taza: ");
                    cs.servirTaza(leer.nextDouble());
                    break;
                case 4:cs.vaciarCafetera();
                    break;
                case 5:System.out.println("Ingrese la cantidad de café a agregar: ");
                    cs.agregarCafe(leer.nextDouble());
                    break;
                    default:
            }
            
        } while (opc != 6);
    }
    
}
