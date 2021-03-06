import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PlayerTest {
    Player player;
    Grid grid;

    @BeforeEach
    public void initialize() {
        grid = mock(Grid.class);
        player = new Player(grid);
    }

    @AfterEach
    public void close() {
        player = null;
        grid = null;
    }

    @Test
    public void playerShouldPlaceMoveXInUpperLeftMostCornerOfGrid() {
        player.place(Move.X, 1, 1);

        verify(grid, times(1)).place(Move.X, 1, 1);

    }

    @Test
    public void playerShouldPlaceMoveYInUpperLeftMostCornerOfGrid() {
        player.place(Move.O, 1, 1);

        verify(grid, times(1)).place(Move.O, 1, 1);

    }

    @Test
    public void playerShouldPlaceMoveXInLowerRightMostCornerOfGrid() {
        player.place(Move.X, Constraint.lengthOfGridSide, Constraint.lengthOfGridSide);

        verify(grid, times(1)).place(Move.X, Constraint.lengthOfGridSide, Constraint.lengthOfGridSide);
    }

}