import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PlayerTest {
    Player player;
    Grid grid;

    @BeforeEach
    private void initialize() {
        grid = mock(Grid.class);
        player = new Player(grid);
    }

    @AfterEach
    private void close() {
        player = null;
        grid = null;
    }

    @Test
    public void playerShouldPlaceMoveXInLeftMostCornerOfGrid() {
        player.place();

        verify(grid, times(1)).place(Move.X, 1, 1);

    }
}