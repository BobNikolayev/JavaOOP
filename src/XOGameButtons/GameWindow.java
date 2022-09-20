package XOGameButtons;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    static final int WINDOW_COR_X = 400;
    static final int WINDOW_COR_Y = 400;
    static final int WINDOW_HEIGHT = 505;
    static final int WINDOW_WIDTH= 550;
    static final String TITLE = "XOGame";

    public GameWindow(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(WINDOW_COR_X,WINDOW_COR_Y,WINDOW_WIDTH,WINDOW_HEIGHT);

        Font font = new Font("Arial",NORMAL,15);

        setTitle("XOGame");

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton buttonSettings = new JButton("Settings");
        JButton buttonExit = new JButton("EXIT");

        buttonSettings.setBackground(Color.GREEN);
        buttonExit.setBackground(Color.red);

        panel.add(buttonSettings);
        panel.add(buttonExit);

        add(panel,BorderLayout.SOUTH);

        setVisible(true);

    }
}
