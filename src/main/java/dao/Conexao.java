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
            props.put("password", "123456");
            
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ExemploConexao", props);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }
}
