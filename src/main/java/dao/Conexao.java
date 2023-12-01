/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author IFTM
 */
public class Conexao {
    private static Connection conn = null;
    
    public static Connection getConexao() throws SQLException {
        if ((conn == null) || (conn.isClosed())) {
            conn = newConnection();
        } 
        return conn;
    }
    
    public static Connection newConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            
            Properties props = new Properties();
            props.put("user", "postgres");
            props.put("password", "andre123321");
            
            return DriverManager.getConnection(
                    "cinemaxdb.c5p6aweocf2l.sa-east-1.rds.amazonaws.com", props);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }
}
