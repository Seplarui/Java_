package DAO;

//Dos métodos: findById y findAll
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

	public cliente findById(Connection con, cliente cli) throws Exception {

		cliente c = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement("SELECT * FROM clientes where id=?");
			stmt.setString(1, cli.getId());
			rs = stmt.executeQuery();

			while (rs.next()) {
				c = new cliente();
				obtenClienteFila(rs, c);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new Exception("Ha habido un problema al buscar el cliente por DNI" + ex.getMessage());
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
		}
		return c;
	}

	private void obtenClienteFila(ResultSet rs, cliente cli) throws SQLException {
		cli.setId(rs.getString("id"));
		cli.setNotas(rs.getString("notas"));
	}

	public List<cliente> findAll(Connection con) throws Exception {
		List<cliente> listaClientes = new ArrayList();
		Statement st = null;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * from clientes");
			cliente cli = null;

			while (rs.next()) {
				cli = new cliente();
				obtenClienteFila(rs, cli);
				listaClientes.add(cli);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new Exception("Ha habido un problema al buscar el cliente por Nick " + ex.getMessage());
		} finally {

			if (rs != null)
				rs.close(); // Cerramos el resultset
			if (st != null)
				st.close(); // Cerramos el Statement

		}

		return listaClientes;
	}

}
