import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {
    private boolean checkIfGridsAreEqual(Move[][] expectedGrid, Move[][] actualGrid) {
        if (expectedGrid.length == actualGrid.length) {
            for (int i = 0; i < actualGrid.length; i++) {
                if (!Arrays.toString(expectedGrid[i]).equals(Arrays.toString(actualGrid[i]))) return false;
            }
            return true;
        }
        return false;
    }

    @Test
    public void testShouldCreateAnEmptyGrid() {
        Move[][] expectedGrid = new Move[Constraint.lengthOfGridSide][Constraint.lengthOfGridSide];

        Move[][] actualGrid = Grid.create();

        assertTrue(checkIfGridsAreEqual(expectedGrid, actualGrid));
    }

    @Test
    public void testShouldPlaceMoveXOnUpperLeftMostCornerOfGrid() {
        Grid grid = new Grid();

        grid.place(Move.X, 1, 1);

        assertEquals(Move.X, grid.getMoveAtPosition(1, 1));
    }

    @Test
    public void testShouldPlaceMoveYOnUpperLeftMostCornerOfGrid() {
        Grid grid = new Grid();

        grid.place(Move.O, 1, 1);

        assertEquals(Move.O, grid.getMoveAtPosition(1, 1));
    }

    @Test
    public void testShouldPlaceMoveXOnLowerRightMostCornerOfGrid() {
        Grid grid = new Grid();

        grid.place(Move.X, Constraint.lengthOfGridSide, Constraint.lengthOfGridSide);

        assertEquals(Move.X, grid.getMoveAtPosition(Constraint.lengthOfGridSide, Constraint.lengthOfGridSide));
    }

    @Test
    public void testShouldDenoteGameOverWhenAllEntriesInTopRowHasMoveX() {
        Grid grid = new Grid();

        grid.place(Move.X, 1, 1);
        grid.place(Move.X, 1, 2);
        grid.place(Move.X, 1, 3);

        assertTrue(grid.gameOver());
    }

    @Test
    public void testShouldDenoteGameNotOverWhenTwoEntriesInTopRowHasMoveX() {
        Grid grid = new Grid();

        grid.place(Move.O, 1, 1);
        grid.place(Move.X, 1, 1);
        grid.place(Move.X, 1, 1);

        assertFalse(grid.gameOver());
    }

    @Test
    public void testShouldDenoteGameOverWhenAllEntriesInFirstColumnHasMoveX() {
        Grid grid = new Grid();

        grid.place(Move.X, 1, 1);
        grid.place(Move.X, 2, 1);
        grid.place(Move.X, 3, 1);

        assertTrue(grid.gameOver());
    }

    @Test
    public void testShouldDenoteGameOverWhenAllEntriesInADiagonalHasMoveX() {
        Grid grid = new Grid();

        grid.place(Move.X, 1, 1);
        grid.place(Move.X, 2, 2);
        grid.place(Move.X, 3, 3);

        assertTrue(grid.gameOver());
    }


}