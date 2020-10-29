/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author DANMAR
 */
public class ConexionBD {
    //Se crea variable que contendra la conexión
    Connection cn;
    
    
    public Connection conexion(){
        try{
            //Class for name registra el driver para la bae de datos
            Class.forName("com.mysql.jdbc.Driver");
            // Se crea la coneccion con el Driver Manger
            cn = DriverManager.getConnection("jdbc:mysql://localhost/dbregasi","root","Pm2015070684");
            System.out.println("Conectado");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    //Método para crear statement, nos permite ejecutar querys al momento de crear un objeto
    Statement createStatement(){
        throw new UnsupportedOperationException("No Conectado");
    }
    
    //Método para cerrar conexión
    public void cierraConexion(){
        try{
            cn.close();
            System.out.println("Conexión cerrada");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
