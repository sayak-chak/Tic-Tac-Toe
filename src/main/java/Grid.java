public class Grid {
    private Move[][] grid;

    Grid() {
        grid = Grid.create();
    }

    public static Move[][] create() {
        return new Move[RULE.lengthOfGridSide][RULE.lengthOfGridSide];
    }

    public void place(Move move) {
        grid[0][0] = move;
    }


    public Move getMoveAtPosition() {
        return grid[0][0];
    }
}
