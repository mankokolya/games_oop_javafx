package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {
    private Logic logic = new Logic();
//    @Ignore
    @Test
    public void move() {
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenLineOccupied() {
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenStartCellEmpty() {
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.B1, Cell.H6);
        assertThat(rsl, is(false));
    }
}