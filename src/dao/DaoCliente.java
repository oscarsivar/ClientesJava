/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IDAO;
import interfaces.IParametro;
import java.util.ArrayList;


/**
 *
 * @author Oscar_2
 */
public class DaoCliente implements IDAO{
    
    ArrayList<IParametro> almacen=null;
    DaoArchivo archivo = new DaoArchivo();

    @Override
    public void insertar(IParametro par) {
        almacen = archivo.leerArchivo();
        almacen.add(par);
        archivo.guardarArchivo(almacen);
        
    }

    @Override
    public void modificar(IParametro par) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(IParametro par) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<IParametro> consultar() {
        ArrayList<IParametro> almacen= archivo.leerArchivo();
        return almacen;
    }
    
    
    
}
