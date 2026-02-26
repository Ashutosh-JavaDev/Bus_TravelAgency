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

public class UpdateBus extends JFrame implements ActionListener {
    JLabel title,name,number,type;
    JTextField namField,numField,typeField;
    UpdateBus() {
        setTitle("Update Value");
        title=new JLabel("Update Values");
        title.setBounds(300, 5, 200, 20);
        title.setFont(new Font("Arial", Font.BOLD, 15));
        add(title);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(800, 650);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
