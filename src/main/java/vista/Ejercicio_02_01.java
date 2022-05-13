/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import Controlador.PaisControl;
import Modelo.Pais;
import Modelo.Ciudad;

/**
 *
 * @author paulp
 */
public class Ejercicio_02_01 {

    public static void main(String[] args) {
        
        var paisControl = new PaisControl();
        paisControl.crear("Italia", "Italiano", "Europa", "Roma", 046);
       paisControl.crear("Argentina", "Castellano", "America", "Buenos Aires", 036);
       paisControl.crear("Mexico", "Castellano", "America", "Ciudad de Mexico", 02);
       paisControl.crear("Inglaterra", "Ingles", "Europa", "Londres", 06);
        System.out.println("Listado Inicial");
        for (Ciudad b: paisControl.listar())
            System.out.println(b.toString());
        
        paisControl.eliminar(046);
        System.out.println("Listado con un pais eliminada del codigo 046");
        for (Ciudad b: paisControl.listar())
            System.out.println(b.toString());
        var datosPais = new Pais("Alemania","Aleman","Europa","Berlin");
        var datosCiudad = new Ciudad("Vega Munoz y Coronel Talbo","Metro","Sierra",datosPais);
        paisControl.modificar(10, datosCiudad); 
        
        System.out.println("Nuevo Listado"); 
        for (Ciudad b: paisControl.listar())
            System.out.println(b.toString());
    }
}
