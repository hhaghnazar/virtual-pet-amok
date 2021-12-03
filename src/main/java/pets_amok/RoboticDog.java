package pets_amok;

public class RoboticDog extends RoboticPet implements Walkable {


    private int rustAttackTick = 0;

    public RoboticDog(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
        this.rustAttackTick = rustAttackTick;
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

    public boolean checkRustLevel(int rustLevel) {

        int rustLevelVar = rustLevel;
        if (rustLevelVar >= 3) {
            return true;
        }
        return false;
    }

}
