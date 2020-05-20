package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BishopBlackTest {
    private BishopBlack bishopBlack = new BishopBlack(Cell.C1);

    @Test
    public void testPosition() {
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void testWay() {
        assertThat(bishopBlack.way(Cell.C1, Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void testNotDiagonalY() {
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.C3), is(false));
    }

    @Test
    public void testNotDiagonalX() {
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.E1), is(false));
    }

    @Test
    public void testIsDiagonal() {
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.F4), is(true));
    }

    @Test
    public void testCopy() {
        assertThat(bishopBlack.copy(Cell.E3).position(), is(Cell.E3));
    }
}