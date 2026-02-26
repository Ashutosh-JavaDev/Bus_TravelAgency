import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateBus extends JFrame implements ActionListener {
    JLabel title, Number, Name, Type;
    JTextField numberField, nameField;
    JRadioButton normal, ac;
    JButton save,edit;

    public CreateBus() {
        setTitle("LNCT Bus Travel");
        title = new JLabel("LNCT Travel");
        title.setBounds(50, 5, 150, 50);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        // Name
        Name = new JLabel("Bus Name");
        Name.setBounds(20, 40, 100, 50);
        Name.setFont(new Font("Arial", Font.BOLD, 15));
        add(Name);
        nameField = new JTextField();
        nameField.setBounds(20, 80, 120, 30);
        nameField.setFont(new Font("Arial", Font.BOLD, 10));
        add(nameField);
        // Number
        Number = new JLabel("Bus Number");
        Number.setBounds(20, 120, 100, 50);
        Number.setFont(new Font("Arial", Font.BOLD, 15));
        add(Number);
        numberField = new JTextField();
        numberField.setBounds(20, 160, 120, 30);
        numberField.setFont(new Font("Arial", Font.BOLD, 10));
        add(numberField);
        // Type
        Type = new JLabel("Bus Type");
        Type.setBounds(20, 200, 100, 50);
        Type.setFont(new Font("Arial", Font.BOLD, 15));
        add(Type);
        // Normal
        normal = new JRadioButton("Normal");
        normal.setBounds(20, 230, 100, 30);
        normal.setFont(new Font("Arial", Font.BOLD, 12));
        normal.setOpaque(false); // keeps background clean
        add(normal);

        ac = new JRadioButton("AC");
        ac.setBounds(130, 230, 60, 30);
        ac.setFont(new Font("Arial", Font.BOLD, 12));
        ac.setOpaque(false);
        add(ac);

        // Group them (IMPORTANT)
        ButtonGroup group = new ButtonGroup();
        group.add(normal);
        group.add(ac);

        // Optional: set default selection
        normal.setSelected(true);
        // Button
        save = new JButton("SAVE");

        save.setBounds(20, 280, 100, 30);
        save.setFont(new Font("Arial", Font.BOLD, 15));

        save.setForeground(Color.WHITE);
        save.setBackground(Color.BLACK);

        save.setFocusPainted(false);
        save.setBorderPainted(false);
        save.setContentAreaFilled(true);
        save.setOpaque(true);

        add(save);
        save.addActionListener(this);
        // Edit
        edit = new JButton("EDIT");

        edit.setBounds(200, 280, 100, 30);
        edit.setFont(new Font("Arial", Font.BOLD, 15));
        edit.setForeground(Color.WHITE);
        edit.setBackground(Color.BLACK);

        edit.setFocusPainted(false);
        edit.setBorderPainted(false);
        edit.setContentAreaFilled(true);
        edit.setOpaque(true);

        add(edit);
        edit.addActionListener(this);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(400, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == save) {
    
            String namefield = nameField.getText().trim();
            String numberfield = numberField.getText().trim();
    
            if (namefield.isEmpty() || numberfield.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required");
                return;
            }
    
            String choice = normal.isSelected() ? "Normal" : "AC";
    
            try (Connection conn = Database.getConnection();
                 PreparedStatement ps = conn.prepareStatement(
                         "INSERT INTO bus(Number, Name, Bus_Type) VALUES (?, ?, ?)")) {
    
                ps.setString(1, numberfield);
                ps.setString(2, namefield);
                ps.setString(3, choice);
    
                int rows = ps.executeUpdate();
    
                if (rows > 0) {
                    JOptionPane.showMessageDialog(this, "Inserted Successfully");
    
                    // Clear fields after insert
                    nameField.setText("");
                    numberField.setText("");
                    normal.setSelected(true);
                }
    
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
            }
        }
        if(e.getSource()==edit){
            setVisible(false);
           new UpdateBus().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new CreateBus();
    }

}
