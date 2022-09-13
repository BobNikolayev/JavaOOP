package CalculatorSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    public boolean plus = false;

    public boolean minus = false;

    public boolean multiplication = false;

    public boolean fraction = false;

    int result = 0;


    public StringBuilder equationText;

    public Window(){
        setBounds(100,100,800,580);

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Calculator");

        Font font = new Font("Arial",NORMAL,30);

        JTextArea textArea = new JTextArea();
        JTextArea textArea1 = new JTextArea();

        textArea.setFont(font);
        textArea1.setFont(font);

        textArea.setBounds(10,10,760,30 );
        textArea1.setBounds(10,50,760,30);
        add(textArea);
        add(textArea1);

        textArea.setFocusable(false);
        textArea1.setFocusable(false);

        textArea.setText("");
        textArea1.setText("");

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
                        new JButton("C")
                };

        int x = 10;
        int y = 100;

        for (int i = 0; i < buttons1.length; i++) {
            buttons1[i].setBounds(x,y,180,100);
            buttons1[i].setFont(font);
            add(buttons1[i]);
            x += 190;
        }
        y = 210;
        x = 10;

        for (int i = 0; i < buttons2.length; i++) {
            buttons2[i].setBounds(x,y,180,100);
            buttons2[i].setFont(font);
            add(buttons2[i]);
            x += 190;
        }

        x = 10;
        y = 320;

        for (int i = 0; i < buttons3.length; i++) {
            buttons3[i].setBounds(x,y,180,100);
            buttons3[i].setFont(font);
            add(buttons3[i]);
            x += 190;
        }

        y = 430;
        x = 10;

        for (int i = 0; i < buttons4.length; i++) {
            buttons4[i].setBounds(x,y,180,100);
            buttons4[i].setFont(font);
            add(buttons4[i]);
            x += 190;
        }



        keyAction(buttons1[0],textArea);
        keyAction(buttons1[1],textArea);
        keyAction(buttons1[2],textArea);
        keyAction(buttons2[0],textArea);
        keyAction(buttons2[1],textArea);
        keyAction(buttons2[2],textArea);
        keyAction(buttons3[0],textArea);
        keyAction(buttons3[1],textArea);
        keyAction(buttons3[2],textArea);
        keyAction(buttons4[0],textArea);

        buttons1[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plus = true;
                textArea1.setText(textArea.getText());
                textArea.setText("");
            }
        });

        buttons2[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minus = true;
                textArea1.setText(textArea.getText());
                textArea.setText("");
            }
        });

        buttons3[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplication = true;
                textArea1.setText(textArea.getText());
                textArea.setText("");
            }
        });

        buttons4[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fraction = true;
                textArea1.setText(textArea.getText());
                textArea.setText("");
            }
        });

        buttons4[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                textArea1.setText("");
            }
        });

        buttons4[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(plus){
                    int a = Integer.parseInt(textArea.getText());
                    int b = Integer.parseInt(textArea1.getText());
                    textArea.setText(Integer.toString(a += b));
                    textArea1.setText("");
                    plus = false;
                }
                if(minus){
                    int a = Integer.parseInt(textArea1.getText());
                    int b = Integer.parseInt(textArea.getText());
                    textArea.setText(Integer.toString(a -= b));
                    textArea1.setText("");
                    minus = false;
                }
                if(multiplication){
                    int a = Integer.parseInt(textArea.getText());
                    int b = Integer.parseInt(textArea1.getText());
                    textArea.setText(Integer.toString(a *=  b));
                    textArea1.setText("");
                    multiplication = false;
                }
                if(fraction){
                    int a = Integer.parseInt(textArea1.getText());
                    int b = Integer.parseInt(textArea.getText());
                    if( b == 0){
                        textArea.setText("IMPOSSIBLE SENTENCE");
                        textArea1.setText("");
                    }
                    textArea.setText(Integer.toString(a / b));
                    textArea1.setText("");
                    fraction = false;
                }

            }

        });





    }



    public void keyAction(JButton button,JTextArea text){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append(button.getText());
            }
        });
    }

//    public void keys(JButton[] buttons, JTextArea text){
//
//        int keyNumber;
//
//        for (int i = 0; i < buttons.length; i++) {
//
//            keyNumber = Integer.parseInt(buttons[i].getText());
//
//            int finalKeyNumber = keyNumber -= 1;
//            buttons[i].addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    text.append(buttons[finalKeyNumber].getText());
//                }
//            });
//        }
//    }


}
