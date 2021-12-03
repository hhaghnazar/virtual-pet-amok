package pets_amok;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {


    private VirtualPetShelter underTest;
    private OrganicCat myOrganicCat;
    private OrganicDog myOrganicDog;
    private RoboticCat myRoboticCat;
    private RoboticDog myRoboticDog;
    private VirtualCat myVirtualCat;
    private VirtualDog myVirtualDog;

    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        myOrganicCat = new OrganicCat("garfield","organic", "cat", 50,50,50,50,50,"is Happy");
        myOrganicDog = new OrganicDog("lassie", "organic", "dog", 50, 50, 50, 50, 50, "is Happy");
        myRoboticCat = new RoboticCat("marley", "robotic", "cat", 50, 50, 50, 50, 50, "is Happy");
        myRoboticDog = new RoboticDog("jimmy", "robotic", "dog", 50, 50, 50, 50, 50, "is Happy");
        myVirtualCat = new VirtualCat("carrie", "virtual", "cat", 50, 50, 50, 50, 50, "is Happy");
        myVirtualDog = new VirtualDog("mrwoofwoof", "virtual", "dog", 100, 50, 50, 50, 50, "is Happy");
    }

    @Test
    public void shouldBeAbleToAdd6WhenWalked(){
        underTest.add(myOrganicCat);
        underTest.add(myOrganicDog);
        underTest.getWalkablePets();
        assertEquals(50, myOrganicCat.getHappiness());
        assertEquals(56, myOrganicDog.getHappiness());

    }


    @Test
    public void shouldBeAbleToAddPet(){
        underTest.add(myOrganicCat);
        VirtualPet newVirtualPet = underTest.findPet("garfield");
        assertEquals("garfield", newVirtualPet.getName());
    }




    @Test
    public void shouldBeAbleToAdd3Pets(){
        underTest.add(myRoboticDog);
        underTest.add(myVirtualDog);
        underTest.add(myOrganicDog);
        VirtualPet foundOrganicDog = underTest.findPet("lassie");
        VirtualPet foundRoboticDog = underTest.findPet("jimmy");
        VirtualPet foundVirtualDog = underTest.findPet("mrwoofwoof");
        assertEquals("lassie", foundOrganicDog.getName());
        assertEquals("jimmy", foundRoboticDog.getName());
        assertEquals("mrwoofwoof", foundVirtualDog.getName());
    }

    @Test
    public void shouldBeAbleToAddAFewPets(){
        underTest.add(myOrganicCat);
        underTest.add(myOrganicDog);
        underTest.add(myRoboticCat);
        underTest.add(myRoboticDog);
        underTest.add(myVirtualCat);
        underTest.add(myVirtualDog);
        Collection<VirtualPet> petsThatHaveBeenAdded = underTest.getAllPets();
        assertThat(petsThatHaveBeenAdded, containsInAnyOrder(myOrganicCat,myOrganicDog,myRoboticCat,myRoboticDog,myVirtualCat,myVirtualDog));
    }


    @Test
    public void shouldBeAbleToRemove2Pets(){
        underTest.add(myOrganicCat);
        underTest.add(myOrganicDog);
        underTest.remove(myOrganicCat);
        underTest.remove(myOrganicDog);
        assertEquals(0,underTest.pets.size());
    }

    @Test
    public void shouldReturnAPetInTheShelter(){
        underTest.add(myOrganicCat);
        VirtualPet x = underTest.pets.get("garfield");
        assertEquals(myOrganicCat, x);
    }

    @Test
    public void shouldReturnHealthValue(){
        underTest.add(myOrganicCat);
        VirtualPet x = underTest.pets.get("garfield");
        assertEquals(50, x.getHealth());
    }

    @Test
    public void shouldReturnHappinessValue(){
        underTest.add(myOrganicCat);
        VirtualPet x = underTest.pets.get("garfield");
        assertEquals(50, x.getHappiness());
    }

    @Test
    public void shouldReturnMoodValue(){
        underTest.add(myOrganicCat);
        VirtualPet x = underTest.pets.get("garfield");
        assertEquals("is Happy", x.getPetMood());   }

    @Test
    public void shouldReturnFeedValueAfterFeeding(){
        underTest.add(myOrganicCat);
        underTest.feed();
        assertEquals(49, myOrganicCat.getHunger());
    }

    @Test
    public void shouldReturnWaterValueAfterWater(){
        underTest.add(myOrganicCat);
        underTest.water();
        assertEquals(49, myOrganicCat.getThirst());
    }


    @Test
    public void shouldReturnHealthCalculation(){
        underTest.add(myVirtualDog);
        VirtualPet x = underTest.pets.get("mrwoofwoof");
        assertEquals(100,x.getHealthCalculation());
    }





}
