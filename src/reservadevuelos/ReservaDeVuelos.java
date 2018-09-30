/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos;

import reservadevuelos.modelo.Ciudad;

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
        Ciudad c = new Ciudad("Mendoza","Argentina",true);
        c.setNombreCiudad("San Luis");
       System.out.println(c.getNombreCiudad());
    }
    
}
