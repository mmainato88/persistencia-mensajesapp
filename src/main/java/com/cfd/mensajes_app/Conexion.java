/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cfd.mensajes_app;

import java.sql.*;

/**
 *
 * @author mmainato88
 */
public class Conexion {

    public Connection get_conecction() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mensajesapp", "postgres", "12345");
            if (conection != null) {
                System.out.println("conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return conection;
    }
}
