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
    JLabel title, name, number, type;
    JTextField namField, numField;
    JRadioButton typeRadioButton;
    JButton nameSave, numberSave, TypeSave, Save;

    public void NAME() {
        // name
        name = new JLabel("Enter New Bus Name");
        name.setBounds(10, 30, 180, 25);
        name.setFont(new Font("Roboto", Font.BOLD, 15));
        add(name);
        namField = new JTextField();
        namField.setBounds(10, 60, 150, 25);
        namField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(namField);
        // Save
        nameSave = new JButton("Save");

        nameSave.setBounds(10, 100, 100, 30);
        nameSave.setFont(new Font("Arial", Font.BOLD, 15));
        nameSave.setForeground(Color.WHITE);
        nameSave.setBackground(Color.BLACK);

        nameSave.setFocusPainted(false);
        nameSave.setBorderPainted(false);
        nameSave.setContentAreaFilled(true);
        nameSave.setOpaque(true);

        add(nameSave);
        nameSave.addActionListener(this);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void NUMBER() {
        // name
        number = new JLabel("Enter New Bus Number");
        number.setBounds(10, 30, 200, 25);
        number.setFont(new Font("Roboto", Font.BOLD, 15));
        add(number);
        numField = new JTextField();
        numField.setBounds(10, 60, 150, 25);
        numField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(numField);
        // Save
        numberSave = new JButton("Save");

        numberSave.setBounds(10, 100, 100, 30);
        numberSave.setFont(new Font("Arial", Font.BOLD, 15));
        numberSave.setForeground(Color.WHITE);
        numberSave.setBackground(Color.BLACK);

        numberSave.setFocusPainted(false);
        numberSave.setBorderPainted(false);
        numberSave.setContentAreaFilled(true);
        numberSave.setOpaque(true);

        add(numberSave);
        numberSave.addActionListener(this);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void TYPE() {
        // name
        type = new JLabel("Choose New Bus Type");
        type.setBounds(10, 30, 180, 25);
        type.setFont(new Font("Roboto", Font.BOLD, 15));
        add(type);
        typeRadioButton = new JRadioButton();
        typeRadioButton.setBounds(10, 60, 150, 25);
        typeRadioButton.setFont(new Font("Roboto", Font.BOLD, 10));
        add(typeRadioButton);
        // Save
        nameSave = new JButton("Save");

        nameSave.setBounds(10, 100, 100, 30);
        nameSave.setFont(new Font("Arial", Font.BOLD, 15));
        nameSave.setForeground(Color.WHITE);
        nameSave.setBackground(Color.BLACK);

        nameSave.setFocusPainted(false);
        nameSave.setBorderPainted(false);
        nameSave.setContentAreaFilled(true);
        nameSave.setOpaque(true);

        add(nameSave);
        nameSave.addActionListener(this);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    UpdateBus() {
        setTitle("Update Value");
        title = new JLabel("Update Values");
        title.setBounds(300, 5, 200, 20);
        title.setFont(new Font("Arial", Font.BOLD, 15));
        add(title);
        NAME();
        // Default
        // setLocation(600, 200);
        // setLayout(null);
        // setSize(800, 650);
        // setVisible(true);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        new UpdateBus();
    }
}
