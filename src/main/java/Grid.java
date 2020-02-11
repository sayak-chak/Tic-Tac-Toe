public class Grid {
    private Move[][] grid;

    Grid() {
        grid = Grid.create();
    }

    public static Move[][] create() {
        return new Move[Constraint.lengthOfGridSide][Constraint.lengthOfGridSide];
    }

    public void place(Move move, int rowNumber, int colNumber) {
        grid[getIndex(rowNumber)][getIndex(colNumber)] = move;
    }


    public Move getMoveAtPosition(int rowNumber, int colNumber) {
        return grid[getIndex(rowNumber)][getIndex(colNumber)];
    }

    private int getIndex(int position) {
        return position - 1;
    }
}
