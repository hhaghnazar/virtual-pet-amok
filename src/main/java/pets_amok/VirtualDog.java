package pets_amok;

public class VirtualDog extends VirtualPet implements Walkable,VirtualAnimals {

//    private int restlessnessTick;

    public VirtualDog(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
//        this.restlessnessTick = restlessnessTick;
    }

    @Override
    public void feedPet(VirtualPet myVirtualPet) {
        myVirtualPet.increaseHealthLevel(10);
    }

    @Override
    public void walkPet(VirtualPet myVirtualPet) {
        myVirtualPet.decreaseHealthLevel(10);
    }

    @Override
    public void dogGetsWalked(VirtualPet myVirtualPet) {
        myVirtualPet.increaseHealthLevel(15);
    }

    @Override
    public void tick() {

    }

    public boolean isCagePoopFull(int cagePoopTick) {
//        int cagePoopVar = cagePoopTick;
//        if (cagePoopVar >= 3){
//            return true;
//        }
        return false;
    }

    @Override
    public void canBeFedAndWatered() {

    }
}
