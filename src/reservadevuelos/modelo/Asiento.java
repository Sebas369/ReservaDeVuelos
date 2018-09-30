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
public class Asiento {
  private int idAsiento ;
  private int idVuelo;
  private String letra;
  private int numero;
  private boolean disponibilidad;
  private double precioAsiento;
  
  //constyructor

    public Asiento(int idAsiento, int idVuelo, String letra, int numero, boolean disponibilidad, double precioAsiento) {
        this.idAsiento = idAsiento;
        this.idVuelo = idVuelo;
        this.letra = letra;
        this.numero = numero;
        this.disponibilidad = disponibilidad;
        this.precioAsiento = precioAsiento;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecioAsiento() {
        return precioAsiento;
    }

    public void setPrecioAsiento(double precioAsiento) {
        this.precioAsiento = precioAsiento;
    }
  
  
}


