/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yojan
 */
public class conexion {
    private Connection con = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/triangulos", "root", "");
            System.out.println("La conexion se realizo");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro el driver de conexion");
        } catch (SQLException e) {
            System.out.println("No se encuentra la base de datos");
        }
        return con;
    }
    public static void main(String[] args) {
        conexion ob=new conexion();
        ob.conexion();
    }
}
