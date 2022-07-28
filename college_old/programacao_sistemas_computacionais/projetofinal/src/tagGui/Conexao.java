package tagGui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexao {

	public static Connection executar(String query) {
		Connection conn = null;
		
		
		try {
			
			String url = "jdbc:mysql://127.0.0.1:3306/db_portaria?user=root&password=1234";
			conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
            st.execute(query);
            conn.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Conexão" + erro.getMessage());
		}
		
		return conn;
		
	}
	
	public static ResultSet consultar(String query) {
		System.out.println("1");
		Connection conn = null;
        try {
        	System.out.println("2");
        	System.out.println(query);
        	String url = "jdbc:mysql://127.0.0.1:3306/db_portaria?user=root&password=1234";
			conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
        	System.out.println("3");
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

}
