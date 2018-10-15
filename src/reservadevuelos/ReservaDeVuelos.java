/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos;

import java.util.logging.Level;
import java.util.logging.Logger;
import reservadevuelos.modelo.Ciudad;
import reservadevuelos.modelo.CiudadData;
import reservadevuelos.modelo.Conexion;

/**
 *
 * @author Sebastian
 */
public class ReservaDeVuelos {

    /**
     * @param args the command line arguments
     */
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
        Ciudad c = new Ciudad("Cordoba","Argentina",false);
        ciudadD.altaCiudad(c);
    }
    
}
