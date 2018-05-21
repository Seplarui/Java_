package teststatement;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestStatement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.jdbc.Driver");

            Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost/Ejemplo", "root", "");
            System.out.println("Argumentos del main" + args.length);
            
            String dep=args[0];
            String dnombre=args[1];
            String loc=args[2];
            
            String sql= "INSERT INTO departamentos VALUES ("+dep+",'"+dnombre+"', '"+loc+"')";
            System.out.println(sql);
            

    }

}
