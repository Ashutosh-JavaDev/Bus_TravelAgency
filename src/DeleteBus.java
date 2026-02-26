
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBus extends JFrame implements ActionListener {
    JLabel title, id;
    JTextField idField;
    JButton Allsa;

    DeleteBus() {
        setTitle("Delete Value");
        title = new JLabel("Delete Values");
        title.setBounds(80, 5, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        id = new JLabel("Enter Bus ID");
        id.setBounds(10, 50, 180, 25);
        id.setFont(new Font("Roboto", Font.BOLD, 15));
        add(id);
        idField = new JTextField();
        idField.setBounds(10, 85, 150, 25);
        idField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(idField);
        // Save
        Allsa = new JButton("Save");

        Allsa.setBounds(10, 140, 100, 30);
        Allsa.setFont(new Font("Arial", Font.BOLD, 15));
        Allsa.setForeground(Color.WHITE);
        Allsa.setBackground(Color.BLACK);

        Allsa.setFocusPainted(false);
        Allsa.setBorderPainted(false);
        Allsa.setContentAreaFilled(true);
        Allsa.setOpaque(true);

        add(Allsa);
        Allsa.addActionListener(this);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Allsa) {
            String id = idField.getText();
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Insert Value first");
            }
            try (Connection conn = Database.getConnection();) {
                String query = "select * from bus where ID=?";
                PreparedStatement state = conn.prepareStatement(query);
                state.setInt(1, Integer.parseInt(id));
                ResultSet rs = state.executeQuery();
                if (rs.next()) {
                    String Squery = "delete from bus where ID=?";
                    PreparedStatement pstate = conn.prepareStatement(Squery);
                    pstate.setInt(1, Integer.parseInt(id));
                    pstate.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Data Deleted");

                } else {
                    JOptionPane.showMessageDialog(this, "Data Not Found");

                }

            }

            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }

    public static void main(String[] args) {
        new DeleteBus();
    }
}
