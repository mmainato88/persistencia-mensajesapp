/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.cfd.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author mmainato88
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");

            //leerr la opcion del usuario
            System.out.println("Escoja una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);

//        Conexion con = new Conexion();
//        try ( Connection cnx = con.get_conecction()) {
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

}
