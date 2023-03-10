// TicTacToe needs a board to play on
// this is the board for TicTacToe
public abstract class Board {

    // this is the multi-dimensional array to hold the board's move choices; must be static
    static String[][] board;

    // prints the game board; must be static
    static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.printf("| %s | %s | %s |\n", board[0][0], board[0][1], board[0][2]);
        System.out.println("|-----------|");
        System.out.printf("| %s | %s | %s |\n", board[1][0], board[1][1], board[1][2]);
        System.out.println("|-----------|");
        System.out.printf("| %s | %s | %s |\n", board[2][0], board[2][1], board[2][2]);
        System.out.println("\\---|---|---/");

    }
}

// Disclaimer:
// The given assignment description, project files, code files and/or solution files
// should not be made available in a public form via methods such as online hosting
// in code repositories, educational resource hosting websites, etc. such as Course
// Hero and/or Chegg. Tracking information is embedded into the assignment files and
// any person found to be distributing files may be prosecuted. This includes
// notification to the college, any discipline it warrants and legal action if
// it is warranted.