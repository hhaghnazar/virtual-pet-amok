package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualDogTest {

    VirtualDog underTest = new VirtualDog("lassie","organic", "dog", 50, 50, 50, 50, 50, "is happy");



    @Test
    public void cagePoopIsNotFull(){
        int cagePoopTick = 2;
        boolean cagePoopTickTest = underTest.isCagePoopFull(cagePoopTick);
        assertEquals(false, underTest.isCagePoopFull(cagePoopTick));
    }


}
