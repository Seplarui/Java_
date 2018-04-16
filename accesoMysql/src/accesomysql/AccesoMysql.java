package accesomysql;

import java.sql.*;

public class AccesoMysql {

    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
      
            
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection miconexion= DriverManager.getConnection("jdbc:mysql://localhost/di","root","");
        
        Statement sentencia= miconexion.createStatement();
        
        ResultSet resultado= sentencia.executeQuery("select * from clientes");
        
        
        while (resultado.next()) {
            System.out.println(resultado.getInt(2));
        }
        
        resultado.close();
        sentencia.close();
        miconexion.close();
        
    }
}
