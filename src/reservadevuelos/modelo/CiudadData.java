/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.modelo;
import reservadevuelos.modelo.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            System.out.println("Error al abrir la conexion: " + ex.getMessage());
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
            System.out.println("Error al insertar la ciudad: " + ex.getMessage());
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
            System.out.println("Error al intentar modificar una ciudad: " + ex.getMessage());
        }
    
    }
    
    //INTENTO PARA OBTENER CIUDADES
//    public Object [] obtenerCiudades(){
//        Object [] ciudades = new Object[4];
//            
//
//        try {
//            String sql = "SELECT * FROM ciudad;";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery();
//            
//            while(resultSet.next()){
//        
//                ciudades[0] = resultSet.getObject(1);
//                ciudades[1] = resultSet.getObject(2);
//                ciudades[2] = resultSet.getObject(3);
//                ciudades[3] = resultSet.getObject(4);
//                //ciudad.setIdCiudad(resultSet.getInt("idCiudad"));
//                //ciudad.setNombreCiudad(resultSet.getString("nbreCiudad"));
//                //ciudad.setPais(resultSet.getString("pais"));
//                //ciudad.setVigencia(resultSet.getBoolean("vigencia"));
//
//                //ciudades.add(ciudad);
//            }      
//            statement.close();
//        } catch (SQLException ex) {
//            System.out.println("Error al obtener las ciudades: " + ex.getMessage());
//        }
//        
//        
//        return ciudades;
//    }
    
    // Main de prueba clase ciudadData
      public static void main(String[] args) {
        // TODO code applicaion logic here
        Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/reserva_de_vuelos", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CiudadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        CiudadData ciudadD;
        ciudadD = new CiudadData(conexion);
        Ciudad c = new Ciudad("San Juan","Argentina",true);
        ciudadD.altaCiudad(c);
        //ciudadD.bajaCiudad(1);
      }
}
