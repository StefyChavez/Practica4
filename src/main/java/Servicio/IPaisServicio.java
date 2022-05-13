/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Ciudad;
import java.util.List;

/**
 *
 * @author paulp
 */
public interface IPaisServicio {
    
    public Ciudad crear(Ciudad b);
    public Ciudad modificar(int c, Ciudad b);
    public Ciudad eliminar(int c);
    public List<Ciudad> listar();
    public int buscarPosicion(int c);
}
