import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bus extends JFrame implements ActionListener {
    JLabel ID,Number,Pickup,Destination,DateofTravel,available;
    JTextField idField,numberField,pickupField,destinationField,dateofTravelField,availableField;
    JButton save;
    public Bus() {
        setTitle("LNCT Bus Travel");

        add(rootPane);
        // Default
        setLayout(null);
        setSize(800,500);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new Bus();
    }

}
