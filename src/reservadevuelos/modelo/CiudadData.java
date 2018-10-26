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

/**
 *
 * @author ventas
 */
public class CiudadData {
    private Connection connection = null;
  
    
    public CiudadData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    //Insertar nueva ciudad en la tabla
    public void altaCiudad(Ciudad ciudad){
        try {
            
            String sql = "INSERT INTO ciudad (nbreCiudad, pais, vigencia) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, ciudad.getNombreCiudad());
            statement.setString(2, ciudad.getPais());
            statement.setBoolean(3, ciudad.getVigencia());
            
            statement.executeUpdate();           
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar la ciudad: " + ex.getMessage());
        }
    }
    
    //Borrar una ciudad de la tabla
    public void bajaCiudad(int idCiudad){
    try {
            
            String sql = "DELETE FROM ciudad WHERE idCiudad =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idCiudad);
                       
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar la ciudad: " + ex.getMessage());
        }
        
    
    }
    
    //Modifica la ciudad
    public void modifCiudad(Ciudad ciudad){
    
        try {
            
            String sql = "UPDATE ciudad SET nbreCiudad = ?, pais = ? , vigencia =? WHERE idCiudad = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, ciudad.getNombreCiudad());
            statement.setString(2, ciudad.getPais());
            statement.setBoolean(3, ciudad.getVigencia());
            statement.setInt(4, ciudad.getIdCiudad());
            
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar la ciudad: " + ex.getMessage());
        }
    
    }
    
    //Obtener Ciudades    
    public List<Ciudad> obtenerCiudades(){
        List<Ciudad> ciudades = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM ciudad;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Ciudad ciudad;
            while(resultSet.next()){
                ciudad = new Ciudad();
                ciudad.setIdCiudad(resultSet.getInt("idCiudad"));
                ciudad.setNombreCiudad(resultSet.getString("nbreCiudad"));
                ciudad.setPais(resultSet.getString("pais"));
                ciudad.setVigencia(resultSet.getBoolean("vigencia"));

                ciudades.add(ciudad);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las ciudades: " + ex.getMessage());
        }
        
        
        return ciudades;
    }

    //obtener Ciudad por id
    public Ciudad obtenerCiudadPorId(int idCiudad){  
        Ciudad ciudad= null;
     
            String sql = "SELECT `idCiudad`, `nbreCiudad`, `pais`, `vigencia` FROM `ciudad` WHERE  `idCiudad`= ?;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idCiudad);
                
            ResultSet resultSet = statement.executeQuery();
            ciudad = new Ciudad();
            while(resultSet.next()){
                ciudad.setIdCiudad(resultSet.getInt("idCiudad"));
                ciudad.setNombreCiudad(resultSet.getString("nbreCiudad"));
                ciudad.setPais(resultSet.getString("pais"));
                ciudad.setVigencia(resultSet.getBoolean("vigencia"));
                           
            }
                statement.close();
            }
                  
         catch (SQLException ex) {
            System.out.println("Error al obtener la ciudad: " + ex.getMessage());
        }      
        
        return ciudad;
    }
    
    //obtener ciudad por nombre
    public Ciudad obtenerCiudad(String nombre){  
        Ciudad ciudad= null;
     
            String sql = "SELECT `idCiudad`, `nbreCiudad`, `pais`, `vigencia` FROM `ciudad` WHERE  `nbreCiudad`= ?;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
                
            ResultSet resultSet = statement.executeQuery();
            ciudad = new Ciudad();
            while(resultSet.next()){
                ciudad.setIdCiudad(resultSet.getInt("idCiudad"));
                ciudad.setNombreCiudad(resultSet.getString("nbreCiudad"));
                ciudad.setPais(resultSet.getString("pais"));
                ciudad.setVigencia(resultSet.getBoolean("vigencia"));
                           
            }
                statement.close();
            }
                  
         catch (SQLException ex) {
            System.out.println("Error al obtener la ciudad: " + ex.getMessage());
        }      
        
        return ciudad;
    }
    
}
