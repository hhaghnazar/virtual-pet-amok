package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("garfield", "organic", "cat", 50, 50, 50, 50, 50, "is happy");



    @Test
    public void litterBoxIsFull(){
        int litterBoxTick = 3;
        boolean litterBoxTickTest = underTest.isLitterBoxFull(litterBoxTick);
        assertEquals(true, underTest.isLitterBoxFull(litterBoxTick));
    }

    @Test
    public void litterBoxIsNotFull(){
        int litterBoxTick = 2;
        boolean litterBoxTickTest = underTest.isLitterBoxFull(litterBoxTick);
        assertEquals(false, underTest.isLitterBoxFull(litterBoxTick));
    }
}
