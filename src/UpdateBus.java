import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

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
    JLabel title, name, number, type,selection;
    JTextField namField, numField;
    JRadioButton normal,ac,Name,Number,Type;
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
        type.setBounds(10, 30, 200, 25);
        type.setFont(new Font("Roboto", Font.BOLD, 15));
        add(type);
        
        // Normal Button
        normal = new JRadioButton("Normal");
        normal.setBounds(10, 60, 120, 25);
        normal.setFont(new Font("Roboto", Font.BOLD, 12));
        normal.setOpaque(false);
        add(normal);
        
        // AC Button
        ac = new JRadioButton("AC");
        ac.setBounds(10, 90, 120, 25);   // Different Y position
        ac.setFont(new Font("Roboto", Font.BOLD, 12));
        ac.setOpaque(false);
        add(ac);
        
        // Group
        ButtonGroup group = new ButtonGroup();
        group.add(normal);
        group.add(ac);
        
        // Default selection
        normal.setSelected(true);
        
        // Save Button
        TypeSave = new JButton("Save");
        TypeSave.setBounds(10, 130, 100, 30);
        TypeSave.setFont(new Font("Arial", Font.BOLD, 14));
        TypeSave.setForeground(Color.WHITE);
        TypeSave.setBackground(Color.BLACK);
        TypeSave.setFocusPainted(false);
        TypeSave.setBorderPainted(false);
        TypeSave.setOpaque(true);
        
        add(TypeSave);
        TypeSave.addActionListener(this);
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
        title.setBounds(150, 5,200, 30);
        title.setFont(new Font("Arial", Font.BOLD,20));
        add(title);
        selection=new JLabel("What do you want to Edit");
        selection.setBounds(10,40,300,40);
        selection.setFont(new Font("Arial", Font.BOLD,15));
        add(selection);
         // Name Button
         Name = new JRadioButton("Bus Name");
         Name.setBounds(10, 60, 120, 25);
         Name.setFont(new Font("Roboto", Font.BOLD, 12));
         Name.setOpaque(false);
         add(Name);
         
         // Number Button
         Number = new JRadioButton("Bus Number");
         Number.setBounds(10, 90, 120, 25);   // Different Y position
         Number.setFont(new Font("Roboto", Font.BOLD, 12));
         Number.setOpaque(false);
         add(Number);
         //Type
         Type = new JRadioButton("Bus Type");
         Type.setBounds(10, 90, 120, 25);   // Different Y position
         Type.setFont(new Font("Roboto", Font.BOLD, 12));
         Type.setOpaque(false);
         add(Type);
         // Group
         ButtonGroup group = new ButtonGroup();
         group.add(Name);
         group.add(Number);
         group.add(Type);
         
         // Default selection
         Name.setSelected(true);
         
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(400,450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        new UpdateBus();
    }
}
