package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {

    private static Connection conn;//objeto del tipo connection
    private static final String driver = "com.mysql.jdbc.Driver";//con esta cadena de caracteres hacemos referencia al driver que hemos importado
    private static final String user = "root";//usuario por defecto
    private static final String password = "";//contraseña por defecto si no se define una contraseña
    private static final String url = "jdbc:mysql://localhost:3306/extra_limpio";//direccion donde esta almacenada la base de datos

    public Conectar() {//creamos un constructor
        conn = null;//iniciamos la variable conn en null
        try {//en caso de error creamos un try/catch
            Class.forName(driver);//carga la clase con el nombre indicado
            conn = (Connection) DriverManager.getConnection(url, user, password);//se le envian los datos
            if (conn != null) {//para saber si se realizo la coneccion
                //JOptionPane.showMessageDialog(null,"Conexion establecida..");//genera un cuadro de dialogo con el mensaje establecido
                //System.out.println("Conexion establecida..");//genera un mensaje por consola 
            }
        } catch (ClassNotFoundException | SQLException e) {//capturo los errores posibles
            JOptionPane.showMessageDialog(null, "Error al conectar " + e);//genera un cuadro de dialogo con el mensaje establecido
            System.out.println("Error al conectar " + e);//genera un mensaje por consola 

        }
    }

    //este metodo nos retorna la coneccion
    public Connection getConnection() {
        return conn;
    }

    //con este metodo nos desconectamos de la base de datos
    public void desconectar() {
        conn = null;//declaramos la variable conn en null para finalizar la conexion
        if (conn == null) {//para saber si se termino la conexion
            //JOptionPane.showMessageDialog(null,"Conexion terminada..");//genera un cuadro de dialogo con el mensaje establecido
            //System.out.println("Conexion terminada..");//genera un mensaje por consola 
        }
    }

}
