import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.*;

public class personaTest {
    private persona persona;


    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Before
    public void before() {
        persona = new persona();
    }


    @Test
    public void PersonaEnUnPiso(){
        persona.CrearPersona();
        assertTrue(1 <= persona.CrearPersona() && persona.CrearPersona() <= 3);
    }


    @Test
    public void PisosIguales() {
        persona.llamarAlElevador();
    }
}
