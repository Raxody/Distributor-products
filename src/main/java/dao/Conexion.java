
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Conexion {
    protected Connection conexion; 
    
    public void setConexion(){

        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File("config.properties")));

            this.conexion = DriverManager.getConnection(properties.getProperty("URL"), properties.getProperty("USER"),properties.getProperty("PASSWORD"));
            
            Class.forName(properties.getProperty("DRIVER"));
        }catch(Exception e){
            System.out.println("No se establecio la conexion");
        }
    }

    public void closeConexion() throws SQLException {
        if(conexion != null){
            if(!this.conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
