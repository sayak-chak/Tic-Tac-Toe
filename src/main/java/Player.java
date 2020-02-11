public class Player {
    Grid grid;

    public Player(Grid grid) {
        this.grid = grid;
    }

    public void place() {
        grid.place(Move.X, 1, 1);
    }
}
