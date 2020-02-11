public class Grid {
    private Move[][] grid;

    Grid() {
        grid = Grid.create();
    }

    public static Move[][] create() {
        return new Move[RULE.lengthOfGridSide][RULE.lengthOfGridSide];
    }

    public void place() {
        grid[0][0] = Move.X;
    }


    public Move getMoveAtPosition() {
        return Move.X;
    }
}
