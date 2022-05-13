/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Ciudad;
import Modelo.Pais;
import java.util.ArrayList;
import java.util.List; 
/**
 *
 * @author paulp
 */
public class PaisServicio implements IPaisServicio {
    
    public final List<Ciudad> ciudadList = new ArrayList<>();

    
    @Override
    public Ciudad crear(Ciudad b) {
        this.ciudadList.add(b);
        return b;
    }

    
    @Override
    public Ciudad modificar(int c, Ciudad b) {
        this.ciudadList.set(this.buscarPosicion(c), b);
        return b;
    }

    
    @Override
    public Ciudad eliminar(int c) {
        var pais = this.ciudadList.get(this.buscarPosicion(c));
        this.ciudadList.remove(this.buscarPosicion(c));
        return pais;
    }


    @Override
    public List<Ciudad> listar() {
        return this.ciudadList;
    }

    
    @Override
    public int buscarPosicion(int c) {
        var posicion=-1;
        var i=0;
        for(var auxCiudad:this.ciudadList){
            if(auxCiudad.getHabitantes()==c){
                posicion =i;
                break;
            }
            i++;
        }
        return posicion;
    }

    public void crear(Pais pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
