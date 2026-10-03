import javax.swing.*; //accesses GUI components

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char CurrPlayer = 'X';

    //initializes board
    private static void initialBoard() {
        for(int i = 0; i<3; i++) {
            for(int k = 0; k<3;k++) {
                board[i][k] = ' ';
            }
        }
    }

    //prints out board on JOption
    private static void printBoard() {
        StringBuilder display = new StringBuilder("----------\n"); //builds string representation of the board
        for(int i = 0; i<3; i++) {
            for(int k = 0; k<3;k++) {
                display.append(board[i][k]);
                if(k <2) {
                    display.append("  | "); //alternates between --- and |
                }
            }
            display.append("\n");
            if(i <2) {
                display.append("----------\n");
            }
        }
        display.append("----------");
        JOptionPane.showMessageDialog(null, display.toString(),
                "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE); //displays message board to show current state of game
    }

    //prompts user to make their move
    private static void playerTurn() {
        int row;
        int col;

        while(true) {
            String input = JOptionPane.showInputDialog("Player " + CurrPlayer + ", please enter a row and column (to answer press 0, 1, or 2");
            //makes sure input is between 0 and 2
            if(input != null && input.matches("[0-2] [0-2]")) {
                String[] parts = input.split(" ");
                row = Integer.parseInt(parts[0]);
                col = Integer.parseInt(parts[1]);

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = CurrPlayer;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid move. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. enter numbers between 0 and 2", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //checks if player has won and who
    private static boolean whoWon() {
        for(int i = 0; i<3; i++) {
            if(board[i][0] == CurrPlayer && board[i][1] == CurrPlayer && board[i][2] == CurrPlayer) {
                return true; //checks rows
            }
            if (board[0][i] == CurrPlayer && board[1][i] == CurrPlayer && board[2][i] == CurrPlayer) {
                return true; //checks columns
            }
        }

        //checks if all X or O are diagonal
        if (board[0][0] == CurrPlayer && board[1][1] == CurrPlayer && board[2][2] == CurrPlayer) {
            return true;
        }
        if (board[0][2] == CurrPlayer && board[1][1] == CurrPlayer && board[2][0] == CurrPlayer) {
            return true;
        }
        //if there is a free slot, it will return false and continue game
        return false;
    }

    private static boolean boardIsFull() {
        for(int i = 0; i<3;i++) {
            for(int e= 0; e<3;e++) {
                if(board[i][e] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initialBoard(); //calls method to display the board

        while(true) {
            printBoard();
            playerTurn();

            if(whoWon()) {
                printBoard();
                JOptionPane.showMessageDialog(null, "Player " + CurrPlayer + " wins!", "game over", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            if(boardIsFull()) {
                printBoard();
                JOptionPane.showMessageDialog(null, "It's a draw!", "game over", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            CurrPlayer = (CurrPlayer == 'X') ? 'O' : 'X'; // ternary operator
            //is current player X? yes? then O! no? then X!
        }

        int playAgain = JOptionPane.showConfirmDialog(null, "Do you wish to play again?", "Play again", JOptionPane.YES_NO_OPTION);
            if(playAgain == JOptionPane.YES_OPTION) {
                main(args);
            } else {
                System.exit(0);
            }
    }
}
