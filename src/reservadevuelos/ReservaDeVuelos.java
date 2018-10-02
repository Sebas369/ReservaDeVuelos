/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos;
import reservadevuelos.modelo.CiudadData;

import reservadevuelos.modelo.Ciudad;
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
        Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/reserva_de_vuelos", "root", "");
            
            CiudadData ciudadData = new CiudadData(conexion);
            
            //Ciudad ciudad1 = new Ciudad("Mendoza", "Argentina", false, 1);
            ciudadData.bajaCiudad(1);
            
//            Alumno alumno1 = new Alumno("Ramon", LocalDate.of(2003, 2, 15));
//            alumnoData.guardarAlumno(alumno1);
//            System.out.println("El id del alumno es: " + alumno1.getId());

//            alumnoData.obtenerAlumnos().forEach(alumno -> {
//                System.out.println("Nombre: " + alumno.getNombre() );
//            });
            
            
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
    }
    
}
