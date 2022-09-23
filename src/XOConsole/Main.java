package XOConsole;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int SIZE = 6;
    static final int DOTS_TO_WIN = 4;

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
           if(checkWin(DOT_X)){
               System.out.println("win");
               break;
           }

           if(isMapFull()){
               System.out.println("Draw");
               break;
           }

           computerTurn();
           printMap();
           if(checkWin(DOT_O)){
               System.out.println("win");
               break;
           }

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

    static boolean checkLIne(int coordinateY, int coordinateX, int vectorY, int vectorX, char dot){
        if(coordinateX + vectorX * (DOTS_TO_WIN - 1) > SIZE - 1 || coordinateY + vectorY * (DOTS_TO_WIN -1) > SIZE - 1 ||
        coordinateY + vectorY * (DOTS_TO_WIN - 1) < 0){
            return false;
        }

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[coordinateY + i * vectorY][coordinateX + i * vectorX] != dot){
                return false;
            }
        }
        return true;
    }

//    public static boolean checkWin(char c){
//
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE - (DOTS_TO_WIN - 1); j++) {
//                if(map[i][j] == c && map[i][j+1] == c && map[i][j+2] == c){
//                    return true;
//                }
//            }
//        }
//        for (int i = 0; i < SIZE - (DOTS_TO_WIN - 1); i++) {
//            for (int j = 0; j < SIZE ; j++) {
//                if(map[i][j] == c && map[i+1][j] == c && map[i+2][j] == c){
//                    return true;
//                }
//            }
//        }
//        for (int i = 0; i < SIZE - (DOTS_TO_WIN - 1); i++) {
//            for (int j = 0; j < SIZE- (DOTS_TO_WIN - 1); j++) {
//                if(map[i][j] == c && map[i+1][j + 1] == c && map[i+2][j+2] == c){
//                    return true;
//                }
//            }
//        }
//
//        for (int i = 0; i < SIZE - (DOTS_TO_WIN - 1); i++) {
//            for (int j = 0; j < SIZE- (DOTS_TO_WIN - 1); j++) {
//                if(map[i][j+2] == c && map[i+1][j + 1] == c && map[i+2][j] == c){
//                    return true;
//                }
//            }
//        }
//
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE - (DOTS_TO_WIN - 1); j++) {
//                if(map[i][j] == c && map[i][j+1] == c && map[i][j+2] == c){
//                    return true;
//                }
//            }
//        }
//
//
//
//
//
//        return false;
//    }

    public static boolean checkWin(char dot){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(checkLIne(i,j,0,1,dot) || checkLIne(i,j,1,0,dot) || checkLIne(i,j,1,1,dot) ||
                checkLIne(i,j,-1,1,dot)){
                    return true;
                }
            }
        }
        return false;
    }
}
