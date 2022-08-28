/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ivanf
 */
public class HabException extends Exception {

    public HabException(String número_de_habitantes_no_válido) {
        super(número_de_habitantes_no_válido);  
    }
    
}
