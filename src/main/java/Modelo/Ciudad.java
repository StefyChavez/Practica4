/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Ciudad {
    private int habitantes;
    private String direccion;
    private String transporte;
    private int superficie;
    private String region;
    

    public Ciudad(int habitantes, String direccion, String transporte, int superficie, String region) {
        this.habitantes = habitantes;
        this.direccion = direccion;
        this.transporte = transporte;
        this.superficie = superficie;
        this.region = region;
    }

    public Ciudad(int i, String ingenieria_Ambiental, String ingenier_Ambiental, String ing_Pablo_Cevallos, String ups, Pais datosPais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Ciudad(String vega_Munoz_y_Coronel_Talbo, String metro, String sierra, Pais datosPais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "habitantes=" + habitantes + ", direccion=" + direccion + ", transporte=" + transporte + ", superficie=" + superficie + ", region=" + region + '}';
    }
    
    

    
}
