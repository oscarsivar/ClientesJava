/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Oscar_2
 */
public interface IDAO {
    
        
    public void insertar(IParametro par);
    public void modificar(IParametro par);
    public void eliminar(IParametro par);
    public ArrayList<IParametro> consultar();
    
}
