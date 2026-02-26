import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Database {
    private static final String url = "jdbc:mysql://localhost:3306/Bus_Travel";
    private static final String username = "root";
    private static final String password = "@Radhakrishna297";

    Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection=DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Class Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) throws Exception {
        new Database();
    }
}
