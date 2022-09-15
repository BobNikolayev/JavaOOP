package XOgame;

import javax.swing.*;
import javax.swing.plaf.SliderUI;
import java.awt.*;

public class SettingsWindow extends JFrame {

    private GameWindow gameWindow;

    private static int MIN_FIELD_SIZE = 3;
    private static int MAX_FIELD_SIZE = 10;


    private JRadioButton radioButtonHvsH = new JRadioButton("Player vs Player");
    private JRadioButton radioButtonHvsAi = new JRadioButton("Player vs Computer",true);
    private ButtonGroup gameMode = new ButtonGroup();

    private JSlider sliderFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
    private JSlider sliderDotsToWin = new JSlider(MIN_FIELD_SIZE,MIN_FIELD_SIZE,MIN_FIELD_SIZE);



    public SettingsWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBounds(GameWindow.WINDOW_COR_X + 30,GameWindow.WINDOW_COR_Y + 30,GameWindow.WINDOW_WIDTH - 100,GameWindow.WINDOW_HEIGHT - 200);

        setTitle("SETTINGS");

        setLayout(new GridLayout(8,1));

        add(new JLabel("Select Game mode"));

        add(radioButtonHvsAi);
        add(radioButtonHvsH);

        gameMode.add(radioButtonHvsH);
        gameMode.add(radioButtonHvsAi);

        add(new JLabel("Select Field size"));
        sliderFieldSize.setMajorTickSpacing(1);
        sliderFieldSize.setPaintLabels(true);
        sliderFieldSize.setPaintTicks(true);
        sliderFieldSize.setFont(new Font("Arial",NORMAL,10));
        add(sliderFieldSize);

        add(new JLabel("Select Dots to win"));
        sliderDotsToWin.setMajorTickSpacing(1);
        sliderDotsToWin.setPaintLabels(true);
        sliderDotsToWin.setPaintTicks(true);
        sliderDotsToWin.setFont(new Font("Arial",NORMAL,10));
        add(sliderDotsToWin);

        sliderFieldSize.addChangeListener(e -> {
            sliderDotsToWin.setMaximum(sliderFieldSize.getValue());
        });

        JButton startGame = new JButton("START");

        setVisible(true);



    }
}
