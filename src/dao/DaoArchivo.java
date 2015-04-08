/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IParametro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Oscar_2
 */
public class DaoArchivo {
    
    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;
    
    public void guardarArchivo(ArrayList<IParametro> almacen){
        try
        {
            String sFileName= "Cliente.dat";
            fos= new FileOutputStream(sFileName);
            oos= new ObjectOutputStream(fos);
            oos.writeObject(almacen);
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(Exception ex){
            
        }
    }
    
    
    public ArrayList<IParametro> leerArchivo(){
        ArrayList<IParametro> almacen = null;
        try{
            String sFileName="Cliente.dat";
            fis= new FileInputStream(sFileName);
            ois= new ObjectInputStream(fis);
            almacen = (ArrayList<IParametro>) ois.readObject();
            ois.close();
        } catch(IOException e){
            almacen = new ArrayList<IParametro>();
            return almacen;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return almacen;
    }
    
    
}
