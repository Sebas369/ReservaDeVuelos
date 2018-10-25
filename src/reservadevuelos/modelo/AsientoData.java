/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class AsientoData {
    private Connection connection = null;
    
    public AsientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    //Insertar nuevo asiento
    public void agregarAsiento(Asiento unAsiento){
        try {
            
            String sql = "INSERT INTO asiento (idVuelo, letra, numero, disponibilidad, precioAsiento) VALUES ( ? , ? , ? , ? , ?);";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, unAsiento.getIdVuelo());
            statement.setString(2, unAsiento.getLetra());
            statement.setInt(3, unAsiento.getNumero());
            statement.setBoolean(4, unAsiento.getDisponibilidad());
            statement.setDouble(5, unAsiento.getPrecioAsiento());
            
            statement.executeUpdate();           
            statement.close();
            JOptionPane.showMessageDialog(null, "El asiento se agregó correctamente");
    
        } catch (SQLException ex) {
            System.out.println("Error al agregar el asiento: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al agregar el asiento");
        }
    }
    
    //Borrar un asiento
    public void borrarAsiento(int idAsiento){
    try {
            
            String sql = "DELETE FROM asiento WHERE idAsiento = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idAsiento);
                       
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar el asiento: " + ex.getMessage());
        }
    }
    
    //Modificar asiento
    public void modificarAsieto(Asiento unAsiento){
    
        try {
            
            String sql = "UPDATE asiento SET idVuelo = ?, letra = ? , numero = ?, disponibilidad = ?, precioAsiento = ? WHERE idAsiento = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, unAsiento.getIdVuelo());
            statement.setString(2, unAsiento.getLetra());
            statement.setInt(3, unAsiento.getNumero());
            statement.setBoolean(4, unAsiento.getDisponibilidad());
            statement.setDouble(5, unAsiento.getPrecioAsiento());
            statement.setInt(6, unAsiento.getIdAsiento());
            
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar el asiento: " + ex.getMessage());
        }
    }
    
    //Obtener asientos    
    public List<Asiento> obtenerAsientos(){
        List<Asiento> asientos = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM asiento;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            Asiento unAsiento;
            while(resultSet.next()){
                unAsiento = new Asiento();
                unAsiento.setIdAsiento(resultSet.getInt("idAsiento"));
                unAsiento.setIdVuelo(resultSet.getInt("idVuelo"));
                unAsiento.setLetra(resultSet.getString("letra"));
                unAsiento.setNumero(resultSet.getInt("numero"));
                unAsiento.setDisponibilidad(resultSet.getBoolean("disponibilidad"));
                unAsiento.setPrecioAsiento(resultSet.getDouble("precioAsiento"));
                
                asientos.add(unAsiento);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las ciudades: " + ex.getMessage());
        }
        
        
        return asientos;
    }
}
