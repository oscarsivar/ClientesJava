/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.IParametro;
import java.io.Serializable;

/**
 *
 * @author Oscar_2
 */
public class Cliente implements Serializable,IParametro{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;
    private String celular;
    private String correoEletronico;
    private String id;

    public Cliente() {
    }

    public Cliente(String id) {
        this.id = id;
    }

    public Cliente(String nombre, String apellido1, String apellido2, String direccion, String telefono, String celular, String correoEletronico, String id) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correoEletronico = correoEletronico;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id.concat("-").concat(this.apellido1)
                .concat(" ").concat(this.apellido2)
                .concat(" ").concat(this.nombre);//To change body of generated methods, choose Tools | Templates.
    }
    
    


    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoEletronico() {
        return correoEletronico;
    }

    public void setCorreoEletronico(String correoEletronico) {
        this.correoEletronico = correoEletronico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
