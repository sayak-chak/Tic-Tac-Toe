import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Move[][] expectedGrid = new Move[RULE.lengthOfGridSide][RULE.lengthOfGridSide];

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

        grid.place(Move.Y, 1, 1);

        assertEquals(Move.Y, grid.getMoveAtPosition(1, 1));
    }

    @Test
    public void testShouldPlaceMoveXOnLowerRightMostCornerOfGrid() {
        Grid grid = new Grid();

        grid.place(Move.X, RULE.lengthOfGridSide, RULE.lengthOfGridSide);

        assertEquals(Move.X, grid.getMoveAtPosition(RULE.lengthOfGridSide, RULE.lengthOfGridSide));
    }


}