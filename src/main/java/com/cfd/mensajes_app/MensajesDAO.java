/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cfd.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mmainato88
 */
public class MensajesDAO {
    //DAO: Data Access Object
    //Aqui se va tener los metodos que van permitir la conexion con la base de datos

    //metodo para crear todos los mensajes
    public static void crearMensajeDB(MensajesModel mensaje) {
        Conexion db_connect = new Conexion();
        try ( Connection conexion = db_connect.get_conecction()) {
            PreparedStatement ps = null;
            try {
                // String query = "INSERT INTO mensajes ( mensaje, autor_mensaje) VALUES (?,?)";
                String query = "insert into mensajes (mensaje, autor_mensaje) values (?,?);";
                ps = conexion.prepareStatement(query);
               // ps.setInt(1, mensaje.getId_mensaje());
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                //ps.setString(4, mensaje.getFecha_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje nuevo agregado");

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    //metodo para leer todos los mensajes
    public static void leerMensaje() {
    }

    //metodo para eliminar todos los mensajes
    public static void borrarMensaje(int id_mensaaje) {
    }

    //metodo para leer todos los mensajes
    public static void actualizarMensaje(MensajesModel mensajesModel) {
    }
}
