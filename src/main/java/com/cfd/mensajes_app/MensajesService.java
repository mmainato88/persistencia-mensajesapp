/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cfd.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author mmainato88
 */
public class MensajesService {

    //Capa itnermedia entre el menu  principal y la capa de acceso
    public static void crearMensaje() {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingreso el identificador del mensaje");
//        int id = sc.nextInt();

        System.out.println("Ingreso la descipcion del mensaje");
        String msj = sc.nextLine();

        System.out.println("Ingrese el autor");
        String nombre = sc.nextLine();

//        System.out.println("Ingrese la fecha");
//        fecha = sc.nextLine();

        MensajesModel nuevoRegistro = new MensajesModel();
        //nuevoRegistro.setId_mensaje(id);
        nuevoRegistro.setMensaje(msj);
        nuevoRegistro.setAutor_mensaje(nombre);
        //nuevoRegistro.setFecha_mensaje(fecha);
        MensajesDAO.crearMensajeDB(nuevoRegistro);
    }

    public static void listarMensajes() {
        MensajesDAO.leerMensaje()   ;
    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje= sc.nextInt();
        MensajesDAO.borrarMensaje(id_mensaje);
    }

    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje= sc.nextInt();
        MensajesModel actualizacion = new MensajesModel();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensaje(actualizacion);
    }
}
