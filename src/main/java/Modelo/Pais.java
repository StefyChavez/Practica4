/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Pais {
    private String nombre;
    private String idioma;
    private String continente;
    private String capital;
    private int codigoPostal;
    private Ciudad ciudad;

    public Pais(String nP, String iP, String cP, String capP, int codP, Ciudad ciudad) {
        this.nombre = nP;
        this.idioma = iP;
        this.continente = cP;
        this.capital = capP;
        this.codigoPostal = codP;
        this.ciudad = ciudad;
    }

    public Pais(String ecuaciones, String segundo, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Pais(String alemania, String aleman, String europa, String berlin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Pais(String vega_Munoz_y_Coronel_Talbot, String metro, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", idioma=" + idioma + ", continente=" + continente + ", capital=" + capital + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }

    
      
    
}
