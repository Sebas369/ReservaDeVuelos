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
 * @author Usuario
 */
public class ClienteData {
    
    
    private Connection connection = null;
    
    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    //Insertar un nuevo cliente en la tabla
    public void altaCliente(Cliente cliente){
        try {
            
            String sql = "INSERT INTO cliente (nombre, apellido, sexo, dni, numPasaporte, numTarjeta, email) VALUES ( ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getSexo());
            statement.setLong(4, cliente.getDni());
            statement.setLong(5, cliente.getNumPasaporte());
            statement.setString(6, cliente.getNumTarjeta());
            statement.setString(7, cliente.getEmail());
    
            statement.executeUpdate();           
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar el cliente: " + ex.getMessage());
        }
    }
    
    //Borrar un cliente de la tabla
    public void bajaCliente(int idCliente){
    try {
            
            String sql = "DELETE FROM cliente WHERE idCliente =?;";

            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
            statement.setInt(1, idCliente);
                       
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar el cliente: " + ex.getMessage());
        }
        
    
    }
    
    //Modifica el cliente
    public void modifCliente(Cliente cliente){
    
        try {
            
            String sql = "UPDATE cliente SET nombre = ?, apellido = ? , sexo = ? , dni = ? , numPasaporte = ? , numTarjeta = ? , email = ? , WHERE id = ?;";

            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getSexo());
            statement.setLong(4, cliente.getDni());
            statement.setLong(5, cliente.getNumPasaporte());
            statement.setString(6, cliente.getNumTarjeta());
            statement.setString(7, cliente.getEmail());
            statement.setInt(8, cliente.getIdCliente());
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar el cliente: " + ex.getMessage());
        }
    
    }
    
    //Obtener clientes   
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setSexo(resultSet.getString("sexo"));
                cliente.setDni(resultSet.getLong("dni"));
                cliente.setNumPasaporte(resultSet.getLong("numPasaporte"));
                cliente.setNumTarjeta(resultSet.getString("numTarjeta"));
                cliente.setEmail(resultSet.getString("email"));

                clientes.add(cliente);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        
        return clientes;
    }
}
