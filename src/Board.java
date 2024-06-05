public class Board{

    //what move to make
    int Column;
    int Row;
    // what board im looking at
    int X;
    int A;
    int B;
    String life;



    public Board(int pColumn, int pRow, int pX, int pA, int pB, int plife) {
        Column = pColumn;
        Row = pRow;
        X= pX;
        A = pA;
        B = pB;
        int life = plife;


    }
    public void printInfo(){
        //System.out.println("Column ="+  Column);
        //System.out.println("row number ="+ Row);
        //System.out.println("Board =" + X+","+A+","+B);
        System.out.println("The Board " +X+A+B+ " the next move would be"+ Row+ Column + "This board is a"+ life + " board");


    }

}









