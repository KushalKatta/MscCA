/*  Types of Layout   */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Layouts extends JFrame
{
    JLabel label1;

    JLabel labelName;
    JTextField textName;
    JPanel panelName;

    JLabel labelAddress;
    JTextField textAddress;
    JPanel panelAddress;

    JButton btnSubmit;
    JButton btnCancel;
    JPanel panelButton;

    Layouts()
    {
        label1 = new JLabel("Welcome To This Software!");
        
        panelName = new JPanel();
        panelName.setLayout(new BorderLayout());
        labelName = new JLabel("Name");
        textName = new JTextField(15);
        panelName.add(labelName, BorderLayout.WEST);
        panelName.add(textName, BorderLayout.EAST);

        panelAddress = new JPanel();
        panelAddress.setLayout(new BorderLayout());
        labelAddress = new JLabel("Address");
        textAddress = new JTextField(15);
        panelAddress.add(labelAddress, BorderLayout.WEST);
        panelAddress.add(textAddress, BorderLayout.EAST);

        panelButton = new JPanel();
        panelButton.setLayout(new BorderLayout());
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");
        panelButton.add(btnSubmit, BorderLayout.WEST);
        panelButton.add(btnCancel, BorderLayout.EAST);
    }

    
    public static void main(String[] args) {
        Layouts obj = new Layouts();
        obj.setSize(400,300);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(Layouts.EXIT_ON_CLOSE);
        obj.setLayout(new BorderLayout());


        obj.add(obj.label1, BorderLayout.NORTH);

        // BoxLayout centerBox = new BoxLayout(BoxLayout.Y_AXIS);
        JPanel centerPane=new JPanel();
        centerPane.setLayout(new BoxLayout(centerPane, BoxLayout.Y_AXIS));
        centerPane.add(obj.panelName);
        centerPane.add(obj.panelAddress);
        obj.add(centerPane, BorderLayout.CENTER);

        obj.add(obj.panelButton, BorderLayout.SOUTH);
    }
}