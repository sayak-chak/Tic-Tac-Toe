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

    public boolean gameOver() {
        return gameOverAlongARow() || gameOverAlongAColumn() || gameOverAlongADiagonal();
    }

    private boolean gameOverAlongADiagonal() {
        int rowIndex = Constraint.startingIndex, colIndex = Constraint.startingIndex;
        Move check = grid[rowIndex][colIndex];
        while (colIndex < Constraint.lengthOfGridSide && rowIndex < Constraint.lengthOfGridSide) {
            if (grid[rowIndex++][colIndex++] != check) return false;
        }
        return true;
    }

    private boolean gameOverAlongAColumn() {
        for (int colIndex = Constraint.startingIndex; colIndex < Constraint.lengthOfGridSide; colIndex++) {
            Move check = grid[Constraint.startingIndex][colIndex];
            for (int rowIndex = Constraint.startingIndex; rowIndex < Constraint.lengthOfGridSide; rowIndex++) {
                if (grid[rowIndex][colIndex] != check) return false;
            }
        }
        return true;
    }

    private boolean gameOverAlongARow() {
        for (Move[] row : grid) {
            int rowIndex = Constraint.startingIndex;
            Move check = row[rowIndex];
            for (Move move : row) {
                if (move != check) return false;
            }
        }
        return true;
    }

    private int getIndex(int position) {
        return position - 1;
    }

}
