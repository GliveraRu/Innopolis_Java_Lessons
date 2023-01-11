import static java.util.Arrays.deepToString;

public class MassiveChessBoard {
    public static void main(String[] args) {
        String [] [] chessBoard = new String[8][8];
        for (int i =0; i<chessBoard.length; i++) {
            for (int j = 0; j<chessBoard[0].length;j++){
                if ((j+i)%2 == 0) chessBoard [i][j] = "W";
                else chessBoard [i][j] = "B";

            }
        }
        System.out.println(deepToString(chessBoard));
    }
}
