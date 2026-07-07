import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    private final String url = "jdbc:mysql://localhost:3306/leiloesdb?useSSL=false";
    private final String user = "root"; 
    private final String password = "Isales1310#"; 
    
    public Connection connectDB() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Estabelece a conexão
            conn = DriverManager.getConnection(url, user, password);
            
            // JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
}
