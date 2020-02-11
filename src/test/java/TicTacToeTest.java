import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class TicTacToeTest {
    Grid grid;
    Player playerOne;
    Player playerTwo;
    TicTacToe ticTacToe;

    @BeforeEach
    public void initialize() {
        grid = mock(Grid.class);
        playerOne = mock(Player.class);
        playerTwo = mock(Player.class);
        ticTacToe = new TicTacToe(grid, playerOne, playerTwo);
    }

    @AfterEach
    public void close() {
        grid = null;
        playerTwo = null;
        ticTacToe = null;
    }

    @Test
    public void testShouldDenoteGameOverWhenAllEntriesInTopRowHasMoveX() {
        assertTrue(ticTacToe.gameOver());
    }
}