package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest)
            );
        }
        int size = dest.y - source.y;
        Cell[] steps = new Cell[size];
        int deltaX = findDeltaX(source.x, dest.x);
        int deltaY = findDeltaY(source.y, dest.y);
        for (int i = 0; i < size; i++) {
            int x = i + deltaX + source.x;
            int y = i + deltaY;
            steps[i] = Cell.findBy(x, y);
        }
        return steps;
    }

    private int findDeltaY(int sourceY, int destY) {
        int deltaY = -1;
        if (destY - sourceY >= 0) {
            deltaY = 1;
        }
        return deltaY;
    }

    private int findDeltaX(int sourceX, int destX) {
        int deltaX = -1;
        if (destX - sourceX >= 0) {
            deltaX = 1;
        }
        return deltaX;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean diagonal = true;
        if (dest.x - source.x == 0 || dest.y - source.y == 0) {
            diagonal = false;
        }
        return diagonal;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
