package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticDogTest {

    RoboticDog underTest = new RoboticDog("foxtrot","organic", "dog", 50, 50, 50, 50, 50, "is happy");




    @Test
    public void roboticAnimalBecomesRusty(){
        int rustiness = 3;
        boolean isRusty = underTest.checkRustLevel(rustiness);
        assertEquals(true, underTest.checkRustLevel(rustiness));
    }


    @Test
    public void roboticAnimalRustCheck(){
        int rustiness = 2;
        boolean isRusty = underTest.checkRustLevel(rustiness);
        assertEquals(false, underTest.checkRustLevel(rustiness));
    }


}
