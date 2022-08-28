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
public class IrcaException extends Exception {

    public IrcaException(String irca_no_válido) {
        super(irca_no_válido);
    }
    
}
