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
public class NegativeException extends Exception {

    public NegativeException(String error_No_se_permiten_números_negativos) {
        super(error_No_se_permiten_números_negativos);
    }
    
}
