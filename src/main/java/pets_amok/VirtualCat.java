package pets_amok;

public class VirtualCat extends VirtualPet implements LitterBoxable, VirtualAnimals {

    private int restlessnessTick;

    public VirtualCat(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
        this.restlessnessTick = restlessnessTick;
    }

    @Override
    public void tick() {

    }
    @Override
    public void canBeFedAndWatered(){

    }


//
//    public void feedPet(VirtualPet myVirtualPet) {
//        myVirtualPet.increaseHealthLevel(5);
//    }
//
//    public void walkPet(VirtualPet myVirtualPet) {
//        myVirtualPet.decreaseHealthLevel(5);
//    }

    @Override
    public boolean isLitterBoxFull(int litterBoxTick) {
        int litterBoxVar = litterBoxTick;
        if (litterBoxVar >= 3){
            return true;
        }
        return false;
    }
}
