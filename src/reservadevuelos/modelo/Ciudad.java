/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

/**
 *
 * @author dario
 */
public class Ciudad {
    private int idCiudad;
    private String nombreCiudad;
    private String pais;
    private boolean vigencia; 
    
    
    //CONSTRUCTOR

    public Ciudad(String nombreCiudad, String pais, boolean vigencia) {
        
        this.nombreCiudad = nombreCiudad;
        this.pais = pais;
        this.vigencia = vigencia;
    
    }
    //CONSTRUCTOR POR DEFECTO

    public Ciudad() {
    }
    
    public int getIdCiudad() {
        return idCiudad;
    }
   
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
  
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
       }

