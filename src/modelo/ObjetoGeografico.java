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
public class ObjetoGeografico {
    private String nombre;
    private int idCuerpoDeAgua;
    private String municipio;

    public ObjetoGeografico(String nombre, int idCuerpoDeAgua, String municipio) {
        this.nombre = nombre;
        this.idCuerpoDeAgua = idCuerpoDeAgua;
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return  nombre + " "  + idCuerpoDeAgua + " " + municipio + " ";
    }
 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idCuerpoDeAgua
     */
    public int getIdCuerpoDeAgua() {
        return idCuerpoDeAgua;
    }

    /**
     * @param idCuerpoDeAgua the idCuerpoDeAgua to set
     */
    public void setIdCuerpoDeAgua(int idCuerpoDeAgua) {
        this.idCuerpoDeAgua = idCuerpoDeAgua;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
