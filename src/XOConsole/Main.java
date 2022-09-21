package XOConsole;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

       while (true){

           humanTurn();
           printMap();

           if(isMapFull()){
               System.out.println("Draw");
               break;
           }

           computerTurn();
           printMap();

           if(isMapFull()){
               System.out.println("Draw");
               break;
           }

       }
    }

    public static void initMap(){

        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(){

        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn(){

        int x;
        int y;

        do {

            System.out.println("Enter coordinate of your turn X,Y");

            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

        }while (!isCellEmpty(y,x));

        map[y][x] = DOT_X;

    }

    public static boolean isCellEmpty(int y,int x){

        if(x < 0 || y < 0 || x > SIZE || y > SIZE){
            return false;
        }

        return  map[y][x] == DOT_EMPTY;

    }

    public static void computerTurn(){

        int x;
        int y;

        do {

            System.out.println("Enter coordinate of your turn X,Y");

            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        }while (!isCellEmpty(y,x));

        map[y][x] = DOT_O;

    }

    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c){



        return false;
    }
}