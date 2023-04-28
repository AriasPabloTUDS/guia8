/*
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado 
en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author Pablo
 */
public class CafeteraServicio {
    
    public Cafetera cf = new Cafetera();
    
    public void llenarCafetera() {
        cf.setCantidadActual(cf.getCapacidadMaxima());
        System.out.println("Se lleno la cafetera ahora hay: "+cf.getCantidadActual());
    }
    
    public void servirTaza(double tamaniooTaza) {
        if (cf.getCantidadActual() >= tamaniooTaza) {
            cf.setCantidadActual(cf.getCantidadActual() - tamaniooTaza);
            System.out.println("La taza se lleno");
        } else {
            System.out.println("La tazo no se pudo llenar, solo había para llenar hasta : " + cf.getCantidadActual());
            cf.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera() {
        cf.setCantidadActual(0);
        System.out.println("Se vació la cafetera: "+cf.getCantidadActual());
    }
    
    public void agregarCafe(double cafe) {
        cf.setCantidadActual(cf.getCantidadActual()+cafe);
        System.out.println("Se agregó café ahora hay: "+cf.getCantidadActual());
    }
    
    
}
