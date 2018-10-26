/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 * 
 */
public class VueloData {
    private Conexion conexion;
    private Connection connection = null;

    public VueloData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
        
     //Carga un nuevo vuelo en la tabla
    public void altaVuelo(Vuelo vuelo){
        
        
        try {
            
            String sql = "INSERT INTO vuelo (aerolinea, aeronave, id_ciudadOrigen, id_ciudadDestino, fechaSalida, fechaDestino, estadoVuelo) VALUES ( ? , ? , ?, ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, vuelo.getAerolinea());
            statement.setString(2, vuelo.getAeronave());
            statement.setInt(3, vuelo.getCiudadOrigen().getIdCiudad());
            statement.setInt(4, vuelo.getCiudadDestino().getIdCiudad());
            statement.setDate(5, Date.valueOf(vuelo.getFechaSalida()));
            statement.setDate(6, Date.valueOf(vuelo.getFechaLlegada()));
            statement.setString(7, vuelo.getEstadoVuelo());
            
            statement.executeUpdate();           
            statement.close();
            JOptionPane.showMessageDialog(null, "Vuelo Ingresado Correctamente");
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un nuevo vuelo: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al insertar un nuevo vuelo");
        }
    }
    
    //Borrar un vuelo de la tabla
    public void bajaVuelo(int idVuelo){
    try {
            
            String sql = "DELETE FROM vuelo WHERE idVuelo =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idVuelo);
                       
            statement.executeUpdate();
            statement.close();
            JOptionPane.showMessageDialog(null, "La operación se realizó con exito.");
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar el vuelo: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Vuelo Ingresado Correctamente");
        }
        
    
    }
    
    //Modifica el Vuelo
    public void modiVuelo(Vuelo vuelo){
    
        try {
            
            String sql = "UPDATE vuelo SET aerolinea = ?, aeronave = ?, id_ciudadOrigen = ?, id_ciudadDestino = ?, fechaSalida = ?, fechaDestino = ?, estadoVuelo = ? WHERE idVuelo = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, vuelo.getAerolinea());
            statement.setString(2, vuelo.getAeronave());
            statement.setInt(3, vuelo.getCiudadOrigen().getIdCiudad());
            statement.setInt(4, vuelo.getCiudadDestino().getIdCiudad());
            statement.setDate(5, Date.valueOf(vuelo.getFechaSalida()));
            statement.setDate(6, Date.valueOf(vuelo.getFechaLlegada()));
            statement.setString(7, vuelo.getEstadoVuelo());
            statement.setInt(8, vuelo.getIdVuelo());
            
            statement.executeUpdate();            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar la ciudad: " + ex.getMessage());
        }
    
    }
         
    //Obtiene vuelos entre dos ciudades
    public List<Vuelo> vueloEntre(Ciudad ciudadO, Ciudad ciudadD, LocalDate fecha){
       List<Vuelo> vueloEntre= new ArrayList<Vuelo>(); 
       CiudadData cd=new CiudadData(conexion); 
       
       String sql = "SELECT * FROM vuelo WHERE id_ciudadOrigen = ? AND id_ciudadDestino = ? AND fechaSalida= ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ciudadO.getIdCiudad());
            statement.setInt(2, ciudadD.getIdCiudad());
            statement.setDate(3, Date.valueOf(fecha));
            
            ResultSet resultSet = statement.executeQuery();
            Vuelo vuelo;
            
            while(resultSet.next()){
                vuelo = new Vuelo();
                vuelo.setIdVuelo(resultSet.getInt("idVuelo"));
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setAeronave(resultSet.getString("aeronave"));
                vuelo.setCiudadOrigen(cd.obtenerCiudadPorId(resultSet.getInt("id_ciudadOrigen")));
                vuelo.setCiudadDestino(cd.obtenerCiudadPorId(resultSet.getInt("id_ciudadDestino"))); 
                vuelo.setFechaSalida(resultSet.getDate("fechaSalida").toLocalDate());
                vuelo.setFechaLlegada(resultSet.getDate("fechaDestino").toLocalDate());
                vuelo.setEstadoVuelo(resultSet.getString("estadoVuelo"));
                
                vueloEntre.add(vuelo);
            }      
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(VueloData.class.getName()).log(Level.SEVERE, null, ex);
        }
              
       return vueloEntre;
    }
           
     //Obtiene todos los Vuelos  
    public List<Vuelo> cantVuelos(){
        List<Vuelo> vuelos = new ArrayList<>();
        CiudadData cd=new CiudadData(conexion);    

        try {
            String sql = "SELECT * FROM vuelo;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Vuelo vuelo;
            while(resultSet.next()){
                vuelo = new Vuelo();
                vuelo.setIdVuelo(resultSet.getInt("idVuelo"));
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setAeronave(resultSet.getString("aeronave"));        
                vuelo.setCiudadOrigen(cd.obtenerCiudadPorId(resultSet.getInt("id_ciudadOrigen")));
                vuelo.setCiudadDestino(cd.obtenerCiudadPorId(resultSet.getInt("id_ciudadDestino")));
                vuelo.setFechaSalida(resultSet.getDate("fechaSalida").toLocalDate());
                vuelo.setFechaLlegada(resultSet.getDate("fechaDestino").toLocalDate());
                vuelo.setEstadoVuelo(resultSet.getString("estadoVuelo"));
                
                vuelos.add(vuelo);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Vuelos: " + ex.getMessage());
        }
        
        
        return vuelos;
    }
    }
