package pets_amok;

public class OrganicPet extends VirtualPet{

    public int needsToPoop;

    public OrganicPet(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
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

    public void feedPet(VirtualPet myVirtualPet) {
        myVirtualPet.increaseHealthLevel(10);
    }


    public void walkPet(VirtualPet myVirtualPet) {
        myVirtualPet.decreaseHealthLevel(10);
    }


}
