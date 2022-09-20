package XOGameButtons;

import javax.swing.*;

public class SettingsWindow extends JFrame {

    private GameWindow gameWindow;

    private static int MIN_FIELD_SIZE = 3;
    private static int MAX_FIELD_SIZE = 10;


    private JRadioButton radioButtonHvsH = new JRadioButton("Player vs Player");
    private JRadioButton radioButtonHvsAi = new JRadioButton("Player vs Computer",true);
    private ButtonGroup gameMode = new ButtonGroup();

    private JSlider sliderFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
    private JSlider sliderDotsToWin = new JSlider(MIN_FIELD_SIZE,MIN_FIELD_SIZE,MIN_FIELD_SIZE);

    public SettingsWindow(GameWindow gameWindow){
        this.gameWindow = gameWindow;



    }
}
