public class TicTacToe {
    Grid grid;
    Player playerOne, playerTwo;

    public TicTacToe(Grid grid, Player playerOne, Player playerTwo) {
        this.grid = grid;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public boolean gameOver() {
        return true;
    }
}
