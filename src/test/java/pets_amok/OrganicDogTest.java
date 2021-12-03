package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

    OrganicDog underTest = new OrganicDog("marley", "organic", "dog", 50, 50, 50, 50, 50, "is happy");


    @Test
    public void cagePoopIsFull(){
        int cagePoopTick = 3;
        boolean cagePoopTickTest = underTest.isCagePoopFull(cagePoopTick);
        assertEquals(true, underTest.isCagePoopFull(cagePoopTick));
    }

    @Test
    public void cagePoopIsNotFull(){
        int cagePoopTick = 2;
        boolean cagePoopTickTest = underTest.isCagePoopFull(cagePoopTick);
        assertEquals(false, underTest.isCagePoopFull(cagePoopTick));
    }


}
