/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos;

import java.util.logging.Level;
import java.util.logging.Logger;
import reservadevuelos.modelo.Asiento;
import reservadevuelos.modelo.AsientoData;
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
// PRUEBA PARA AGREGAR UNA CIUDAD

//        CiudadData ciudadD;
//        ciudadD = new CiudadData(conexion);
//        Ciudad d = new Ciudad("Cordoba","Argentina",false);
//        d.setIdCiudad(2);
//        ciudadD.modifCiudad(d);

//PRUEBA PARA AGREGAR UN ASIENTO

//        AsientoData asientoD = new AsientoData(conexion);
//        Asiento unAsiento = new Asiento(2, "A", 7, true, 500);
//        asientoD.agregarAsiento(unAsiento);

    }
    
}
