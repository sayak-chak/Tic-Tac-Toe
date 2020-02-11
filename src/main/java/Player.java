public class Player {
    Grid grid;

    public Player(Grid grid) {
        this.grid = grid;
    }

    public void place(Move move, int rowNumber, int colNumber) {
        grid.place(move, rowNumber, colNumber);
    }
}
