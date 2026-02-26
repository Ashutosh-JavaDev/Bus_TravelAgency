import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bus extends JFrame implements ActionListener {
    JLabel title, Number,Name,Destination,DateofTravel,available;
    JTextField numberField,nameField,destinationField,dateofTravelField,availableField;
    JButton save;
    public Bus() {
        setTitle("LNCT Bus Travel");
        title=new JLabel("LNCT Travel");
        title.setBounds(300,5,150,50);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        // Number
        Name=new JLabel("Bus Name");
        Name.setBounds(20,40, 100,50);
        Name.setFont(new Font("Arial",Font.BOLD, 15));
        add(Name);
        nameField=new JTextField();
        nameField.setBounds(20,80,120,30);
        nameField.setFont(new Font("Arial",Font.BOLD, 10));
        add(nameField);
        // Pickup
        Number=new JLabel("Bus Number");
        Number.setBounds(20,120, 100,50);
        Number.setFont(new Font("Arial",Font.BOLD, 15));
        add(Number);
        numberField=new JTextField();
        numberField.setBounds(20,160,120,30);
        numberField.setFont(new Font("Arial",Font.BOLD, 10));
        add(numberField);
        // Default
        setLocation(600, 200);
        setLayout(null);
        setSize(800, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new Bus();
    }

}
