package XOgameDraw;

import javax.swing.*;
import java.awt.*;

class GameWindow extends JFrame {

     static final int WINDOW_COR_X = 400;
     static final int WINDOW_COR_Y = 400;
     static final int WINDOW_HEIGHT = 505;
     static final int WINDOW_WIDTH= 550;
     static final String TITLE = "XOGame";

     private SettingsWindow settingsWindow;
     private BattleMap battleMap;



    public GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(WINDOW_COR_X,WINDOW_COR_Y,WINDOW_WIDTH,WINDOW_HEIGHT);

        JPanel panel = new JPanel(new GridLayout(1,2));

        Font font = new Font("Arial",NORMAL,15);

        JButton buttonSettings = new JButton("Settings");
        JButton buttonExit = new JButton("EXIT");

        buttonSettings.setBackground(Color.GREEN);
        buttonExit.setBackground(Color.red);

        battleMap = new BattleMap(this);

        settingsWindow = new SettingsWindow(this);

        add(battleMap,BorderLayout.CENTER);

        buttonExit.addActionListener(e->{
            System.exit(0);
        });

        buttonSettings.addActionListener(e->{
            settingsWindow.setVisible(true);
        });

        buttonSettings.setFont(font);
        buttonExit.setFont(font);

        panel.add(buttonSettings);
        panel.add(buttonExit);

        add(panel,BorderLayout.SOUTH);


        setTitle(TITLE);

        setVisible(true);


    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin){
//        System.out.printf("gameMode: %d fieldSizeX: %d fieldSizeY: %d dotsToWin: %d\n",gameMode,fieldSizeX,fieldSizeY,dotsToWin);
        battleMap.startNewGame(gameMode,fieldSizeX,fieldSizeY,dotsToWin);
    }

}
