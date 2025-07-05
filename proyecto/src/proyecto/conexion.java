
package proyecto;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class conexion {
        Connection conectar=null;
        public Connection conectar(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio","root","Tomas.010716");
                JOptionPane.showMessageDialog(null, "Conexión exitosa", "Conexión",JOptionPane.INFORMATION_MESSAGE);
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null, "Sin conexión" +e, "Conexión",JOptionPane.ERROR_MESSAGE);
            }
        return conectar;
        }
    }