/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Docente;
import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Docente p1 = new Docente();
        Docente p2 = new Docente();
        Docente p3 = new Docente();
        System.out.print("Ingrese la cedula del docente1: ");
        p1.setCi(leer.next());
        System.out.print("Ingrese el nombre del docente1: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese el apellido del docente1: ");
        p1.setApellido(leer.next());
        p1.setGenero(Docente.TipoGenero.MASCULINO);

        System.out.print(p1.toString());
        
        System.out.print("Ingrese la cedula del docente2: ");
        p2.setCi(leer.next());
        System.out.print("Ingrese el nombre del docente2: ");
        p2.setNombre(leer.next());
        System.out.print("Ingrese el apellido del docente2: ");
        p2.setApellido(leer.next());
        p2.setGenero(Docente.TipoGenero.MASCULINO);
        System.out.println(p2.toString());
    }
}

