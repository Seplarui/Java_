import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testStatement {

	public static void main(String[] args) throws ClassNotFoundException {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost/Ejemplo", "root", "");

			System.out.println("Argumentos del main: " + args.length);
			String dep = args[0];
			String dnombre = args[1];
			String loc = args[2];

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
