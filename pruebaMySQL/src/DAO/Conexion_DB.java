package DAO;
import java.sql.*;

public class Conexion_DB {
    public Connection AbrirConexion() throws Exception {
        
//        Class.forName("com.mysql.jdbc.Driver");
        Connection con=null; //instancia una conexión
        
        try{
            String urlOdbc="jdbc:mysql://localhost:3306/di";
            
            //crea conexión. 
            
            con=(java.sql.DriverManager.getConnection(urlOdbc,"root",""));
            return con;
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception("Ha sido imposible establecer la conexión"+ e.getMessage());
            
        }
    }
    
    public void CerrarConexion(Connection con) throws Exception {
        
        try {
            if(con!=null) 
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Ha sido imposible cerrar la conexión"+e.getMessage());
        }
    }
    
}
