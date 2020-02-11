public class Player {
    Grid grid;

    public Player(Grid grid) {
        this.grid = grid;
    }

    public void place(Move move) {
        grid.place(move, 1, 1);
    }
}
