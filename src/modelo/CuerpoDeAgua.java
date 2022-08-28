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
public class CuerpoDeAgua extends ObjetoGeografico{
    private String tipoCuerpoDeAgua;
    private String tipoDeAgua;
    private float irca;

    public CuerpoDeAgua(String tipoCuerpoDeAgua, String tipoDeAgua, float irca, String nombre, int idCuerpoDeAgua, String municipio) throws NegativeException, IrcaException{
        super(nombre, idCuerpoDeAgua, municipio);
        validarNegativeException(irca, idCuerpoDeAgua);
        validarIrca(irca);
        this.tipoCuerpoDeAgua = tipoCuerpoDeAgua;
        this.tipoDeAgua = tipoDeAgua;
        this.irca = irca;
    }

    @Override
    public String toString() {
        return super.toString()+tipoCuerpoDeAgua + " " + tipoDeAgua + " " + irca;
    }
    
    
    
    public String nivel(){
          String nivel = "";
          if(getIrca() >= 0 && getIrca() <= 5){
               nivel = "SIN RIESGO";
          }else{
              if(getIrca() > 5 && getIrca() <= 14){
                  nivel = "BAJO";
              }else{
                  if(getIrca() > 14 && getIrca() <= 35){
                      nivel = "MEDIO";
                  }else{
                      if(getIrca() > 35 && getIrca() <= 80){
                          nivel = "ALTO";
                      }else{
                          if(getIrca() > 80 && getIrca() <= 100){
                             nivel = "INVIABLE SANITARIAMENTE"; 
                          }
                      }
                  }
              }
          }
          return nivel;
      }

    /**
     * @return the tipoCuerpoDeAgua
     */
    public String getTipoCuerpoDeAgua() {
        return tipoCuerpoDeAgua;
    }

    /**
     * @param tipoCuerpoDeAgua the tipoCuerpoDeAgua to set
     */
    public void setTipoCuerpoDeAgua(String tipoCuerpoDeAgua) {
        this.tipoCuerpoDeAgua = tipoCuerpoDeAgua;
    }

    /**
     * @return the tipoDeAgua
     */
    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    /**
     * @param tipoDeAgua the tipoDeAgua to set
     */
    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    /**
     * @return the irca
     */
    public float getIrca() {
        return irca;
    }

    /**
     * @param irca the irca to set
     */
    public void setIrca(float irca) {
        this.irca = irca;
    }

    private void validarNegativeException(float irca, int idCuerpoDeAgua) throws NegativeException {
        if(irca < 0 || idCuerpoDeAgua < 0){
            throw new NegativeException("Error, No se permiten números negativos!");
        }
    }

    private void validarIrca(float irca) throws IrcaException {
        if(irca < 0 || irca > 100){
            throw new IrcaException("Irca no válido!");
        }
    }
  
}
