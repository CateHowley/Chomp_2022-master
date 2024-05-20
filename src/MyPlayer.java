import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
        for (int x = 1; x < 4; x++) {
            for (int a = 0; a < 4; a++) {
                //System.out.println(a);
                for (int b = 0; b < 4; b++) {
                    //System.out.println(b);
                    if (a<=x && b<=a){
                        System.out.println(x + " "+ a + " " + b);
                        System.out.println("resulting boards");
                        if( b<=0){
                            System.out.println(x + " " + a + " " + 0 );

                        };
                    }










                }
            }
        }
    }

        public Point move (Chip[][]pBoard){

            System.out.println("MyPlayer Move");

            gameBoard = pBoard;
            int column = 0;
            int row = 0;

            row = 1;
            column = 1;


            /***
             * This code will run each time the "MyPlayer" button is pressed.
             * Add your code to return the row and the column of the chip you want to take.
             * You'll be returning a data type called Point which consists of two integers.
             */

            Point myMove = new Point(row, column);
            return myMove;
        }

    }


