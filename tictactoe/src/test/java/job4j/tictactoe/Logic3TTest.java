package job4j.tictactoe;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class Logic3TTest {

    @Test
    public void whenHasXWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkX), is(true));
    }


    @Test
    public void whenNotFill() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkX), is(false));
        assertThat(login.isWin(Figure3T::hasMarkO), is(false));
    }

    @Test
    public void whenHasXHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkX), is(true));
    }

    @Test
    public void whenHasOHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkO), is(true));
    }

    @Test
    public void whenHasXVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkX), is(true));
    }

    @Test
    public void whenHasOVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkO), is(true));
    }

    @Test
    public void whenHasXBackDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkX), is(true));
    }

    @Test
    public void whenHasOXWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T(false, true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWin(Figure3T::hasMarkO), is(true));
    }

    @Test
    public void whenHasGap() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(true));
    }

    @Test
    public void whenFull() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(false, true)},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(true, false)},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(false, true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(false));
    }
}
