/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juangu
 */
public class Conexion {
    Connection conn;
    public Conexion(){
        if (conn==null)
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/gestion_academica?" + 
                    "useUnicode=true&useJDBCCompliantTimezoneShift=true&"+
                    "serverTimezone=UTC&user=damuser23&password=damuser");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);     
            } 
        
    }
    public Connection getConnection() {
        return conn;
    }
}
