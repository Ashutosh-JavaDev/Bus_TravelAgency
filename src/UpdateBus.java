import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

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
    JLabel title, name, number, type, selection, id;
    JTextField namField, numField, idField;
    JRadioButton normal, ac, Name, Number, Type, All;
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
        // ID
        id = new JLabel("Enter Bus ID");
        id.setBounds(10, 90, 180, 25);
        id.setFont(new Font("Roboto", Font.BOLD, 15));
        add(id);
        idField = new JTextField();
        idField.setBounds(10, 115, 150, 25);
        idField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(idField);
        // Save
        nameSave = new JButton("Save");

        nameSave.setBounds(10, 170, 100, 30);
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
        setSize(300, 250);
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
        // ID
        id = new JLabel("Enter Bus ID");
        id.setBounds(10, 90, 180, 25);
        id.setFont(new Font("Roboto", Font.BOLD, 15));
        add(id);
        idField = new JTextField();
        idField.setBounds(10, 115, 150, 25);
        idField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(idField);
        // Save
        numberSave = new JButton("Save");

        numberSave.setBounds(10, 170, 100, 30);
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
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void TYPE() {
        // Type
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
        ac.setBounds(10, 90, 120, 25); // Different Y position
        ac.setFont(new Font("Roboto", Font.BOLD, 12));
        ac.setOpaque(false);
        add(ac);
        // ID
        id = new JLabel("Enter Bus ID");
        id.setBounds(10, 120, 180, 25);
        id.setFont(new Font("Roboto", Font.BOLD, 15));
        add(id);
        idField = new JTextField();
        idField.setBounds(10, 150, 150, 25);
        idField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(idField);
        // Group
        ButtonGroup group = new ButtonGroup();
        group.add(normal);
        group.add(ac);

        // Default selection
        normal.setSelected(true);

        // Save Button
        TypeSave = new JButton("Save");
        TypeSave.setBounds(10, 190, 100, 30);
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
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // All
    public void ALL() {
        // Name
        name = new JLabel("Enter New Bus Name");
        name.setBounds(10, 40, 180, 25);
        name.setFont(new Font("Roboto", Font.BOLD, 15));
        add(name);
        namField = new JTextField();
        namField.setBounds(10, 70, 150, 25);
        namField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(namField);
        // Number
        number = new JLabel("Enter New Bus Number");
        number.setBounds(10, 105, 200, 25);
        number.setFont(new Font("Roboto", Font.BOLD, 15));
        add(number);
        numField = new JTextField();
        numField.setBounds(10, 135, 150, 25);
        numField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(numField);
        // Type
        type = new JLabel("Choose New Bus Type");
        type.setBounds(10, 170, 200, 25);
        type.setFont(new Font("Roboto", Font.BOLD, 15));
        add(type);
        // Normal Button
        normal = new JRadioButton("Normal");
        normal.setBounds(10, 200, 120, 25);
        normal.setFont(new Font("Roboto", Font.BOLD, 12));
        normal.setOpaque(false);
        add(normal);

        // AC Button
        ac = new JRadioButton("AC");
        ac.setBounds(10, 230, 120, 25); // Different Y position
        ac.setFont(new Font("Roboto", Font.BOLD, 12));
        ac.setOpaque(false);
        add(ac);

        // Group
        ButtonGroup group = new ButtonGroup();
        group.add(normal);
        group.add(ac);

        // Default selection
        normal.setSelected(true);
        // ID
        id = new JLabel("Enter Bus ID");
        id.setBounds(10, 265, 180, 25);
        id.setFont(new Font("Roboto", Font.BOLD, 15));
        add(id);
        idField = new JTextField();
        idField.setBounds(10, 300, 150, 25);
        idField.setFont(new Font("Roboto", Font.BOLD, 10));
        add(idField);
        // Save Button
        TypeSave = new JButton("Save");
        TypeSave.setBounds(10, 355, 100, 30);
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
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    UpdateBus() {
        setTitle("Update Value");
        title = new JLabel("Update Values");
        title.setBounds(80, 5, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        selection = new JLabel("What do you want to Edit");
        selection.setBounds(10, 50, 300, 40);
        selection.setFont(new Font("Arial", Font.BOLD, 17));
        add(selection);
        // Name Button
        Name = new JRadioButton("Bus Name");
        Name.setBounds(10, 100, 120, 25);
        Name.setFont(new Font("Roboto", Font.BOLD, 12));
        Name.setOpaque(false);
        add(Name);

        // Number Button
        Number = new JRadioButton("Bus Number");
        Number.setBounds(10, 130, 120, 25); // Different Y position
        Number.setFont(new Font("Roboto", Font.BOLD, 12));
        Number.setOpaque(false);
        add(Number);
        // Type
        Type = new JRadioButton("Bus Type");
        Type.setBounds(10, 160, 120, 25); // Different Y position
        Type.setFont(new Font("Roboto", Font.BOLD, 12));
        Type.setOpaque(false);
        add(Type);
        // All
        All = new JRadioButton("All");
        All.setBounds(10, 190, 120, 25); // Different Y position
        All.setFont(new Font("Roboto", Font.BOLD, 12));
        All.setOpaque(false);
        add(All);
        // Group
        ButtonGroup group = new ButtonGroup();
        group.add(Name);
        group.add(Number);
        group.add(Type);
        group.add(All);
        // Default selection
        Name.setSelected(true);
        Save = new JButton("Save");
        Save.setBounds(10, 230, 100, 30);
        Save.setFont(new Font("Arial", Font.BOLD, 14));
        Save.setForeground(Color.WHITE);
        Save.setBackground(Color.BLACK);
        Save.setFocusPainted(false);
        Save.setBorderPainted(false);
        Save.setOpaque(true);
        add(Save);
        Save.addActionListener(this);

        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(300, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Save) {

            getContentPane().removeAll();
            repaint();

            if (Name.isSelected()) {
                NAME();
            } else if (Number.isSelected()) {
                NUMBER();
            } else if (Type.isSelected()) {
                TYPE();
            } else if (All.isSelected()) {
                ALL();
            }
        }
        try (Connection connection = Database.getConnection();) {
            String query = "update bus set Name=? where ID=?";
            PreparedStatement Nam = connection.prepareStatement(query);
            if (ae.getSource() == nameSave) {
                String namefield = namField.getText();
                String idfield = idField.getText();
                if (namefield.isEmpty() || idfield.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Fields not should be empty");
                }
                Nam.setString(1, namefield);
                Nam.setInt(2, Integer.parseInt(idfield));
                int result = Nam.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Updated Successfully");

                    // Clear fields after insert
                    namField.setText("");
                    idField.setText("");

                }
            }
            String num = "update bus set Number=? where ID=?";
            PreparedStatement Num = connection.prepareStatement(num);
            if (ae.getSource() == numberSave) {
                String numfield = numField.getText();
                String idfield = idField.getText();
                if (numfield.isEmpty() || idfield.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Fields not should be empty");
                }
                Num.setString(1, numfield);
                Num.setInt(2, Integer.parseInt(idfield));

                int result = Num.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Updated Successfully");

                    // Clear fields after insert
                    numField.setText("");
                    idField.setText("");

                }
            }
            String ty = "update bus set Bus_Type=? where ID=?";
            PreparedStatement Ty = connection.prepareStatement(ty);
            if (ae.getSource() == TypeSave) {
                String choice = null;
                String idfield = idField.getText();
                if (normal.isSelected()) {
                    choice = "Normal";
                }
                if (ac.isSelected()) {
                    choice = "AC";
                }
                Ty.setString(1, choice);
                Ty.setInt(2, Integer.parseInt(idfield));
                int result = Ty.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Updated Successfully");

                    // Clear fields after insert
                    normal.setSelected(true);
                    idField.setText("");

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }

    public static void main(String[] args) {
        new UpdateBus();
    }
}
