/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.cfd.mensajes_app;

import java.sql.Connection;

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

        Conexion con = new Conexion();
        try (Connection cnx=con.get_conecction()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
