
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class mainTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private main elevador;

    @Before
    public void before() {
        elevador = new main();
    }

    @Test
    public void unaPersonaEnElElvador() {
        elevador.personaSubiendoAlElevador();
        exception.expect(Exception.class);
        elevador.personaSubiendoAlElevador();
    }

    @Test
    public void ArribaLuegoAbajo() {
        assertEquals(3, elevador.movimientoDelElevador(1, 3));
        assertEquals(1, elevador.movimientoDelElevador(3, 1));
        assertEquals(3, elevador.movimientoDelElevador(2, 3));
        assertEquals(1, elevador.movimientoDelElevador(2, 1));

    }

    @Test
    public void CapacidadDeTresPersonas() {
        int floors = 3;
        assertEquals(floors, elevador.getPisos());
    }

    @Test
    public void PrimerPiso() {
        assertFalse(elevador.getEstadoDelElevador());
    }

    @Test
    public void PersonaEnElElevador() throws Exception {
        elevador.personaEnElElevador(1);
    }
}
