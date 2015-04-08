/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IDAO;
import interfaces.IParametro;
import java.util.ArrayList;
import entidades.Cliente;


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
      Cliente cl=(Cliente) par;
      almacen= archivo.leerArchivo();
      int x=0;
      for(IParametro par1:almacen){
          Cliente cl1=(Cliente) par1;
          if(cl1.getId().equals(cl.getId())){
              almacen.set(x, cl);
          }
          x++;
      }
      archivo.guardarArchivo(almacen);
    }
    

    @Override
    public void eliminar(IParametro par) {
        Cliente cl=(Cliente) par;
        almacen = archivo.leerArchivo();
        ArrayList<IParametro> almacenCopia = (ArrayList<IParametro>) almacen.clone();
        
        int x=0;
        for(IParametro par1: almacen){
            Cliente cl1=(Cliente) par1;
            if (cl1.getId().equals(cl.getId())){
                almacenCopia.remove(x);
            }
            x++;
        }
        archivo.guardarArchivo(almacenCopia);
    }

    @Override
    public ArrayList<IParametro> consultar() {
        ArrayList<IParametro> almacen= archivo.leerArchivo();
        return almacen;
    }
    
    
    
}
