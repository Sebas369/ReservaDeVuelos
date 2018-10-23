/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Vuelo {
    private int idVuelo;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private String aerolinea;
    private String aeronave;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;
    private String estadoVuelo;

    //Constructor
    public Vuelo(){
    }
    public Vuelo(Ciudad ciudadOrigen, Ciudad ciudadDestino, String aerolinea, String aeronave, LocalDate fechaSalida, LocalDate fechaLlegada, String estadoVuelo) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.estadoVuelo = estadoVuelo;
    }
    
    
    //Getter y setter
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    public void setEstadoVuelo(String estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }
    
    
    
}
