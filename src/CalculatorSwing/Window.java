package CalculatorSwing;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        setBounds(100,100,800,580);

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Calculator");

        setLayout(null);

        JButton[] buttons1 =
                {       new JButton("1"),
                        new JButton("2"),
                        new JButton("3"),
                        new JButton("+")
                };

        JButton[] buttons2 =
                {       new JButton("4"),
                        new JButton("5"),
                        new JButton("6"),
                        new JButton("-")
                };

        JButton[] buttons3 =
                {       new JButton("7"),
                        new JButton("8"),
                        new JButton("9"),
                        new JButton("*")
                };
        JButton[] buttons4 =
                {       new JButton("0"),
                        new JButton("="),
                        new JButton(":"),
                        new JButton("CLEAR")
                };

        int x = 10;
        int y = 100;

        for (int i = 0; i < buttons1.length; i++) {
            buttons1[i].setBounds(x,y,180,100);
            add(buttons1[i]);
            x += 190;
        }
        y = 210;
        x = 10;

        for (int i = 0; i < buttons2.length; i++) {
            buttons2[i].setBounds(x,y,180,100);
            add(buttons2[i]);
            x += 190;
        }

        x = 10;
        y = 320;

        for (int i = 0; i < buttons3.length; i++) {
            buttons3[i].setBounds(x,y,180,100);
            add(buttons3[i]);
            x += 190;
        }

        y = 430;
        x = 10;

        for (int i = 0; i < buttons4.length; i++) {
            buttons4[i].setBounds(x,y,180,100);
            add(buttons4[i]);
            x += 190;
        }

        JTextField textField = new JTextField();

        textField.setBounds(10,10,780,80 );
        textField.setColumns(100);
        add(textField);



    }
}
