package pets_amok;

public class RoboticPet extends VirtualPet{

    public RoboticPet(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
    }

    @Override
    public void tick(){}

    public void feedVirtualPet(){
        petHunger--;
    }

    public void waterVirtualPet(){
        petThirst--;
    }

}
