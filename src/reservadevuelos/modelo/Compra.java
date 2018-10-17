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
public class Compra {
    private int idCompra;
    private LocalDate fechaCompra;
    private Asiento asiento;
    private Cliente cliente;
    private double monto;
    private boolean estadoCompra;
    
    //Constructor
    
    public Compra(LocalDate fechaCompra, Asiento asiento, Cliente cliente, double monto, boolean estadoCompra) {
        this.fechaCompra = fechaCompra;
        this.asiento = asiento;
        this.cliente = cliente;
        this.monto = monto;
        this.estadoCompra = estadoCompra;
    }
    
    //getter y setter

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(boolean estadoCompra) {
        this.estadoCompra = estadoCompra;
    }
    
}
