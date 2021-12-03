package pets_amok;


public class OrganicDog extends OrganicPet implements Walkable {


    int needsToPoopTick = 0; //meow meow

    public OrganicDog(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
//        this.needsToPoopTick = needsToPoopTick;
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


    public int Tick() {
        return 90000;
    }

    public boolean isCagePoopFull(int cagePoopTick) {
        int cagePoopVar = cagePoopTick;
        if (cagePoopVar >= 3){
            return true;
        }
        return false;
    }

}