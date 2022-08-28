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
public class DensidadPoblacional extends ObjetoGeografico{
    private int numeroHabitantes;
     
    public DensidadPoblacional(int numeroHabitantes, String nombre, int idCuerpoDeAgua, String municipio) throws HabException {
        super(nombre, idCuerpoDeAgua, municipio);
        validarNumeroHab(numeroHabitantes);
        this.numeroHabitantes = numeroHabitantes;
    }

   
    
    public int afeccion(){
        int afeccion = 0;
        if(numeroHabitantes < 10000){
            afeccion = 0;
        }else{
            if(numeroHabitantes > 10000 && numeroHabitantes < 50000){
                afeccion = 1;
            }else{
                if(numeroHabitantes > 50000){
                    afeccion = 2;
                }
            }
        }
        return afeccion;
    }

    /**
     * @return the numeroHabitantes
     */
    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    /**
     * @param numeroHabitantes the numeroHabitantes to set
     */
    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    private void validarNumeroHab(int numeroHabitantes) throws HabException {
        if(numeroHabitantes < 0){
            throw new HabException("Número de habitantes no válido!");
        }
    }
    
}
