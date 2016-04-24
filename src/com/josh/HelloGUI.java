package com.josh;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kortasthekiller on 4/24/16.
 */
public class HelloGUI extends JFrame{
    private JPanel rootPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    protected HelloGUI() {
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFirstLabel.setText("Hello GUI!");
            }
        });
    }
}
