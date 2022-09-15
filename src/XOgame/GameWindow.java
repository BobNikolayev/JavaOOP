package XOgame;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

     static final int WINDOW_COR_X = 400;
     static final int WINDOW_COR_Y = 400;
     static final int WINDOW_HEIGHT = 505;
     static final int WINDOW_WIDTH= 555;
     static final String TITLE = "XOGame";

     private SettingsWindow settingsWindow;
     private BattleMap battleMap;



    public GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(WINDOW_COR_X,WINDOW_COR_Y,WINDOW_WIDTH,WINDOW_HEIGHT);

        JPanel panel = new JPanel(new GridLayout(1,2));

        Font font = new Font("Arial",NORMAL,15);

        JButton settingsButton = new JButton("Settings");
        JButton buttonExit = new JButton("EXIT");

        settingsButton.setBackground(Color.GREEN);
        buttonExit.setBackground(Color.red);

        battleMap = new BattleMap(this);

        settingsWindow = new SettingsWindow(this);

        add(battleMap,BorderLayout.CENTER);

        buttonExit.addActionListener(e->{
            System.exit(0);
        });

        settingsButton.addActionListener(e->{
            settingsWindow.setVisible(true);
        });

        settingsButton.setFont(font);
        buttonExit.setFont(font);

        panel.add(settingsButton);
        panel.add(buttonExit);

        add(panel,BorderLayout.SOUTH);


        setTitle(TITLE);

        setVisible(true);

    }
}
