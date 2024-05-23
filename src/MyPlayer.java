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
                        System.out.println("BOARD");

                        System.out.println(x + " "+ a + " " + b);
                        System.out.println("resulting boards");
                        int B= b;
                        while( B>0){
                            B= B-1;
                            System.out.println(x + " " + a + " " + B );
                        }

                        B=b;
                        int A= a;
                        while( A>0){
                            A=A-1;
                            if(B>A){
                                B=B-1;
                            }
                            System.out.println(x + " " + A + " " + B );
                        }
                        B=b;
                        int X= x;
                        while( X>0){
                            X=X-1;
                            if(A>X && B>X){
                                X=X-1;
                            }
                            System.out.println(X + " " + A + " " + B );
                        }


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


