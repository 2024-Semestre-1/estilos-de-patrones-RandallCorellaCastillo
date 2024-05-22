/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author truez
 */
public class administrador {
    private String nombre;
    private static administrador admin;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private administrador(String nombre) {
        this.nombre = nombre;
        System.out.println("El administrador es: " + this.nombre);
    }

    public static administrador setAdmin(String nombre) {
        if (admin == null){
            admin = new administrador(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase administrador");
        }
        
        return admin;
    }
    public String getNombre() {
        return this.nombre;
    }
}
