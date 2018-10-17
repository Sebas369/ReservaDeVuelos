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
public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String sexo;
    private long dni;
    private long numPasaporte;
    private String numTarjeta;
    private String email;
    
    //constructor
    
    Cliente(int idClie,String nbre,String apell,long dni,long nPasapor,String numTarj,String email){
        idCliente = idClie;
        nombre = nbre;
        apellido = apell;
        this.dni = dni;
        numPasaporte = nPasapor;
        numTarjeta = numTarj;
        this.email = email;
    }
    
    //constructor por defecto
    Cliente(){
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(long numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
