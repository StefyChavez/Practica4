/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pais;
import Modelo.Ciudad;
import Servicio.PaisServicio;
import java.util.List;

/**
 *
 * @author paulp
 */
public class PaisControl {
    
    public PaisServicio paisServicio = new PaisServicio();
    
    public Pais crear(String nP, String cP, String iP, String capP, int codP, int h,String d, String t, int s, String r){
        var ciudad = new Ciudad(h,d,t,s,r);
        var pais = new Pais(nP,cP,iP,capP,codP,ciudad);
        this.paisServicio.crear(pais);
        return pais;
    }
    
    public Ciudad eliminar(int c) {
        return this.paisServicio.eliminar(c);
    }
    
    public Ciudad modificar(int c, Ciudad b) {
        return this.paisServicio.modificar(c,b);
    }
    
    public List<Ciudad> listar()
    {
        return this.paisServicio.listar();
    }

    public void crear(int i, String ingenieria_Electronica, String ingenieri_en_Electronica, String ingEduardo_Pinos, String ups, String calculo, String tercero, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crear(String italia, String ingenieri_en_Electronica, String ingEduardo_Pinos, String ups, String calculo, String tercero, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crear(String italia, String italiano, String europa, String roma, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
