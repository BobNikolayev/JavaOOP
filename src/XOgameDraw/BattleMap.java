package XOgameDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class BattleMap extends JPanel {

    private GameWindow gameWindow;

    private int gameMode;
    private int fieldSizeX;
    private int fieldSizeY;
    private int dotsToWin;

    private int cellHeight;
    private int cellWight;

    private boolean isInit = false;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.pink);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(isInit){
                    mouseReleasedUpdate(e);
                }

            }
        });

    }

    private void mouseReleasedUpdate(MouseEvent e) {

        int cellX = e.getX() / cellWight;
        int cellY = e.getY() / cellHeight;

        System.out.printf("cellX: %d cellY: %d \n" ,cellX ,cellY ) ;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g){
        if(!isInit){
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeX;
        cellWight = panelWidth / fieldSizeY;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0,y,panelWidth,y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWight;
            g.drawLine(x,0,x,panelHeight);
        }
    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin){

        System.out.printf("BM gameMode: %d fieldSizeX: %d fieldSizeY: %d dotsToWin: %d\n",gameMode,fieldSizeX,fieldSizeY,dotsToWin);

        this.gameMode = gameMode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.dotsToWin = dotsToWin;

        isInit = true;

        repaint();
    }
}
